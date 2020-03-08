(ns discover-weekly-retriever.http-client
  (:require [clj-http.client :as client]
            [clojure.string :as str]))

(def base-url "https://api.spotify.com/v1")

(def spotify-uri "spotify:user:22oaqqtlz7vh26hghdmd5wf3q")

(defn get-spotify-id [spotify-uri]
  (-> spotify-uri (str/split #":") (peek)))

(defn get-user []
  (client/request
   {:url (str base-url "v1/users/" (get-spotify-id spotify-uri))
   :method :get
   :basic-auth token}))

(comment
 (get-user)
 (print *e))


