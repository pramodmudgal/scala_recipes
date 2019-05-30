package com.mudgal

import org.scalatest.{FunSuite, Matchers}

class EmployeeSpec extends FunSuite with Matchers {
  test(
    """Create an employee with first name
      |and last name, and assert middle
      |name""".stripMargin) {
    val employee = Employee("Dennis", "Ritchie")
    employee.fullName should be("Dennis Ritchie1")
  }


}
