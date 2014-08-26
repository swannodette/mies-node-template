(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]
            [com.cemerick/clojurescript.test "0.3.1"]]

  :hooks [leiningen.cljsbuild]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "{{name}}"
              :source-paths ["src"]
              :compiler {
                :output-to "out/{{sanitized}}.js"
                :output-dir "out"
                :target :nodejs
                :optimizations :none
                :source-map true}}
             {:id "test"
              :source-paths ["src" "test"]
              :compiler {
                :output-to "out/{{sanitized}}-testable.js"
                :output-dir "out/test"
                :target :nodejs
                :optimizations :simple
                :hashbang false}}]
              :test-commands {"unit-tests" ["node" :node-runner
                                            "out/{{sanitized}}-testable.js"]}})
