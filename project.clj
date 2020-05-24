(defproject discover-weekly-retriever "0.1.0-SNAPSHOT"
  :description "A Clojure application that retrieves a discover-weekly playlist and adds its songs to a separate playlist."
  :url "https://github.com/LucianaMarques/discover-weekly-retriever"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-http "3.10.0"]
                 [com.stuartsierra/component "1.0.0"]
                 [com.stuartsierra/dependency "1.0.0"]]
  :repl-options {:init-ns discover-weekly-retriever.core})
