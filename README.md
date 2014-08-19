
This is a simplified, self-contained reproducer for an issue with the setup of the Spring context when using Apache Camel.

Note that the failure happens somewhat nondeterministically.
It takes me roughly 5 - 20 times of `mvn clean install` to make it fail.