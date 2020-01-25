import org.scalatest.flatspec.AnyFlatSpec

class UnderscoreToSpec extends AnyFlatSpec {

  it should "convert `This_Is_My_Content` to `ThisIsMyContent`" in {
    assert(UnderscoreTo.pascal("This_Is_My_Content") == "ThisIsMyContent")
    assert(UnderscoreTo.pascal("this_is_my_content") == "ThisIsMyContent")
  }

  it should "convert `This_Is_My_Content` to `thisIsMyContent`" in {
    assert(UnderscoreTo.camel("This_Is_My_Content") == "thisIsMyContent")
    assert(UnderscoreTo.camel("this_is_my_content") == "thisIsMyContent")
  }

  it should "convert `This_Is_My_Content` to `This-Is-My-Content`" in {
    assert(UnderscoreTo.dash("This_Is_My_Content") == "This-Is-My-Content")
    assert(UnderscoreTo.dash("this_is_my_content") == "this-is-my-content")
  }

  it should "convert `This_Is_My_Content` to `this Is My Content`" in {
    assert(UnderscoreTo.separator("This_Is_My_Content") == "This Is My Content")
    assert(UnderscoreTo.separator("this_is_my_content") == "this is my content")
  }

}
