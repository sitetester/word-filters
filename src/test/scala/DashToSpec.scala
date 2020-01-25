import org.scalatest.flatspec.AnyFlatSpec

class DashToSpec extends AnyFlatSpec {

  it should "convert `This-Is-My-Content` to `ThisIsMyContent`" in {
    assert(DashTo.pascal("This-Is-My-Content") == "ThisIsMyContent")
    assert(DashTo.pascal("this-is-my-content") == "ThisIsMyContent")
  }

  it should "convert `This-Is-My-Content` to `thisIsMyContent`" in {
    assert(DashTo.camel("This-Is-My-Content") == "thisIsMyContent")
    assert(DashTo.camel("this-is-my-content") == "thisIsMyContent")
  }

  it should "convert `This-Is-My-Content` to `This_Is_My_Content`" in {
    assert(DashTo.underscore("This-Is-My-Content") == "This_Is_My_Content")
    assert(DashTo.underscore("this-is-my-content") == "this_is_my_content")
  }

  it should "convert`This-Is-My-Content` to `This_Is_My_Content`" in {
    assert(DashTo.separator("This-Is-My-Content") == "This Is My Content")
  }

}
