import main.java.arrayLeftRotation
import main.java.beautifulDays
import main.java.pickingNumbers
import main.java.saveThePrisoner
import kotlin.test.Test
import kotlin.test.assertEquals

internal class HackerRankChallengesKtTest {

    @Test
    fun arrayLeftRotationTest() {
        assertEquals("5 1 2 3 4", arrayLeftRotation(arrayOf(1,2,3,4,5), 4))
    }

    @Test
    fun pickingNumbersTest() {
        assertEquals(3, pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1)))
        assertEquals(5, pickingNumbers(arrayOf(1, 2, 2, 3, 1, 2)))
    }

    @Test
    fun beautifulDaysTest() {
        assertEquals(2, beautifulDays(20, 23, 6))
        assertEquals(33, beautifulDays(13, 45, 3))
    }

    @Test
    fun saveThePrisonersTest() {
        assertEquals(2, saveThePrisoner(5,2,1))
        assertEquals(3, saveThePrisoner(5,2,2))
        assertEquals(6, saveThePrisoner(7,19,2))
        assertEquals(3, saveThePrisoner(3,7,3))
        assertEquals(216062299, saveThePrisoner(556065259,615709967,156417592))
        assertEquals(674567416, saveThePrisoner(946486979, 973168361 , 647886035))
    }

}