(ns {{name}}.test.core
  (:require-macros [cemerick.cljs.test
                    :refer (is deftest with-test run-tests testing test-var)])
  (:require [cemerick.cljs.test :as t]))

(deftest test-should-fail
  (testing "This should fail"
    (is (= true (not true)))))

