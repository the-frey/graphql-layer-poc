(ns graphql-layer-poc.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [graphql-layer-poc.core-test]))

(doo-tests 'graphql-layer-poc.core-test)

