import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
}
