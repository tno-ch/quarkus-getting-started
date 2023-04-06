#!/bin/sh

export HTTP_PORT=8080
export DEBUG_PORT=5013

echo "****************************************************************"
echo "** Starting Quarkus Dev Server - Transactions"
echo "** Using HTTP Port         : $HTTP_PORT"
echo "** Using Debug port        : $DEBUG_PORT"
echo "****************************************************************"

mvn clean quarkus:dev -Dquarkus.http.port=$HTTP_PORT -Ddebug=$DEBUG_PORT
