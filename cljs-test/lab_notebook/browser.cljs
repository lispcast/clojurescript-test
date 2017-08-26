(ns lab-notebook.browser
  (:require [doo.runner :refer-macros [doo-tests]]
            [lab-notebook.core-test]))

(doo-tests 'lab-notebook.core-test)
