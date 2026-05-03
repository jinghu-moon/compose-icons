package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Dot: ImageVector
    get() {
        if (_dot != null) return _dot!!
        _dot = radixIcon(
            name = "Dot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 4.875 C 8.950 4.875 10.125 6.050 10.125 7.500 C 10.125 8.950 8.950 10.125 7.500 10.125 C 6.050 10.125 4.875 8.950 4.875 7.500 C 4.875 6.050 6.050 4.875 7.500 4.875 ZM 7.500 5.875 C 6.603 5.875 5.875 6.603 5.875 7.500 C 5.875 8.397 6.603 9.125 7.500 9.125 C 8.397 9.125 9.125 8.397 9.125 7.500 C 9.125 6.603 8.397 5.875 7.500 5.875 Z"),
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
        return _dot!!
    }

private var _dot: ImageVector? = null
