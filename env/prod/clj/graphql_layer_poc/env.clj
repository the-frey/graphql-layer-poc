(ns graphql-layer-poc.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[graphql-layer-poc started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[graphql-layer-poc has shut down successfully]=-"))
   :middleware identity})
