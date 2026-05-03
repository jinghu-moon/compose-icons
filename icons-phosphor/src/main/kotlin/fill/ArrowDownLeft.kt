package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorFillIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 197.660 69.660 L 127.310 140.000 L 173.660 186.340 C 175.951 188.628 176.636 192.071 175.397 195.062 C 174.158 198.053 171.238 200.003 168.000 200.000 L 64.000 200.000 C 59.582 200.000 56.000 196.418 56.000 192.000 L 56.000 88.000 C 55.997 84.762 57.947 81.842 60.938 80.603 C 63.929 79.364 67.372 80.049 69.660 82.340 L 116.000 128.690 L 186.340 58.340 C 189.466 55.214 194.534 55.214 197.660 58.340 C 200.786 61.466 200.786 66.534 197.660 69.660 Z"),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
