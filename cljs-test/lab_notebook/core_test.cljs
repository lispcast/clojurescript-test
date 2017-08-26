(ns lab-notebook.core-test
  (:require [cljs.test :refer-macros [async deftest is testing]]
            [lab-notebook.core :refer [delete ajax-get]]))

(deftest delete-test
  (is (= [] (delete [1] 0)))
  (is (= [2] (delete [1 2] 0)))
  (is (= [1 3] (delete [1 2 3] 1))))

(deftest ajax-get-test
  (async done
         (ajax-get "http://www.lispcast.com/"
                   (fn [response]
                     (is (= 200 (:status response)))
                     (done)))))
