lazy val akkaHttpVersion         = "10.1.8"
lazy val akkaVersion             = "2.5.21"
lazy val akkaHttpJson4sVersion   = "1.17.0"
lazy val json4sVersion           = "3.5.4"
lazy val scalaLoggingVersion     = "3.8.0"
lazy val enumeratumVersion       = "1.5.13"
lazy val enumeratumJson4sVersion = "1.5.14"
lazy val slickVersion            = "3.3.0"
lazy val enumeratumSlickVersion  = "1.5.15"
lazy val logbackVersion          = "1.2.3"

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "id.kawalc1",
      scalaVersion := "2.12.7"
    )),
  name := "crawler",
  libraryDependencies ++= Seq(
    "com.typesafe.akka"          %% "akka-http"            % akkaHttpVersion,
    "com.typesafe.akka"          %% "akka-http-spray-json" % akkaHttpVersion,
    "com.typesafe.akka"          %% "akka-http-xml"        % akkaHttpVersion,
    "com.typesafe.akka"          %% "akka-stream"          % akkaVersion,
    "com.typesafe.scala-logging" %% "scala-logging"        % scalaLoggingVersion,
    "de.heikoseeberger"          %% "akka-http-json4s"     % akkaHttpJson4sVersion,
    "org.json4s"                 %% "json4s-native"        % json4sVersion,
    "org.json4s"                 %% "json4s-ext"           % json4sVersion,
    "com.beachape"               %% "enumeratum"           % enumeratumVersion,
    "com.beachape"               %% "enumeratum-json4s"    % enumeratumJson4sVersion,
    "com.typesafe.slick"         %% "slick"                % slickVersion,
    "com.typesafe.slick"         %% "slick-hikaricp"       % slickVersion,
    "com.h2database"             % "h2"                    % "1.4.196",
    "org.postgresql"             % "postgresql"            % "42.2.5",
    "org.xerial"                 % "sqlite-jdbc"           % "3.7.2",
    "com.beachape"               %% "enumeratum-slick"     % enumeratumSlickVersion,
    "ch.qos.logback"             % "logback-classic"       % logbackVersion,
    "com.typesafe.akka"          %% "akka-http-testkit"    % akkaHttpVersion % Test,
    "com.typesafe.akka"          %% "akka-testkit"         % akkaVersion % Test,
    "com.typesafe.akka"          %% "akka-stream-testkit"  % akkaVersion % Test,
    "org.scalatest"              %% "scalatest"            % "3.0.5" % Test,
    "org.rogach"                 %% "scallop"              % "3.2.0"
  )
)
