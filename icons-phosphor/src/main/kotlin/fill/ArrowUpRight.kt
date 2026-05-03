package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorFillIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 64.000 L 200.000 168.000 C 200.003 171.238 198.053 174.158 195.062 175.397 C 192.071 176.636 188.628 175.951 186.340 173.660 L 140.000 127.310 L 69.660 197.660 C 66.534 200.786 61.466 200.786 58.340 197.660 C 55.214 194.534 55.214 189.466 58.340 186.340 L 128.690 116.000 L 82.340 69.660 C 80.049 67.372 79.364 63.929 80.603 60.938 C 81.842 57.947 84.762 55.997 88.000 56.000 L 192.000 56.000 C 196.418 56.000 200.000 59.582 200.000 64.000 Z"),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
