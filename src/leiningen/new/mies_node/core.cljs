(ns {{name}}.core
  (:require [cljs.nodejs :as nodejs]
            [figwheel.client :as fw]))

(nodejs/enable-util-print!)

(defn -main []
  (println "Hello world!"))

(set! *main-cli-fn* -main)

(fw/start {:on-jsload (fn [] (print "reloaded"))})
