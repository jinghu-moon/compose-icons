package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontRoman: ImageVector
    get() {
        if (_fontRoman != null) return _fontRoman!!
        _fontRoman = radixIcon(
            name = "FontRoman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.75 3.05c.248 0 .45 .202 .45 .45-0 .248-.202 .45-.45 .45h-1.65v7.1h1.65c.248 0 .45 .202 .45 .45-0 .248-.202 .449-.45 .449h-4.5c-.248 0-.45-.201-.45-.449 0-.249 .202-.45 .45-.45h1.649v-7.1h-1.649c-.248 0-.45-.202-.45-.45 0-.249 .202-.45 .45-.45h4.5Z"),
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
        return _fontRoman!!
    }

private var _fontRoman: ImageVector? = null
