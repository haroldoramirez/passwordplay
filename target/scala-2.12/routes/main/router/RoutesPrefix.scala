// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo.nobrega/projetos/passwordplay/conf/routes
// @DATE:Mon Jun 03 13:51:29 BRT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
