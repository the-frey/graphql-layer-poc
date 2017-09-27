(ns graphql-layer-poc.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [graphql-layer-poc.layout :refer [error-page]]
            [graphql-layer-poc.routes.home :refer [home-routes]]
            [compojure.route :as route]
            [graphql-layer-poc.env :refer [defaults]]
            [mount.core :as mount]
            [graphql-layer-poc.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))


(defn app [] (middleware/wrap-base #'app-routes))
