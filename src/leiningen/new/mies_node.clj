(ns leiningen.new.mies-node
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "mies-node"))

(defn mies-node [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["test/{{sanitized}}/test/core.cljs" (render "test.cljs" data)]
      ["run.js" (render "run.js" data)]
      [".gitignore" (render "gitignore" data)])))
