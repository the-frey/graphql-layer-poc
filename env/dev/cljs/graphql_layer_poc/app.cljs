(ns ^:figwheel-no-load graphql-layer-poc.app
  (:require [graphql-layer-poc.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
