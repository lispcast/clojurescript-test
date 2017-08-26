(ns lab-notebook.core
  (:require [cljs.reader :as read])
  (:import goog.net.XhrIo))

(defn delete [v i]
  (into (subvec v 0 i) (subvec v (inc i))))

(defn ajax-get [url callback]
  (.send goog.net.XhrIo url (fn [e]
                              (callback
                               {:status (-> e .-target .getStatus)
                                :body   (-> e .-target .getResponseText)}))
         "GET" ""
         #js {"Accept" "application/edn"}))

