package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorFillIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.390 83.060 C 222.152 86.050 219.236 87.999 216.000 88.000 L 176.000 88.000 L 176.000 168.000 C 176.000 203.346 147.346 232.000 112.000 232.000 C 76.654 232.000 48.000 203.346 48.000 168.000 L 48.000 80.000 C 48.000 75.582 51.582 72.000 56.000 72.000 C 60.418 72.000 64.000 75.582 64.000 80.000 L 64.000 168.000 C 64.000 194.510 85.490 216.000 112.000 216.000 C 138.510 216.000 160.000 194.510 160.000 168.000 L 160.000 88.000 L 120.000 88.000 C 116.762 88.003 113.842 86.053 112.603 83.062 C 111.364 80.071 112.049 76.628 114.340 74.340 L 162.340 26.340 C 163.841 24.838 165.877 23.994 168.000 23.994 C 170.123 23.994 172.159 24.838 173.660 26.340 L 221.660 74.340 C 223.947 76.629 224.630 80.071 223.390 83.060 Z"),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
