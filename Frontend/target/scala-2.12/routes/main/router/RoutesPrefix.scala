// @GENERATOR:play-routes-compiler
// @SOURCE:C:/NationSwitch/Frontend/conf/routes
// @DATE:Sun Dec 12 20:39:50 CST 2021


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
