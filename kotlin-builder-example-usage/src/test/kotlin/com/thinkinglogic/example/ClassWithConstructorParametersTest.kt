package com.thinkinglogic.example

import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class ClassWithConstructorParametersTest {

    @Test
    fun `builder should create object using constructor args`() {
        // given
        val forename = "Jane"
        val surname = "Doe"
        val expected = ClassWithConstructorParameters(
                forename = forename,
                surname = surname,
                otherName = "unknown"
        )

        // when
        val actual = ClassWithConstructorParametersBuilder()
                .forename(forename)
                .surname(surname)
                .otherName(expected.otherName)
                .build()

        // then
        assertk.assert(actual).isEqualTo(expected)
    }

    @Test
    fun `builder should use correct defaults`() {
        // given
        val forename = "Jane"
        val expected = ClassWithConstructorParameters(
                forename = forename,
                otherName = "unknown"
        )

        // when
        val actual = ClassWithConstructorParametersBuilder()
                .forename(forename)
                .otherName(expected.otherName)
                .build()

        // then
        assertk.assert(actual).isEqualTo(expected)
    }

}