package com.redson.implicit_sample

import org.scalatest.funsuite.AnyFunSuite
import com.redson.implicit_sample.ImplicitSample._
/**
  * Created by sonpen on 20. 7. 12.
  */
class ImplicitSampleTest extends AnyFunSuite{

  test("StringExtension.hello") {
    assert("World".hello == "Hello World")
  }

}
