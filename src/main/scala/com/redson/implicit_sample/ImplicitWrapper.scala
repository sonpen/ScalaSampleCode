package com.redson.implicit_sample

/**
  * Created by sonpen on 20. 7. 12.
  */
object ImplicitWrapper {

  implicit class StringExtension(s :String) {
    def hello : String = "Hello " + s
  }

  implicit class StrOps(val str: String) {
    def bang = str + "!!!"
  }

  implicit class MapToolkit[T1,T2](val m: Map[T1, T2]) {
    def myGet(k : T1): T2 = {
      m.get(k) match {
        case Some(v) => v
        case None => throw new RuntimeException(s"Not Found Key(${k})")
      }
    }
  }
}
