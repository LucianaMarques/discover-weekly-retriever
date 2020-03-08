(ns discover-weekly-retriever.http-client
  (require [clj-http.client :as client]))

(defn call-client-head []
  (client/head "https://api.spotify.com/v1"))

(comment
 (call-client-head)
 (print *e))


