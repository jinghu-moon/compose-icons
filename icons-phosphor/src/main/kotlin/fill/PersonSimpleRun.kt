package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorFillIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 56.000 C 120.000 38.327 134.327 24.000 152.000 24.000 C 169.673 24.000 184.000 38.327 184.000 56.000 C 184.000 73.673 169.673 88.000 152.000 88.000 C 134.327 88.000 120.000 73.673 120.000 56.000 ZM 223.280 130.080 C 222.407 128.142 220.799 126.631 218.810 125.880 C 216.821 125.130 214.616 125.202 212.680 126.080 C 212.430 126.200 185.970 136.800 140.500 105.890 C 88.210 70.350 52.500 98.120 50.990 99.320 C 48.657 101.072 47.464 103.956 47.875 106.845 C 48.287 109.733 50.238 112.169 52.967 113.200 C 55.697 114.231 58.771 113.695 60.990 111.800 C 61.250 111.590 86.110 92.300 125.060 115.070 C 120.810 128.420 112.300 146.890 99.810 162.070 C 81.250 184.550 58.700 194.630 32.810 192.070 C 28.411 191.625 24.485 194.831 24.040 199.230 C 23.595 203.629 26.801 207.555 31.200 208.000 C 34.303 208.314 37.421 208.471 40.540 208.470 C 67.920 208.470 92.540 196.090 112.170 172.290 C 112.740 171.600 113.310 170.890 113.860 170.190 C 133.310 175.290 168.000 190.300 168.000 232.000 C 168.000 236.418 171.582 240.000 176.000 240.000 C 180.418 240.000 184.000 236.418 184.000 232.000 C 184.000 207.350 173.920 186.650 154.850 172.140 C 145.381 165.140 134.794 159.795 123.540 156.330 C 129.823 146.131 135.005 135.293 139.000 124.000 C 165.140 140.090 185.840 144.000 199.690 144.000 C 211.870 144.000 218.750 141.000 219.360 140.720 C 221.294 139.833 222.795 138.211 223.531 136.214 C 224.266 134.218 224.176 132.010 223.280 130.080 Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
