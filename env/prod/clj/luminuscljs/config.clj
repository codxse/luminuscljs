(ns luminuscljs.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[luminuscljs started successfully]=-"))
   :middleware identity})
