import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class HackerRankChallengesKtTest {
    
    @Test
    fun arrayLeftRotation() {
        assertEquals("5 1 2 3 4", arrayLeftRotation(arrayOf(1, 2, 3, 4, 5), 4))
    }
    
    @Test
    fun pickingNumbers() {
        assertEquals(3, pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1)))
        assertEquals(5, pickingNumbers(arrayOf(1, 2, 2, 3, 1, 2)))
    }
    
    @Test
    fun beautifulDays() {
        assertEquals(2, beautifulDays(20, 23, 6))
        assertEquals(33, beautifulDays(13, 45, 3))
    }
    
    @Test
    fun saveThePrisoner() {
        assertEquals(2, saveThePrisoner(5, 2, 1))
        assertEquals(3, saveThePrisoner(5, 2, 2))
        assertEquals(6, saveThePrisoner(7, 19, 2))
        assertEquals(3, saveThePrisoner(3, 7, 3))
        assertEquals(216062299, saveThePrisoner(556065259, 615709967, 156417592))
        assertEquals(674567416, saveThePrisoner(946486979, 973168361, 647886035))
    }
    
    @Test
    fun breakingRecords() {
        assertEquals(arrayOf(4,0).asList(), breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)).asList())
    }
    
    @Test
    fun birthday() {
        assertEquals(2, birthday(arrayOf(1,2,1,3,2), 3, 2))
        assertEquals(0, birthday(arrayOf(1,1,1,1,1,1), 3, 2))
        assertEquals(1, birthday(arrayOf(4), 4, 1))
    }
    
    @Test
    fun dayOfProgrammer() {
        assertEquals("13.09.2017", dayOfProgrammer(2017))
        assertEquals("12.09.2016", dayOfProgrammer(2016))
        assertEquals("12.09.1800", dayOfProgrammer(1800))
    }
    
    @Test
    fun pageCount() {
        assertEquals(1, pageCount(6, 2))
        assertEquals(0, pageCount(5, 4))
    }
    
    @Test
    fun circularArrayRotation() {
        assertTrue { arrayOf(2, 3, 1).contentEquals(circularArrayRotation(arrayOf(1, 2, 3), 2, arrayOf(0, 1, 2))) }
        assertTrue {
            arrayOf(72722, 90286, 44792, 65142, 53682, 69161, 97555, 38902, 6169, 54260, 33581, 98320, 87674, 72940, 60906, 38902, 49288, 45786, 70429, 53682, 72722, 16667, 96271, 87674, 53682, 36183, 96271, 66642, 6169, 16667, 17144, 54260, 65142, 97555, 77633, 88185, 39356, 44792, 90286, 56835, 13597, 36183, 87674, 45786, 17144, 39356, 66190, 69277, 38902, 36183, 43856, 23312, 38902, 65142, 5499, 37221, 32032, 23312, 13597, 87496, 36183, 49288, 4912, 32032, 72722, 16667, 80399, 97555, 24523, 43958, 75662, 69161, 66642, 69161, 72940, 87674, 43958, 43958, 90286, 26849, 66642, 60906, 66599, 69277, 44792, 72722, 56835, 65142, 87496, 72722, 97555, 23941, 72940, 66599, 96271, 66642, 17144, 88185, 24523, 96271)
                    .contentEquals(circularArrayRotation(
                            arrayOf(39356, 87674, 16667, 54260, 43958, 70429, 53682, 6169, 87496, 66190, 90286, 4912, 44792, 65142, 36183, 43856, 77633, 38902, 1407, 88185, 80399, 72940, 97555, 23941, 96271, 49288, 27021, 32032, 75662, 69161, 33581, 15017, 56835, 66599, 69277, 17144, 37027, 39310, 23312, 24523, 5499, 13597, 45786, 66642, 95090, 98320, 26849, 72722, 37221, 28255, 60906),
                            51,
                            arrayOf(47, 10, 12, 13, 6, 29, 22, 17, 7, 3, 30, 45, 1, 21, 50, 17, 25, 42, 5, 6, 47, 2, 24, 1, 6, 14, 24, 43, 7, 2, 35, 3, 13, 22, 16, 19, 0, 12, 10, 32, 41, 14, 1, 42, 35, 0, 9, 34, 17, 14, 15, 38, 17, 13, 40, 48, 27, 38, 41, 8, 14, 25, 11, 27, 47, 2, 20, 22, 39, 4, 28, 29, 43, 29, 21, 1, 4, 4, 10, 46, 43, 50, 33, 34, 12, 47, 32, 13, 8, 47, 22, 23, 21, 33, 24, 43, 35, 19, 39, 24)
                    ))
        }
        assertTrue { arrayOf(2,3,1).contentEquals(circularArrayRotation(arrayOf(1,2,3),1,arrayOf(0,1,2))) }
        assertTrue { arrayOf(1,2,3).contentEquals(circularArrayRotation(arrayOf(1,2,3),0,arrayOf(0,1,2))) }
    }
}
