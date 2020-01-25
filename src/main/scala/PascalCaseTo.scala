object PascalCaseTo {

  def camel(str: String): String = {
    str.split("-").map(w => w.head.toLower + w.tail).mkString
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
