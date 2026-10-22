// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Test when odd size" {
        median(listOf(1f, 2f, 3f)) shouldBe 2f
        //assertEquals(expected, result)
        
    }
    
    "Test when even size" {
        median(listOf(1f, 2f, 2f, 3f)) shouldBe 2f
    }
    
    "Test when single element given" {

        median(listOf(1f)) shouldBe 1f
    }
    
    "Test negative numbers" {
        median(listOf(-1f, -2f, 3f, -4f, 5f)) shouldBe -1f
    }
    
})
