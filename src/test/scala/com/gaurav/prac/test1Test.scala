package com.gaurav.prac

class test1Test extends org.scalatest.FunSuite {

  test("test the method"){
    val tst = test1
    val rt = tst.testMethod(1)
    assert(rt == 1)
  }

  test("test the method 2"){

    val rt1 = test1.testMethod2("gaurav")
    assert(rt1 == "gaurav")
  }

}
