package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterCaseLowercase: ImageVector
    get() {
        if (_letterCaseLowercase != null) return _letterCaseLowercase!!
        _letterCaseLowercase = radixIcon(
            name = "LetterCaseLowercase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.699 5.207c.894 0 1.706 .395 2.255 1.018v-.505c0-.248 .202-.45 .45-.45 .248 0 .45 .202 .45 .45v5.81c0 .248-.202 .45-.45 .45-.249 0-.45-.202-.45-.45v-.51c-.58 .648-1.432 .993-2.255 .993C2.158 12.013 .809 10.633 .809 8.609 .809 6.686 2.058 5.207 3.699 5.207ZM10.798 5.207c.894 0 1.706 .395 2.255 1.018v-.505c0-.248 .202-.45 .45-.45 .248 0 .45 .202 .45 .45v5.81c0 .248-.202 .45-.45 .45-.248-0-.45-.202-.45-.45v-.51c-.58 .648-1.432 .993-2.255 .993C9.258 12.012 7.909 10.633 7.909 8.609 7.909 6.686 9.158 5.207 10.798 5.207ZM3.886 6.058C2.909 6.058 1.836 6.966 1.836 8.609c0 1.544 .973 2.551 2.051 2.552 .884 0 1.685-.668 2.067-1.366v-2.489C5.564 6.583 4.742 6.058 3.886 6.058ZM10.986 6.058c-.978 .001-2.051 .909-2.051 2.552 0 1.543 .973 2.551 2.051 2.552 .884 0 1.685-.668 2.067-1.366v-2.489C12.663 6.583 11.842 6.058 10.986 6.058Z"),
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
        return _letterCaseLowercase!!
    }

private var _letterCaseLowercase: ImageVector? = null
