import org.junit.jupiter.api.*
import java.lang.NullPointerException

class MainTest {
    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xXoo")) },
            { Assertions.assertTrue(countXO("xxOo")) },
            { Assertions.assertFalse(countXO("xxO4oo")) }
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso seguir sem implementar este método")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc())

    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> {abc()}
    }

}
