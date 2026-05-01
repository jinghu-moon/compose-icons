package composeicons.generator.core

import kotlin.test.Test
import kotlin.test.assertEquals

class IconNameMapperTest {

    @Test
    fun `maps dashed file names to pascal case`() {
        assertEquals("Home", IconNameMapper.toKotlinName("home.svg"))
        assertEquals("BrandGithub", IconNameMapper.toKotlinName("brand-github.svg"))
        assertEquals("View360Number", IconNameMapper.toKotlinName("view-360-number.svg"))
    }

    @Test
    fun `prefixes names that start with digits`() {
        assertEquals("_360View", IconNameMapper.toKotlinName("360-view.svg"))
        assertEquals("_2Fa", IconNameMapper.toKotlinName("2fa.svg"))
    }
}

