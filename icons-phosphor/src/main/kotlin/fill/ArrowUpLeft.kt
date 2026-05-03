package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorFillIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 197.660 197.660 C 196.159 199.162 194.123 200.006 192.000 200.006 C 189.877 200.006 187.841 199.162 186.340 197.660 L 116.000 127.310 L 69.660 173.660 C 67.372 175.951 63.929 176.636 60.938 175.397 C 57.947 174.158 55.997 171.238 56.000 168.000 L 56.000 64.000 C 56.000 59.582 59.582 56.000 64.000 56.000 L 168.000 56.000 C 171.238 55.997 174.158 57.947 175.397 60.938 C 176.636 63.929 175.951 67.372 173.660 69.660 L 127.310 116.000 L 197.660 186.340 C 199.162 187.841 200.006 189.877 200.006 192.000 C 200.006 194.123 199.162 196.159 197.660 197.660 Z"),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
