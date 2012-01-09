(defproject upstrack "1.0.0-SNAPSHOT"
  :description  "Simple tool to track status of the UPS shipment."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clj-http "0.2.3"]
                 [org.jsoup/jsoup "1.6.1"]]
  :main upstrack.core)