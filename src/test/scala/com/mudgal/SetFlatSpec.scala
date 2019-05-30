package com.mudgal

import org.scalatest.FlatSpec

class SetFlatSpec extends FlatSpec {
  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException]{
      Set.empty.head
    }
  }

}
