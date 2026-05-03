package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorRegularIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 155.640 199.280 C 128.836 185.622 111.960 158.083 111.960 128.000 C 111.960 97.917 128.836 70.378 155.640 56.720 C 158.317 55.353 160.002 52.601 160.002 49.595 C 160.002 46.589 158.317 43.837 155.640 42.470 C 142.139 35.542 127.174 31.952 112.000 32.000 C 58.981 32.000 16.000 74.981 16.000 128.000 C 16.000 181.019 58.981 224.000 112.000 224.000 C 127.174 224.048 142.139 220.458 155.640 213.530 C 158.317 212.163 160.002 209.411 160.002 206.405 C 160.002 203.399 158.317 200.647 155.640 199.280 ZM 112.000 208.000 C 80.731 207.946 52.360 189.679 39.369 161.237 C 26.378 132.795 31.149 99.390 51.582 75.722 C 72.016 52.053 104.366 42.459 134.400 51.160 C 110.225 69.307 96.000 97.772 96.000 128.000 C 96.000 158.228 110.225 186.693 134.400 204.840 C 127.121 206.951 119.579 208.015 112.000 208.000 ZM 251.170 120.650 L 224.670 109.220 L 222.360 79.380 C 222.104 76.131 219.903 73.363 216.796 72.381 C 213.689 71.398 210.297 72.399 208.220 74.910 L 189.630 97.420 L 161.920 90.570 C 158.796 89.801 155.516 90.978 153.594 93.557 C 151.671 96.136 151.481 99.616 153.110 102.390 L 168.180 128.000 L 153.110 153.610 C 151.481 156.384 151.671 159.864 153.594 162.443 C 155.516 165.022 158.796 166.199 161.920 165.430 L 189.630 158.580 L 208.220 181.090 C 210.297 183.601 213.689 184.602 216.796 183.619 C 219.903 182.637 222.104 179.869 222.360 176.620 L 224.670 146.780 L 251.170 135.350 C 254.108 134.088 256.011 131.197 256.011 128.000 C 256.011 124.803 254.108 121.912 251.170 120.650 ZM 213.890 134.000 C 211.165 135.179 209.317 137.770 209.090 140.730 L 207.940 155.620 L 198.760 144.510 C 197.241 142.668 194.978 141.601 192.590 141.600 C 191.943 141.602 191.299 141.680 190.670 141.830 L 176.550 145.330 L 184.360 132.060 C 185.836 129.554 185.836 126.446 184.360 123.940 L 176.550 110.670 L 190.670 114.170 C 193.658 114.907 196.803 113.865 198.760 111.490 L 207.940 100.380 L 209.090 115.270 C 209.317 118.230 211.165 120.821 213.890 122.000 L 227.810 128.000 Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
