(ns tech.unravel.example-cool-mcp-server
  (:gen-class)
  (:require [babashka.json :as json]
            [io.modelcontext.clojure-sdk.stdio-server :as io-server]
            [me.vedang.logger.interface :as log]))

(def tool-example-cool-mcp-server
  {:name "example-cool-mcp-server",
   :description
   "A tool to do something interesting
   - Use when ...
   - Provide ... as inputs",
   :inputSchema {:type "object",
                 :properties {"example-input-name"
                              {:type "string",
                               :description
                               "Example name to save properties against"},
                              "example-input-rows"
                              {:type "array",
                               :items {:type "object"},
                               :description "Example input rows as objects"}},
                 :required ["example-input-name" "example-input-rows"]},
   :handler (fn [{:keys [name data]}]
              ;; I don't do a whole lot
              {:type "text", :text (format "I didn't do much: '%s'" name)})})

(def example-cool-mcp-server-spec
  {:name "example-cool-mcp-server",
   :version "1.0.0",
   :tools [tool-example-cool-mcp-server]})

(defn -main
  [& _args]
  (let [server-id (random-uuid)]
    (log/debug "[MAIN] Starting example-cool-mcp-server: " server-id)
    @(io-server/run! (assoc example-cool-mcp-server-server-spec :server-id server-id))))
