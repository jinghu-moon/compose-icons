package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Opacity: ImageVector
    get() {
        if (_opacity != null) return _opacity!!
        _opacity = radixIcon(
            name = "Opacity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 1.500 C 10.500 4.250 12.000 6.500 12.000 9.000 C 12.000 11.485 9.985 13.500 7.500 13.500 C 5.015 13.500 3.000 11.485 3.000 9.000 C 3.000 6.500 4.500 4.250 7.500 1.500 ZM 7.500 2.876 C 5.028 5.274 4.000 7.112 4.000 9.000 C 4.000 10.933 5.567 12.500 7.500 12.500 C 9.433 12.500 11.000 10.933 11.000 9.000 C 11.000 7.112 9.972 5.274 7.500 2.876 Z"),
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
        return _opacity!!
    }

private var _opacity: ImageVector? = null
