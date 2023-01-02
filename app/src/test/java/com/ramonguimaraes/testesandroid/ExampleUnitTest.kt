package com.ramonguimaraes.testesandroid

import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun `o resultado de 3 * 5 deve ser 15`() {
        val calculatesOvertimeUseCase = CalculatesOvertimeUseCase()
        val result = calculatesOvertimeUseCase.calculate(3f, 5f)
        assertEquals(15f, result)
    }
}
