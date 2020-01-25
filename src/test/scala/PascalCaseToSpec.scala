import org.scalatest.flatspec.AnyFlatSpec

class PascalCaseToSpec extends AnyFlatSpec {

  it should "convert `ThisIsMyContent` to `thisIsMyContent`" in {
    assert(PascalCaseTo.camel("ThisIsMyContent") == "thisIsMyContent")
  }

  it should "convert `ThisIsMyContent` to `This-Is-My-Content`" in {
    assert(PascalCaseTo.dash("ThisIsMyContent") == "This-Is-My-Content")
  }

  it should "convert `ThisIsMyContent` to `this_Is_My_Content`" in {
    assert(PascalCaseTo.underscore("ThisIsMyContent") == "This_Is_My_Content")
  }

  it should "convert `ThisIsMyContent` to This Is My Content" in {
    assert(PascalCaseTo.separator("ThisIsMyContent") == "This Is My Content")
  }
}
