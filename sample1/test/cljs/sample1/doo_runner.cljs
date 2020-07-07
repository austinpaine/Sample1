(ns sample1.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [sample1.core-test]))

(doo-tests 'sample1.core-test)

