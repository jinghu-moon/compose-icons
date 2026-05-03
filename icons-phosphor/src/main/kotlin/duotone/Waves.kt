package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorDuotoneIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 70.390 L 216.000 182.390 C 144.000 242.080 112.000 125.920 40.000 185.610 L 40.000 73.610 C 112.000 13.920 144.000 130.080 216.000 70.390 Z"),
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
                pathData = parseSvgPathData("M 222.160 177.250 C 224.983 180.635 224.536 185.666 221.160 188.500 C 203.800 202.890 188.300 208.000 174.160 208.000 C 155.580 208.000 139.340 199.180 124.230 191.000 C 98.880 177.240 76.990 165.360 45.160 191.740 C 42.964 193.592 39.943 194.125 37.246 193.135 C 34.549 192.145 32.590 189.785 32.113 186.952 C 31.636 184.119 32.715 181.248 34.940 179.430 C 75.110 146.150 105.260 162.510 131.870 176.950 C 157.220 190.700 179.110 202.580 210.940 176.210 C 214.331 173.417 219.340 173.881 222.160 177.250 ZM 210.890 120.250 C 179.060 146.630 157.170 134.750 131.820 120.990 C 105.210 106.560 75.060 90.200 34.890 123.480 C 31.531 126.313 31.086 131.325 33.893 134.705 C 36.699 138.086 41.708 138.570 45.110 135.790 C 76.940 109.410 98.830 121.290 124.180 135.050 C 139.290 143.240 155.530 152.050 174.110 152.050 C 188.250 152.050 203.750 146.940 221.110 132.550 C 223.335 130.732 224.414 127.861 223.937 125.028 C 223.460 122.195 221.501 119.835 218.804 118.845 C 216.107 117.855 213.086 118.388 210.890 120.240 ZM 45.110 79.800 C 76.940 53.430 98.830 65.310 124.180 79.060 C 139.290 87.260 155.530 96.060 174.110 96.060 C 188.250 96.060 203.750 90.940 221.110 76.560 C 223.335 74.742 224.414 71.871 223.937 69.038 C 223.460 66.205 221.501 63.845 218.804 62.855 C 216.107 61.865 213.086 62.398 210.890 64.250 C 179.060 90.630 157.170 78.750 131.820 64.990 C 105.210 50.580 75.060 34.220 34.890 67.500 C 32.586 69.293 31.442 72.198 31.904 75.080 C 32.367 77.963 34.362 80.364 37.111 81.347 C 39.860 82.329 42.926 81.736 45.110 79.800 Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
