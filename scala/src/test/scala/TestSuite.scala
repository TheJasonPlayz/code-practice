import com.katas.Katas
import org.scalatest.flatspec.AnyFlatSpec

class TestSuite extends AnyFlatSpec {
  "An integer and an array of integers" should "return the index of the integer or -1 depending on whether the integer is found" in {
    assert(Katas.chop(3, Array()) == -1)
    assert(Katas.chop(3, Array(1)) == -1)
    assert(Katas.chop(1, Array(1)) == 0)
    assert(Katas.chop(1, Array(1, 3, 5)) == 0)
    assert(Katas.chop(3, Array(1, 3, 5)) == 1)
    assert(Katas.chop(5, Array(1, 3, 5)) == 2)
    assert(Katas.chop(0, Array(1, 3, 5)) == -1)
    assert(Katas.chop(2, Array(1, 3, 5)) == -1)
    assert(Katas.chop(4, Array(1, 3, 5)) == -1)
    assert(Katas.chop(6, Array(1, 3, 5)) == -1)
    assert(Katas.chop(1, Array(1, 3, 5, 7)) == 0)
    assert(Katas.chop(3, Array(1, 3, 5, 7)) == 1)
    assert(Katas.chop(5, Array(1, 3, 5, 7)) == 2)
    assert(Katas.chop(7, Array(1, 3, 5, 7)) == 3)
    assert(Katas.chop(0, Array(1, 3, 5, 7)) == -1)
    assert(Katas.chop(2, Array(1, 3, 5, 7)) == -1)
    assert(Katas.chop(4, Array(1, 3, 5, 7)) == -1)
    assert(Katas.chop(6, Array(1, 3, 5, 7)) == -1)
    assert(Katas.chop(8, Array(1, 3, 5, 7)) == -1)
  }
}
