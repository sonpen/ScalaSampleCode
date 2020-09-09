package com.redson.json_parser

import org.json4s.JValue
import org.json4s.jackson.JsonMethods
import org.json4s.jackson.JsonMethods.{compact, render}

/**
  * Created by 1109806 on 2020-09-09.
  */
object JsonParser extends App {
    def parse(jsonStr: String) : JValue = {
        JsonMethods.parse(jsonStr)
    }

    val jsonStr =
        """
          |{"key1":"value1", "key2":2, "array_key":[1,2,3,4]}
        """.stripMargin

    val parsed = parse(jsonStr)

    implicit val format = org.json4s.DefaultFormats
    println((parsed \ "key1").extract[String] == "value1")
    println((parsed \ "key3").extract[String])

    println(compact(render(parsed)))
}
