(ns graphql-layer-poc.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [graphql-layer-poc.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[graphql-layer-poc started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[graphql-layer-poc has shut down successfully]=-"))
   :middleware wrap-dev})
