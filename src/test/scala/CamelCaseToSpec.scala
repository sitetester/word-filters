import org.scalatest.flatspec.AnyFlatSpec

class CamelCaseToSpec extends AnyFlatSpec {

  it should "convert `thisIsMyContent` to `ThisIsMyContent`" in {
    assert(CamelCaseTo.pascal("thisIsMyContent") == "ThisIsMyContent")
  }

  it should "convert `thisIsMyContent` to `This-Is-My-Content`" in {
    assert(CamelCaseTo.dash("thisIsMyContent") == "this-Is-My-Content")
  }

  it should "convert `thisIsMyContent` to `this_Is_My_Content`" in {
    assert(CamelCaseTo.underscore("thisIsMyContent") == "this_Is_My_Content")
  }

  it should "convert `thisIsMyContent` to ` Is My Content`" in {
    assert(CamelCaseTo.separator("thisIsMyContent") == "this Is My Content")
  }

}
