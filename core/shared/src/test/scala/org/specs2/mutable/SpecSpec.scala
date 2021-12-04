package org.specs2
package mutable

import specification.dsl.mutable.{ExampleDsl, TagDsl}

class SpecSpec extends Spec with TagDsl:
  sequential

  "A mutable Spec can use additional traits to expand its dsl" >> {
    val s = new Spec with ExampleDsl {
      "hello" >> ok
    }
    ok
  }
