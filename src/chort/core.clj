(ns chort.core
  (:import (java.io File))
  (:require (fleetdb [embedded :as embedded])))

(println "Starting up chort")

(defrecord Link [url, code, date])

(defn uuid[] 
  "Get simple UUID string"
  (.toString (java.util.UUID/randomUUID)))


(defn shorten[url]
  "Shorten URL and return the code"
  if(already-shortened url)
    (get-short-url url)
    (shorten url)))

(defn already-shortened[url]
  "Check if we already have a record of the url"
  (not (nil? (*url-db* url))))
    
(defn get-short-url[url]
  "Get short url from db"
  (*url-db* url))

(defn shorten[url]
  "Shorten url and add to db"
  (let [code (Long/toHexString (rand-int 9999999))
        record (Link. url code (java.util.Date.)) ]
    "XXX: Save to db"
    )

  )
