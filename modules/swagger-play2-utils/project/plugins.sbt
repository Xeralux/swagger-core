resolvers ++= Seq(
    DefaultMavenRepository,
    Resolver.file("Local Play Repo", file("../../../Play20/repository/local"))(Resolver.ivyStylePatterns)
    // Resolver.url("Play", url("http://download.playframework.org/ivy-releases/"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("play" % "sbt-plugin" % "2.1-SNAPSHOT")

