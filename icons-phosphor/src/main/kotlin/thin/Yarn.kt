package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorThinIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 220.000 L 232.000 220.000 L 167.210 220.000 C 214.438 199.881 238.761 147.269 223.493 98.258 C 208.225 49.246 158.326 19.756 108.027 30.019 C 57.729 40.281 23.371 86.962 28.523 138.037 C 33.676 189.113 76.665 227.991 128.000 228.000 L 232.000 228.000 C 234.209 228.000 236.000 226.209 236.000 224.000 C 236.000 221.791 234.209 220.000 232.000 220.000 ZM 128.000 36.000 C 146.748 35.979 165.050 41.718 180.430 52.440 C 167.730 57.680 155.549 64.102 144.050 71.620 C 126.592 60.218 107.593 51.371 87.630 45.350 C 100.192 39.181 114.005 35.982 128.000 36.000 ZM 77.850 50.910 C 98.712 56.370 118.611 65.004 136.850 76.510 C 127.614 83.087 118.898 90.365 110.780 98.280 C 92.164 87.987 71.852 81.118 50.810 78.000 C 57.838 67.185 67.048 57.958 77.850 50.910 ZM 46.440 85.460 C 66.906 88.099 86.720 94.446 104.910 104.190 C 97.348 112.104 90.382 120.567 84.070 129.510 C 69.180 122.411 53.141 118.029 36.710 116.570 C 38.062 105.701 41.358 95.163 46.440 85.460 ZM 55.760 184.900 C 42.943 168.705 35.979 148.653 36.000 128.000 C 36.000 126.840 36.000 125.700 36.070 124.550 C 51.123 125.894 65.828 129.843 79.530 136.220 C 69.617 151.397 61.632 167.750 55.760 184.900 ZM 61.880 191.900 C 81.517 130.597 127.786 81.439 187.790 58.130 C 196.448 65.553 203.662 74.509 209.070 84.550 C 149.995 103.444 104.823 151.440 89.540 211.550 C 79.189 206.758 69.812 200.097 61.880 191.900 ZM 128.000 220.000 C 117.434 220.011 106.946 218.194 97.000 214.630 C 111.413 156.306 155.243 109.747 212.590 91.840 C 216.846 101.755 219.311 112.345 219.870 123.120 C 175.148 138.072 140.906 174.455 128.690 220.000 ZM 219.920 131.550 C 218.094 177.417 182.782 214.943 137.110 219.550 C 148.964 178.611 179.777 145.868 219.920 131.550 Z"),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null
