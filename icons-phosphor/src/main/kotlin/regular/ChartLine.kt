package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorRegularIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 L 24.000 48.000 C 24.000 43.582 27.582 40.000 32.000 40.000 C 36.418 40.000 40.000 43.582 40.000 48.000 L 40.000 142.370 L 90.730 98.000 C 93.575 95.509 97.775 95.351 100.800 97.620 L 159.610 141.730 L 218.730 90.000 C 220.842 87.909 223.939 87.162 226.773 88.059 C 229.606 88.956 231.709 91.350 232.233 94.275 C 232.757 97.200 231.616 100.175 229.270 102.000 L 165.270 158.000 C 162.425 160.491 158.225 160.649 155.200 158.380 L 96.390 114.290 L 40.000 163.630 L 40.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 Z"),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
