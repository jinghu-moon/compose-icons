package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorRegularIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.660 85.660 C 220.159 87.162 218.123 88.006 216.000 88.006 C 213.877 88.006 211.841 87.162 210.340 85.660 L 176.000 51.310 L 176.000 168.000 C 176.000 203.346 147.346 232.000 112.000 232.000 C 76.654 232.000 48.000 203.346 48.000 168.000 L 48.000 80.000 C 48.000 75.582 51.582 72.000 56.000 72.000 C 60.418 72.000 64.000 75.582 64.000 80.000 L 64.000 168.000 C 64.000 194.510 85.490 216.000 112.000 216.000 C 138.510 216.000 160.000 194.510 160.000 168.000 L 160.000 51.310 L 125.660 85.660 C 122.534 88.786 117.466 88.786 114.340 85.660 C 111.214 82.534 111.214 77.466 114.340 74.340 L 162.340 26.340 C 163.841 24.838 165.877 23.994 168.000 23.994 C 170.123 23.994 172.159 24.838 173.660 26.340 L 221.660 74.340 C 223.162 75.841 224.006 77.877 224.006 80.000 C 224.006 82.123 223.162 84.159 221.660 85.660 Z"),
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
