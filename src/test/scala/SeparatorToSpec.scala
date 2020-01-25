import org.scalatest.flatspec.AnyFlatSpec

class SeparatorToSpec extends AnyFlatSpec {

  it should "convert `This Is My Content` to `ThisIsMyContent`" in {
    assert(SeparatorTo.pascal("This Is My Content") == "ThisIsMyContent")
  }

  it should "convert `This Is My Content` to `thisIsMyContent`" in {
    assert(SeparatorTo.camel("This Is My Content") == "thisIsMyContent")
  }

  it should "convert `This Is My Content` to `This-Is-My-Content`" in {
    assert(SeparatorTo.dash("This Is My Content") == "This-Is-My-Content")
  }

  it should "convert `This Is My Content` to `This_Is_My_Content`" in {
    assert(SeparatorTo.underscore("This Is My Content") == "This_Is_My_Content")
  }
}
