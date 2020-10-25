(defproject discover-weekly-retriever "0.1.0-SNAPSHOT"
  :description "A Clojure application that retrieves a discover-weekly playlist and adds its songs to a separate playlist."

  :url "https://github.com/LucianaMarques/discover-weekly-retriever"

  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :repositories  [["central"  {:url "https://repo1.maven.org/maven2/" :snapshots false}]
                  ["clojars"  {:url "https://clojars.org/repo/"}]]

  :plugins [[lein-ancient "0.6.15"]]

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clj-http "3.10.0"]
                 [com.stuartsierra/component "1.0.0"]
                 [com.stuartsierra/dependency "1.0.0"]
                 [cli-matic "0.3.11"]]

  :repl-options {:init-ns discover-weekly-retriever.cli}

  :source-paths ["src"]

  :test-paths ["test/unit" "test/integration"]

  :resource-paths ["resources"]

  :profiles {:uberjar     {:aot :all}

             :user        {:plugins [[lein-ancient "0.6.15"]]}

             :cli         {:resource-paths ["resources"]}

             :unit        {:test-paths ^:replace ["test/unit/"]}

             :integration {:test-paths ^:replace ["test/integration/"]}

             :nrepl       {:dependencies [[nrepl/nrepl "0.6.0"]]}}

  :aliases {"xablau" ["with-profile" "+user" "run" "-m" "discover-weekly-retriever.cli" "xablau"]}

  :main ^:skip-aot discove-weekly-retriever.cli)
