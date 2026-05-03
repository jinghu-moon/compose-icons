package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorFillIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 224.000 96.000 C 224.000 100.418 220.418 104.000 216.000 104.000 L 168.000 104.000 C 164.762 104.003 161.842 102.053 160.603 99.062 C 159.364 96.071 160.049 92.628 162.340 90.340 L 180.650 72.000 C 165.921 57.887 146.329 49.978 125.930 49.910 L 125.480 49.910 C 104.577 49.869 84.499 58.060 69.590 72.710 C 66.412 75.676 61.448 75.562 58.409 72.454 C 55.371 69.345 55.371 64.379 58.410 61.270 C 95.484 25.047 154.618 24.795 192.000 60.700 L 210.360 42.340 C 212.650 40.064 216.084 39.387 219.066 40.625 C 222.048 41.862 223.994 44.771 224.000 48.000 ZM 186.410 183.290 C 155.612 213.371 106.531 213.685 75.350 184.000 L 93.660 165.690 C 95.972 163.405 96.672 159.948 95.430 156.943 C 94.188 153.939 91.251 151.985 88.000 152.000 L 40.000 152.000 C 35.582 152.000 32.000 155.582 32.000 160.000 L 32.000 208.000 C 31.997 211.238 33.947 214.158 36.938 215.397 C 39.929 216.636 43.372 215.951 45.660 213.660 L 64.000 195.300 C 81.722 212.403 105.371 221.992 130.000 222.060 L 130.530 222.060 C 155.611 222.125 179.707 212.306 197.600 194.730 C 200.639 191.621 200.639 186.655 197.601 183.546 C 194.562 180.438 189.598 180.324 186.420 183.290 Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
