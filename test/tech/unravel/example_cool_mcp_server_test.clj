(ns tech.unravel.example-cool-mcp-server-test
  (:require [clojure.test :refer [deftest testing is]]
            [io.modelcontext.clojure-sdk.server :as server]
            [tech.unravel.example-cool-mcp-server :as sut]))

(deftest valid-server-spec
  (testing "Ensure that the server-spec is valid"
    (is (server/validate-spec! sut/example-cool-mcp-server-spec))))
