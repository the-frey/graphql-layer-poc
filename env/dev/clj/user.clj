(ns user
  (:require [mount.core :as mount]
            [graphql-layer-poc.figwheel :refer [start-fw stop-fw cljs]]
            graphql-layer-poc.core))

(defn start []
  (mount/start-without #'graphql-layer-poc.core/repl-server))

(defn stop []
  (mount/stop-except #'graphql-layer-poc.core/repl-server))

(defn restart []
  (stop)
  (start))


