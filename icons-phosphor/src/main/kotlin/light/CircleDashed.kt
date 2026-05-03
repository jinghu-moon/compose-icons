package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorLightIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 98.190 36.540 C 97.361 33.334 99.285 30.063 102.490 29.230 C 119.216 24.917 136.764 24.917 153.490 29.230 C 156.699 30.058 158.628 33.331 157.800 36.540 C 156.972 39.749 153.699 41.678 150.490 40.850 C 135.732 37.040 120.248 37.040 105.490 40.850 C 102.284 41.672 99.018 39.744 98.190 36.540 ZM 55.190 56.540 C 43.094 68.867 34.324 84.061 29.700 100.700 C 29.277 102.234 29.480 103.874 30.266 105.258 C 31.052 106.642 32.356 107.657 33.890 108.080 C 34.411 108.227 34.949 108.301 35.490 108.300 C 38.186 108.299 40.551 106.499 41.270 103.900 C 45.363 89.238 53.108 75.854 63.780 65.000 C 66.102 62.636 66.069 58.837 63.705 56.515 C 61.341 54.193 57.542 54.226 55.220 56.590 ZM 41.280 152.090 C 40.759 149.967 39.125 148.295 37.015 147.726 C 34.904 147.156 32.651 147.780 31.134 149.354 C 29.616 150.927 29.075 153.201 29.720 155.290 C 34.338 171.938 43.109 187.140 55.210 199.470 C 57.555 201.696 61.243 201.663 63.548 199.396 C 65.853 197.128 65.947 193.442 63.760 191.060 C 53.092 180.180 45.358 166.772 41.280 152.090 ZM 150.490 215.150 C 135.732 218.960 120.248 218.960 105.490 215.150 C 102.281 214.322 99.008 216.251 98.180 219.460 C 97.352 222.669 99.281 225.942 102.490 226.770 C 119.217 231.082 136.763 231.082 153.490 226.770 C 156.699 225.942 158.628 222.669 157.800 219.460 C 156.972 216.251 153.699 214.322 150.490 215.150 ZM 222.110 147.920 C 218.918 147.038 215.615 148.909 214.730 152.100 C 210.653 166.797 202.907 180.217 192.220 191.100 C 189.898 193.464 189.931 197.263 192.295 199.585 C 194.659 201.907 198.458 201.874 200.780 199.510 C 212.892 187.171 221.673 171.959 226.300 155.300 C 226.723 153.766 226.520 152.126 225.734 150.742 C 224.948 149.358 223.644 148.343 222.110 147.920 ZM 214.720 103.920 C 215.439 106.519 217.804 108.319 220.500 108.320 C 221.041 108.321 221.579 108.247 222.100 108.100 C 225.291 107.215 227.162 103.912 226.280 100.720 C 221.662 84.072 212.891 68.870 200.790 56.540 C 198.445 54.314 194.757 54.347 192.452 56.614 C 190.147 58.882 190.053 62.568 192.240 64.950 C 202.908 75.826 210.643 89.231 214.720 103.910 Z"),
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
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
