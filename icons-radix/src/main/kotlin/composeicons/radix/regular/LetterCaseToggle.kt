package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterCaseToggle: ImageVector
    get() {
        if (_letterCaseToggle != null) return _letterCaseToggle!!
        _letterCaseToggle = radixIcon(
            name = "LetterCaseToggle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.289 2.75c.207-0 .392 .127 .467 .32l3.21 8.319 .027 .098c.039 .229-.088 .462-.314 .549-.225 .087-.475-0-.601-.196l-.046-.09L12.982 9.025h-3.372L8.567 11.749l-.046 .091c-.125 .195-.374 .283-.6 .197-.258-.099-.387-.389-.288-.647L10.823 3.071l.032-.069c.088-.154 .253-.252 .434-.252ZM2.899 5.207c.894 0 1.706 .395 2.255 1.018v-.505c0-.248 .202-.45 .45-.45 .248 0 .45 .202 .45 .45v5.809c0 .248-.202 .45-.45 .45-.248-0-.45-.202-.45-.45v-.51c-.58 .648-1.432 .993-2.255 .993C1.358 12.012 .009 10.633 .009 8.609 .009 6.685 1.258 5.207 2.899 5.207ZM3.086 6.057C2.108 6.058 1.036 6.966 1.035 8.609c0 1.543 .973 2.551 2.051 2.552 .884 0 1.685-.668 2.067-1.366v-2.489C4.764 6.583 3.942 6.057 3.086 6.057ZM9.937 8.176h2.718L11.291 4.642 9.937 8.176Z"),
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
        return _letterCaseToggle!!
    }

private var _letterCaseToggle: ImageVector? = null
