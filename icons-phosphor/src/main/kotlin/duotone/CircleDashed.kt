package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorDuotoneIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 96.260 37.000 C 95.178 32.736 97.742 28.398 102.000 27.290 C 119.054 22.892 136.946 22.892 154.000 27.290 C 157.909 28.291 160.460 32.045 159.952 36.048 C 159.444 40.050 156.035 43.048 152.000 43.040 C 151.325 43.036 150.653 42.949 150.000 42.780 C 135.569 39.058 120.431 39.058 106.000 42.780 C 103.942 43.308 101.758 42.995 99.931 41.910 C 98.104 40.826 96.783 39.059 96.260 37.000 ZM 53.790 55.140 C 41.455 67.698 32.509 83.181 27.790 100.140 C 26.972 102.913 27.714 105.911 29.731 107.983 C 31.747 110.055 34.724 110.877 37.518 110.134 C 40.312 109.392 42.488 107.199 43.210 104.400 C 47.199 90.048 54.769 76.944 65.210 66.320 C 68.046 63.130 67.878 58.274 64.828 55.288 C 61.777 52.302 56.919 52.237 53.790 55.140 ZM 43.210 151.550 C 42.028 147.292 37.618 144.798 33.360 145.980 C 29.102 147.162 26.608 151.572 27.790 155.830 C 32.509 172.789 41.455 188.272 53.790 200.830 C 55.775 202.950 58.752 203.828 61.570 203.123 C 64.387 202.419 66.601 200.243 67.355 197.439 C 68.109 194.635 67.284 191.642 65.200 189.620 C 54.772 178.991 47.207 165.894 43.210 151.550 ZM 150.000 213.220 C 135.570 216.946 120.430 216.946 106.000 213.220 C 103.216 212.455 100.236 213.250 98.202 215.300 C 96.169 217.350 95.397 220.336 96.184 223.114 C 96.971 225.892 99.194 228.031 102.000 228.710 C 119.054 233.108 136.946 233.108 154.000 228.710 C 158.215 227.553 160.720 223.227 159.627 218.995 C 158.535 214.764 154.248 212.192 150.000 213.220 ZM 222.650 146.000 C 220.605 145.432 218.418 145.700 216.571 146.744 C 214.724 147.789 213.367 149.525 212.800 151.570 C 208.814 165.926 201.244 179.034 190.800 189.660 C 187.704 192.814 187.751 197.879 190.905 200.975 C 194.059 204.071 199.124 204.024 202.220 200.870 C 214.554 188.311 223.499 172.828 228.220 155.870 C 228.794 153.822 228.529 151.631 227.484 149.779 C 226.439 147.927 224.700 146.567 222.650 146.000 ZM 212.790 104.460 C 213.972 108.718 218.382 111.212 222.640 110.030 C 226.898 108.848 229.392 104.438 228.210 100.180 C 223.491 83.221 214.545 67.738 202.210 55.180 C 200.225 53.060 197.248 52.182 194.430 52.887 C 191.613 53.591 189.399 55.767 188.645 58.571 C 187.891 61.375 188.716 64.368 190.800 66.390 C 201.227 77.016 208.792 90.110 212.790 104.450 Z"),
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
