(ns ^:figwheel-always brave-and-true.core
    (:require))

(enable-console-print!)

(println "I AM FUCKIN AWESOME.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))


