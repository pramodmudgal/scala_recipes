lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.mudgal",
      scalaVersion := "2.12.7"
    )),
    name := "scala_recipes"
  )


libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
