import sbt.Keys._


lazy val root = (project in file("."))
  .settings(Commons.settings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "org.apache.spark" % "spark-core_2.11" % "2.0.2"
    ))
  .settings(
    name := "Sample-Spark"
  )
