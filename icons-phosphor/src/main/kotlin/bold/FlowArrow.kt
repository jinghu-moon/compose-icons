package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorBoldIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.490 71.510 L 216.490 39.510 C 211.796 34.816 204.184 34.816 199.490 39.510 C 194.796 44.204 194.796 51.816 199.490 56.510 L 211.000 68.000 L 208.000 68.000 C 156.000 68.000 143.200 98.710 132.920 123.380 C 124.100 144.550 117.470 160.430 90.170 163.470 C 83.918 142.427 63.112 129.212 41.407 132.498 C 19.703 135.783 3.740 154.563 3.995 176.514 C 4.251 198.464 20.646 216.868 42.421 219.648 C 64.196 222.428 84.689 208.732 90.450 187.550 C 133.790 183.680 145.520 155.550 155.080 132.620 C 164.900 109.000 172.000 92.000 208.000 92.000 L 211.000 92.000 L 199.480 103.510 C 194.786 108.204 194.786 115.816 199.480 120.510 C 204.174 125.204 211.786 125.204 216.480 120.510 L 248.480 88.510 C 250.741 86.260 252.013 83.202 252.014 80.012 C 252.016 76.822 250.748 73.763 248.490 71.510 ZM 48.000 196.000 C 36.954 196.000 28.000 187.046 28.000 176.000 C 28.000 164.954 36.954 156.000 48.000 156.000 C 59.046 156.000 68.000 164.954 68.000 176.000 C 68.000 187.046 59.046 196.000 48.000 196.000 Z"),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
