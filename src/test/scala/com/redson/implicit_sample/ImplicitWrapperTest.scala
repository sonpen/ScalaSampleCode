package com.redson.implicit_sample

import org.scalatest.FunSuite
import com.redson.implicit_sample.ImplicitWrapper._
/**
  * Created by sonpen on 20. 7. 12.
  */
class ImplicitWrapperTest extends FunSuite{

    test("StringExtension.hello") {
        assert("World".hello == "Hello World")
    }

    test("MapToolkit.myGet") {
        assert(Map(1->"one", 2->"two", 3->"three").myGet(1) == "one")
    }

}
