enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.8" // or any other Scala version >= 2.10.2

// core = essentials only. No bells or whistles.
libraryDependencies ++= Seq("com.github.japgolly.scalajs-react" %%% "core" % "0.11.2",
  "com.github.japgolly.scalajs-react" %%% "extra" % "0.11.1",
  "com.github.chandu0101.scalajs-react-components" %%% "core" % "0.5.0")

scalaJSUseRhino in Global := false

// React JS itself (Note the filenames, adjust as needed, eg. to remove addons.)
jsDependencies ++= Seq(

  "org.webjars.bower" % "react" % "15.3.2"
    /        "react-with-addons.js"
    minified "react-with-addons.min.js"
    commonJSName "React",

  "org.webjars.bower" % "react" % "15.3.2"
    /         "react-dom.js"
    minified  "react-dom.min.js"
    dependsOn "react-with-addons.js"
    commonJSName "ReactDOM",

  "org.webjars.bower" % "react" % "15.3.2"
    /         "react-dom-server.js"
    minified  "react-dom-server.min.js"
    dependsOn "react-dom.js"
    commonJSName "ReactDOMServer")
