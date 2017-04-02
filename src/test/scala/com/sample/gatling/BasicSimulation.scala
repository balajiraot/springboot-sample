package com.sample.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BasicSimulation extends Simulation {

  val httpConf = http
    .baseURL("http://localhost:8080/") // Here is the root for all relative URLs
    .acceptHeader("application/json") // Here are the common headers

  val scn = scenario("Get Person") // A scenario is a chain of requests and pauses
    .exec(http("request_1")
    .get("services/api/person/1"))


  setUp(scn.inject(atOnceUsers(1)).protocols(httpConf))
}