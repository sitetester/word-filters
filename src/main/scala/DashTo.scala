object DashTo {

  def camel(str: String): String = {
    val pascalCase = pascal(str)
    pascalCase.head.toLower + pascalCase.substring(1)
  }

  def pascal(str: String): String = {
    str.split("-").map(w => w.head.toUpper + w.tail).mkString
  }

  def underscore(str: String): String = {
    str.replaceAll("-", "_")
  }

  def separator(str: String): String = {
    str.replaceAll("-", " ")
  }

}
