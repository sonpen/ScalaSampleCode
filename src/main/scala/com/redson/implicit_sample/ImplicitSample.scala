package com.redson.implicit_sample

/**
  * Created by sonpen on 20. 7. 12.
  */
object ImplicitSample {

  implicit class StringExtension(s :String) {
    def hello : String = "Hello " + s
  }
}
