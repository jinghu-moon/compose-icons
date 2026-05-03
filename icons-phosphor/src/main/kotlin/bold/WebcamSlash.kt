package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorBoldIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.880 207.930 L 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 53.930 64.360 C 41.007 88.511 40.671 117.446 53.030 141.891 C 65.388 166.335 88.889 183.219 116.000 187.130 L 116.000 196.000 L 32.000 196.000 C 25.373 196.000 20.000 201.373 20.000 208.000 C 20.000 214.627 25.373 220.000 32.000 220.000 L 195.420 220.000 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 68.000 104.000 C 67.992 97.084 69.183 90.219 71.520 83.710 L 84.430 97.910 C 82.668 110.518 86.453 123.272 94.808 132.877 C 103.163 142.482 115.269 147.998 128.000 148.000 C 128.640 148.000 129.280 148.000 129.920 147.950 L 142.820 162.140 C 124.870 166.716 105.812 162.743 91.185 151.377 C 76.557 140.010 68.000 122.524 68.000 104.000 ZM 140.000 196.000 L 140.000 187.130 C 147.016 186.118 153.877 184.227 160.420 181.500 L 173.600 196.000 ZM 88.890 42.350 C 87.649 39.419 87.623 36.116 88.817 33.166 C 90.012 30.216 92.329 27.861 95.260 26.620 C 128.117 12.697 166.185 21.054 190.189 47.460 C 214.193 73.865 218.893 112.555 201.910 143.940 C 199.812 147.817 195.758 150.232 191.350 150.230 C 189.358 150.234 187.398 149.735 185.650 148.780 C 179.825 145.625 177.659 138.347 180.810 132.520 C 192.946 110.100 189.588 82.459 172.438 63.596 C 155.288 44.733 128.091 38.767 104.620 48.720 C 101.689 49.961 98.386 49.987 95.436 48.793 C 92.486 47.598 90.131 45.281 88.890 42.350 ZM 172.000 103.640 C 172.027 106.823 170.788 109.885 168.556 112.155 C 166.324 114.424 163.283 115.714 160.100 115.740 L 160.000 115.740 C 153.408 115.740 148.049 110.422 148.000 103.830 C 147.917 93.645 140.192 85.149 130.060 84.100 C 125.713 83.770 121.887 81.108 120.066 77.148 C 118.245 73.187 118.715 68.550 121.294 65.035 C 123.873 61.521 128.155 59.681 132.480 60.230 C 154.809 62.478 171.852 81.198 172.000 103.640 Z"),
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
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
