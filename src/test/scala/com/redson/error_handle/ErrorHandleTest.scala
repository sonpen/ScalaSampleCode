package com.redson.error_handle

import org.scalatest.FunSuite

import scala.util.{Failure, Success}

/**
  * Created by 1109806 on 2020-09-09.
  */
class ErrorHandleTest extends FunSuite{
    val handle = new ErrorHandle()

    test("ErrorHandle.toInto") {
        assertThrows[NumberFormatException] {
            handle.toInt("a2")
        }
    }

    test("ErrorHandle.toIntoWithTry") {
        val result = handle.toIntWithTry("2a")
        val result2 = result match {
            case Success(i) => i
            case Failure(exception) => {
                println(exception)
                2
            }
        }

        assert(result2 == 2)
    }

}
