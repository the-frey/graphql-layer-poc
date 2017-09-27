(ns graphql-layer-poc.app
  (:require [graphql-layer-poc.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
