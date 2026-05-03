package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DotFilled: ImageVector
    get() {
        if (_dotFilled != null) return _dotFilled!!
        _dotFilled = radixIcon(
            name = "DotFilled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 5.125 C 8.812 5.125 9.875 6.188 9.875 7.500 C 9.875 8.812 8.812 9.875 7.500 9.875 C 6.188 9.875 5.125 8.812 5.125 7.500 C 5.125 6.188 6.188 5.125 7.500 5.125 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dotFilled!!
    }

private var _dotFilled: ImageVector? = null
