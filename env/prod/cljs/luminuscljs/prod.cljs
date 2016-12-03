(ns luminuscljs.app
  (:require [luminuscljs.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
