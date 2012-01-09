(ns upstrack.core
  (:require [clj-http.client :as client]
            [clojure.pprint :as pprint]))

;(def *default-id* "1Z173E3W0402086345")

(defn send-request [id]
  "Send HTTP request containing shipping id to the UPS tracking web site"
  (:body (client/post "http://wwwapps.ups.com/WebTracking/track"
        {:query-params {"trackNums" id
                        "track.x" "Track"} })))

(defn table-from-html [html]
  "Returns list of <tr/> elements within the HTML table which contains shipping history."
  (-> (.select
        (org.jsoup.Jsoup/parse html)
        "div#main div.secBody table.dataTable tbody tr")
      .toArray seq))

(defn print-table! [elements]
  "Prints a neat table of the shipping history."
  (if (empty? elements)
    (println "Invalid ID or something.")
    (let [el-seq (map (fn [<tr>]
                        (map (fn
                               [<td>] (.text <td>))
                             (-> <tr> .children .toArray seq)))
                      elements)]
      (let [ks (-> el-seq first)]
        (pprint/print-table
          ks
          (map #(apply hash-map (interleave ks %)) (rest el-seq)))))))

(defn -main [& args]
  (if-let [*id* (first args)]
    (-> *id* send-request table-from-html print-table!)
    (println "Usage: upstrack <tracking_id>")))