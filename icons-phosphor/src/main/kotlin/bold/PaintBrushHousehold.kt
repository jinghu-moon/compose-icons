package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorBoldIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 233.470 22.530 C 219.411 8.472 196.619 8.472 182.560 22.530 L 182.170 22.930 L 129.610 80.610 L 123.810 74.820 C 118.559 69.568 111.437 66.618 104.010 66.618 C 96.583 66.618 89.461 69.568 84.210 74.820 L 7.520 151.510 C 5.261 153.762 3.991 156.820 3.991 160.010 C 3.991 163.200 5.261 166.258 7.520 168.510 L 87.520 248.510 C 89.772 250.769 92.830 252.039 96.020 252.039 C 99.210 252.039 102.268 250.769 104.520 248.510 L 181.220 171.810 C 186.472 166.559 189.422 159.437 189.422 152.010 C 189.422 144.583 186.472 137.461 181.220 132.210 L 175.420 126.410 L 233.100 73.850 L 233.500 73.460 C 240.253 66.704 244.044 57.541 244.038 47.989 C 244.033 38.437 240.231 29.278 233.470 22.530 ZM 96.000 223.000 L 87.000 214.000 L 104.510 196.480 C 109.204 191.786 109.204 184.174 104.510 179.480 C 99.816 174.786 92.204 174.786 87.510 179.480 L 70.000 197.000 L 59.000 186.000 L 76.520 168.480 C 81.214 163.786 81.214 156.174 76.520 151.480 C 71.826 146.786 64.214 146.786 59.520 151.480 L 42.000 169.000 L 33.000 160.000 L 72.000 121.000 L 135.000 184.000 ZM 216.660 56.310 L 149.930 117.120 C 147.505 119.329 146.090 122.435 146.015 125.714 C 145.939 128.994 147.209 132.161 149.530 134.480 L 164.210 149.160 C 164.961 149.910 165.383 150.928 165.383 151.990 C 165.383 153.052 164.961 154.070 164.210 154.820 L 152.000 167.000 L 89.000 104.000 L 101.200 91.800 C 101.950 91.049 102.968 90.627 104.030 90.627 C 105.092 90.627 106.110 91.049 106.860 91.800 L 121.540 106.480 C 123.859 108.801 127.026 110.071 130.306 109.995 C 133.585 109.920 136.691 108.505 138.900 106.080 L 199.710 39.350 C 204.404 34.656 212.016 34.656 216.710 39.350 C 221.404 44.044 221.404 51.656 216.710 56.350 Z"),
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
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
