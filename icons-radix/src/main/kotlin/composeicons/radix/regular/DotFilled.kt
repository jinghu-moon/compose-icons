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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 5.125c1.312 0 2.375 1.063 2.375 2.375 0 1.312-1.063 2.375-2.375 2.375C6.188 9.875 5.125 8.812 5.125 7.5 5.125 6.188 6.188 5.125 7.5 5.125Z"),
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
        return _dotFilled!!
    }

private var _dotFilled: ImageVector? = null
