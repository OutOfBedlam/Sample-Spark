import sbt.Def
import sbt.Keys._

object Commons {

  val settings: Seq[Def.Setting[_]] = Seq(
    organization := "com.uangel",
    version := "1.0-Snapshot",
    scalaVersion := "2.11.8"
  )
}