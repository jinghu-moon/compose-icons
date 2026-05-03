package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorDuotoneIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.390 104.340 L 134.150 213.120 C 132.630 214.947 130.377 216.004 128.000 216.004 C 125.623 216.004 123.370 214.947 121.850 213.120 L 17.800 87.690 C 16.436 86.050 15.804 83.923 16.052 81.804 C 16.299 79.686 17.405 77.761 19.110 76.480 C 50.435 52.729 88.689 39.914 128.000 40.000 C 139.088 39.990 150.155 40.994 161.060 43.000 C 162.642 43.297 164.096 44.068 165.230 45.210 L 224.000 104.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 229.660 98.340 C 232.786 101.466 232.786 106.534 229.660 109.660 C 226.534 112.786 221.466 112.786 218.340 109.660 L 200.000 91.310 L 181.660 109.660 C 178.534 112.786 173.466 112.786 170.340 109.660 C 167.214 106.534 167.214 101.466 170.340 98.340 L 188.690 80.000 L 170.340 61.660 C 167.214 58.534 167.214 53.466 170.340 50.340 C 173.466 47.214 178.534 47.214 181.660 50.340 L 200.000 68.690 L 218.340 50.340 C 221.466 47.214 226.534 47.214 229.660 50.340 C 232.786 53.466 232.786 58.534 229.660 61.660 L 211.310 80.000 ZM 196.600 137.840 C 194.973 136.478 192.871 135.818 190.758 136.006 C 188.644 136.193 186.692 137.213 185.330 138.840 L 128.000 208.000 L 24.090 82.740 C 53.971 60.061 90.488 47.852 128.000 48.000 C 130.540 48.000 133.110 48.060 135.650 48.170 C 140.068 48.363 143.807 44.938 144.000 40.520 C 144.193 36.102 140.768 32.363 136.350 32.170 C 133.580 32.050 130.770 31.990 128.000 31.990 C 86.933 31.838 46.963 45.233 14.280 70.100 C 10.842 72.717 8.616 76.619 8.110 80.910 C 7.602 85.192 8.882 89.494 11.650 92.800 L 115.650 218.230 C 118.694 221.906 123.227 224.024 128.000 224.000 L 128.000 224.000 C 132.759 224.012 137.275 221.896 140.310 218.230 L 197.650 149.110 C 199.006 147.477 199.658 145.371 199.461 143.257 C 199.264 141.144 198.235 139.195 196.600 137.840 Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
