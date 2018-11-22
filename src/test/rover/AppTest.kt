package rover

import org.junit.jupiter.api.Test

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat

internal class AppTest {

    @Test
    fun itShouldRunTests() {
        assertThat(1).isEqualTo(1)
    }

    @Test
    fun itShouldRun2ndTest() {
        assertThat(2+1).isEqualTo(3)
    }
}