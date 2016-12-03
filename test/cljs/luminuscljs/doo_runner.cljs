(ns luminuscljs.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [luminuscljs.core-test]))

(doo-tests 'luminuscljs.core-test)

