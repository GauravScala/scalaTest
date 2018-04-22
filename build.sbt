name := "untitled"

version := "0.1"

scalaVersion := "2.11.0"


libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.2.0",
  "org.apache.spark" % "spark-sql_2.11" % "2.2.0",
  "org.apache.spark" % "spark-streaming_2.11" % "2.2.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.2" % "test"

)