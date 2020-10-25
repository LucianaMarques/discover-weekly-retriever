(ns discover-weekly-retriever.cli
  (:gen-class)
  (:require [cli-matic.core :as cli-matic]
            [discover-weekly-retriever.controller.spotify :as c-spotify]))

(defn save-weekly-list! [username]
  (print "im here")
  (c-spotify/hey-list username))

(def configuration
  {:command     "list"
   :description "apply dynamoDB provisioning recommendations"
   :subcommands [{:command     "list"
                  :description "apply dynamoDB provisioning recommendations"
                  :opts        [{:option  "username"
                                 :short   0
                                 :as      ".csv recommendations file path"
                                 :type    :string
                                 :default :present}]
                  :runs        save-weekly-list!}]
   :runs        save-weekly-list!})

(defn -main [& args]
  (cli-matic/run-cmd args configuration))
