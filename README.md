upstrack
========

Simple tool to retrieve UPS tracking information given a tracking number.
The example of script's output is shown below.

    ========================================================================================================================
    Location                      | Date       | Local Time | Activity
    ========================================================================================================================
    Kiev, Ukraine                 | 12/05/2011 | 11:53 A.M. | Import Scan
                                  | 12/05/2011 | 10:29 A.M. | Package data processed by brokerage. Waiting for clearance.
                                  | 12/05/2011 | 9:52 A.M.  | Package data processed by brokerage. Waiting for clearance.
    Kiev, Ukraine                 | 11/21/2011 | 11:30 A.M. | The receiver did not want the order and refused this delivery.
    Kiev, Ukraine                 | 11/16/2011 | 9:55 A.M.  | The receiver did not want the order and refused this delivery.
    Kiev, Ukraine                 | 11/08/2011 | 10:43 A.M. | Package data processed by brokerage. Waiting for clearance.
    Kiev, Ukraine                 | 11/07/2011 | 12:09 P.M. | Import Scan
                                  | 11/07/2011 | 10:59 A.M. | Package data processed by brokerage. Waiting for clearance.
    Warsaw, Poland                | 11/07/2011 | 5:05 A.M.  | Arrival Scan
    Koeln, Germany                | 11/07/2011 | 3:23 A.M.  | Departure Scan
    Koeln, Germany                | 11/06/2011 | 4:57 P.M.  | Arrival Scan
    Louisville, KY, United States | 11/06/2011 | 2:49 A.M.  | Departure Scan
    Louisville, KY, United States | 11/05/2011 | 5:05 A.M.  | Departure Scan
                                  | 11/05/2011 | 3:16 A.M.  | Export Scan
                                  | 11/05/2011 | 2:02 A.M.  | Arrival Scan
    Phoenix, AZ, United States    | 11/04/2011 | 7:53 P.M.  | Departure Scan
                                  | 11/04/2011 | 6:58 P.M.  | Arrival Scan
                                  | 11/04/2011 | 6:17 P.M.  | Departure Scan
                                  | 11/04/2011 | 5:46 P.M.  | Origin Scan
    United States                 | 11/04/2011 | 6:52 P.M.  | Order Processed: Ready for UPS
    ========================================================================================================================

Special thanks to blacktaxi who helped me to get my feet wet in a world of Clojure. :)

Usage
-----

lein run <tracking number>

License
-------
This software is provided as is, without any warranties, and you may do whatever the hell you want with it.
