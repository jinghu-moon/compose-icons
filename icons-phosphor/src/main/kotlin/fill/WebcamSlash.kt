package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorFillIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 83.340 43.190 C 82.567 42.323 82.209 41.163 82.358 40.012 C 82.508 38.860 83.151 37.830 84.120 37.190 C 116.995 15.808 160.523 21.409 186.914 50.417 C 213.304 79.426 214.777 123.287 190.390 154.000 C 189.663 154.927 188.564 155.487 187.386 155.529 C 186.208 155.572 185.072 155.093 184.280 154.220 L 167.850 136.140 C 166.590 134.750 166.465 132.671 167.550 131.140 C 180.108 112.783 178.410 88.202 163.447 71.746 C 148.484 55.290 124.175 51.269 104.710 62.030 C 103.084 62.958 101.031 62.634 99.770 61.250 ZM 126.930 72.000 C 124.069 72.092 121.233 72.569 118.500 73.420 C 117.172 73.820 116.146 74.881 115.789 76.222 C 115.432 77.563 115.796 78.992 116.750 80.000 L 150.870 117.530 C 151.794 118.549 153.176 119.023 154.531 118.783 C 155.886 118.543 157.022 117.624 157.540 116.350 C 159.174 112.438 160.010 108.239 160.000 104.000 C 159.906 95.356 156.357 87.109 150.145 81.097 C 143.932 75.086 135.573 71.810 126.930 72.000 ZM 213.380 221.900 C 210.110 224.871 205.051 224.629 202.080 221.360 L 197.190 216.000 L 32.000 216.000 C 29.783 216.005 27.664 215.090 26.147 213.473 C 24.631 211.856 23.853 209.682 24.000 207.470 C 24.367 203.195 27.979 199.932 32.270 200.000 L 120.000 200.000 L 120.000 183.600 C 92.939 180.902 69.107 164.629 56.742 140.408 C 44.376 116.187 45.174 87.340 58.860 63.840 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 L 213.920 210.620 C 216.891 213.890 216.649 218.949 213.380 221.920 ZM 128.000 152.000 C 131.361 151.997 134.713 151.641 138.000 150.940 L 124.210 135.770 C 108.384 133.886 96.356 120.644 96.000 104.710 L 82.230 89.550 C 77.626 104.134 80.247 120.039 89.288 132.375 C 98.329 144.710 112.706 151.999 128.000 152.000 ZM 182.640 200.000 L 161.420 176.660 C 153.393 180.376 144.801 182.722 136.000 183.600 L 136.000 200.000 Z"),
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
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
