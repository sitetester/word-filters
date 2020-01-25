object CamelCaseTo {

  def pascal(str: String): String = {
    str.head.toUpper + str.tail
  }

  def dash(str: String): String = {
    "([a-z])([A-Z])".r.replaceAllIn(str, "$1-$2")
  }

  def underscore(str: String): String = {
    "([a-z])([A-Z])".r.replaceAllIn(str, "$1_$2")
  }

  def separator(str: String): String = {
    "([a-z])([A-Z])".r.replaceAllIn(str, "$1 $2")
  }
}
