(defproject clojurescript-test "0.1.0-SNAPSHOT"
  :description "Part of PurelyFunctional.tv"
  :url "https://purelyfunctional.tv/"
  :license {:name "CC0 1.0 Universal (CC0 1.0) Public Domain Dedication"
            :url "http://creativecommons.org/publicdomain/zero/1.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.439"]]
  :plugins [[lein-doo "0.1.10"]]

  :cljsbuild {:builds
              {:browser-test {:source-paths ["cljs-src" "cljs-test"]
                              :compiler {:output-to "out/browser_tests.js"
                                         :main lab-notebook.browser
                                         :optimizations :none}}}})
