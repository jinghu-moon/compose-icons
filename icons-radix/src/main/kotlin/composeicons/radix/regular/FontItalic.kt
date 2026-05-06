package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontItalic: ImageVector
    get() {
        if (_fontItalic != null) return _fontItalic!!
        _fontItalic = radixIcon(
            name = "FontItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.625 3.05c.248 0 .45 .202 .45 .45-0 .248-.202 .45-.45 .45h-1.619L7.231 11.05h1.645c.248 0 .45 .202 .45 .45-0 .248-.202 .449-.45 .449h-4.5c-.248 0-.45-.201-.45-.449 0-.249 .202-.45 .45-.45h1.619L7.77 3.951h-1.645c-.248 0-.45-.202-.45-.45 0-.249 .202-.45 .45-.45h4.5Z"),
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
        return _fontItalic!!
    }

private var _fontItalic: ImageVector? = null
