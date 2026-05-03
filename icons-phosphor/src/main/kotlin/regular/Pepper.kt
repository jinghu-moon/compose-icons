package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorRegularIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 167.270 40.420 C 163.616 21.613 147.158 8.026 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 C 120.000 20.418 123.582 24.000 128.000 24.000 C 138.427 24.000 147.661 30.733 150.850 40.660 C 119.384 45.240 96.036 72.202 96.000 104.000 C 96.000 150.750 70.250 182.000 19.470 197.000 C 12.317 199.085 7.550 205.831 7.973 213.269 C 8.396 220.707 13.897 226.869 21.240 228.130 C 36.270 230.728 51.497 232.023 66.750 232.000 C 107.530 232.000 152.910 222.850 184.280 196.540 C 210.640 174.440 224.000 143.300 224.000 104.000 L 224.000 104.000 C 223.965 71.481 199.575 44.145 167.270 40.420 ZM 160.000 56.000 C 180.474 56.027 198.683 69.019 205.370 88.370 L 192.000 95.000 L 163.580 80.830 C 161.327 79.702 158.673 79.702 156.420 80.830 L 128.000 95.000 L 114.630 88.320 C 121.336 68.991 139.540 56.023 160.000 56.000 ZM 174.000 184.300 C 156.000 199.370 130.400 209.560 99.880 213.770 C 74.659 217.105 49.081 216.633 24.000 212.370 L 24.000 212.370 L 24.000 212.370 C 81.230 195.500 111.630 158.370 112.000 104.950 L 124.440 111.170 C 126.693 112.298 129.347 112.298 131.600 111.170 L 160.000 96.930 L 188.420 111.140 C 190.673 112.268 193.327 112.268 195.580 111.140 L 207.990 104.940 C 207.780 138.840 196.350 165.540 174.000 184.290 Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
