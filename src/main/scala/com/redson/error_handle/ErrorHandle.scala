package com.redson.error_handle

import scala.util.Try

/**
  * Created by 1109806 on 2020-09-09.
  */
class ErrorHandle {
    /**
      * Error 상황을 Exception 으로 핸들링. (보통 Java 방식)
      * 그러나, return type 이 동일한 타입이라는 함수형 언어와는 사상이 맞지 않음.
      * 함수형 에러 핸들링은 Option, Try 등을 이용함.
      * https://alvinalexander.com/scala/functional-error-handling-exceptions-in-scala/
      *
      * @param s
      * @return
      */
    def toInt(s: String): Int = {
        try {
            s.toInt
        }
        catch {
            case e: Exception => {
                println(s"[ERROR] ${e}")
                throw e
            }
        }
    }

    def toIntWithTry(s: String): Try[Int] = Try {
        s.toInt
    }

}
