object SeparatorTo {

  def camel(str: String): String = {
    val pascalCase = pascal(str)
    pascalCase.head.toLower + pascalCase.substring(1)
  }

  def pascal(str: String): String = {
    str.split("\\s+").map(w => w.head.toUpper + w.tail).mkString
  }

  def dash(str: String): String = {
    str.replaceAll(" ", "-")
  }

  def underscore(str: String): String = {
    str.replaceAll(" ", "_")
  }
}
