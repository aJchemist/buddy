(defproject buddy "0.3.0-SNAPSHOT"
  :description "Security library for Clojure"
  :url "https://github.com/niwibe/buddy"
  :license {:name "BSD (2-Clause)"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[buddy/buddy-core "0.3.0-SNAPSHOT"]
                 [buddy/buddy-sign "0.3.0-SNAPSHOT"]
                 [buddy/buddy-auth "0.3.0-SNAPSHOT"]
                 [buddy/buddy-hashers "0.3.0-SNAPSHOT"]]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"])
