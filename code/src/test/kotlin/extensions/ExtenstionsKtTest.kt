import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTest {

    @Test
    fun `test if reversing a name works`() {
        "Tobias".reversed() shouldEqual "saiboT"
    }

}

private infix fun String.shouldEqual(s: String) {
    assertEquals(s, this)
}
