package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorFillIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 80.000 L 136.000 123.470 L 172.120 145.140 C 175.909 147.415 177.135 152.331 174.860 156.120 C 172.585 159.909 167.669 161.135 163.880 158.860 L 123.880 134.860 C 121.472 133.413 119.999 130.809 120.000 128.000 L 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 ZM 227.060 56.610 C 224.071 55.370 220.629 56.053 218.340 58.340 L 206.000 70.710 C 202.770 67.200 199.440 63.710 195.900 60.120 C 158.667 22.883 98.388 22.589 60.793 59.461 C 23.199 96.333 22.324 156.607 58.831 194.555 C 95.339 232.503 155.601 233.960 193.900 197.820 C 197.114 194.782 197.258 189.714 194.220 186.500 C 191.182 183.286 186.114 183.142 182.900 186.180 C 150.988 216.292 100.776 215.081 70.353 183.466 C 39.929 151.851 40.646 101.630 71.961 70.897 C 103.276 40.164 153.501 40.389 184.540 71.400 C 188.080 74.980 191.410 78.500 194.650 82.030 L 178.340 98.340 C 176.049 100.628 175.364 104.071 176.603 107.062 C 177.842 110.053 180.762 112.003 184.000 112.000 L 224.000 112.000 C 228.418 112.000 232.000 108.418 232.000 104.000 L 232.000 64.000 C 231.999 60.764 230.050 57.848 227.060 56.610 Z"),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
