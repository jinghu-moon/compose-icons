package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterCaseCapitalize: ImageVector
    get() {
        if (_letterCaseCapitalize != null) return _letterCaseCapitalize!!
        _letterCaseCapitalize = radixIcon(
            name = "LetterCaseCapitalize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.689 2.75c.207-0 .392 .127 .467 .32l3.21 8.319 .027 .098c.039 .229-.088 .462-.313 .549-.225 .087-.475-0-.601-.196l-.046-.09L5.383 9.025h-3.372L.967 11.749l-.046 .091c-.125 .196-.374 .283-.6 .197-.258-.099-.387-.389-.288-.646L3.224 3.071l.032-.069c.088-.154 .253-.252 .434-.252ZM10.898 5.207c.894 0 1.706 .395 2.255 1.018v-.505c0-.248 .202-.45 .45-.45 .248 0 .45 .202 .45 .45v5.81c0 .248-.202 .45-.45 .45-.248-0-.45-.202-.45-.45v-.51c-.58 .648-1.432 .993-2.255 .993C9.358 12.012 8.009 10.633 8.009 8.609 8.009 6.686 9.258 5.207 10.898 5.207ZM11.086 6.058c-.978 0-2.051 .909-2.051 2.552 0 1.543 .973 2.551 2.051 2.552 .884 0 1.686-.668 2.067-1.366v-2.489C12.764 6.583 11.942 6.058 11.086 6.058ZM2.337 8.176h2.718L3.691 4.643 2.337 8.176Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _letterCaseCapitalize!!
    }

private var _letterCaseCapitalize: ImageVector? = null
