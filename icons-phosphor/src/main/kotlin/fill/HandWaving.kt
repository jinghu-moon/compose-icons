package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandWaving: ImageVector
    get() {
        if (_handWaving != null) return _handWaving!!
        _handWaving = phosphorFillIcon(
            name = "HandWaving",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.310 98.460 C 235.480 125.677 235.785 159.482 220.109 186.986 C 204.432 214.490 175.190 231.454 143.531 231.409 C 111.873 231.364 82.679 214.318 67.080 186.770 L 67.080 186.770 L 26.150 115.880 C 22.103 108.271 24.810 98.825 32.271 94.513 C 39.733 90.202 49.269 92.574 53.840 99.880 L 72.400 132.000 C 74.609 135.827 79.503 137.139 83.330 134.930 C 87.157 132.721 88.469 127.827 86.260 124.000 L 47.000 56.000 C 42.953 48.391 45.660 38.945 53.121 34.633 C 60.583 30.322 70.119 32.694 74.690 40.000 L 114.000 108.000 C 115.388 110.556 118.053 112.157 120.962 112.182 C 123.870 112.207 126.563 110.652 127.994 108.120 C 129.426 105.588 129.370 102.479 127.850 100.000 L 97.850 48.000 C 93.564 40.361 96.217 30.695 103.803 26.315 C 111.389 21.935 121.087 24.469 125.560 32.000 L 166.000 102.120 C 157.058 111.132 152.028 123.305 152.000 136.000 C 151.970 146.391 155.342 156.505 161.600 164.800 C 163.298 167.136 166.124 168.376 168.993 168.043 C 171.862 167.710 174.329 165.856 175.447 163.193 C 176.565 160.530 176.161 157.471 174.390 155.190 C 169.279 148.366 167.102 139.784 168.343 131.349 C 169.584 122.914 174.140 115.323 181.000 110.260 C 184.270 107.841 185.203 103.353 183.170 99.830 L 171.710 80.000 C 167.424 72.361 170.077 62.695 177.663 58.315 C 185.249 53.935 194.947 56.469 199.420 64.000 L 219.310 98.460 ZM 189.940 41.460 C 201.262 44.444 210.916 51.842 216.740 62.000 L 217.070 62.570 C 219.279 66.397 224.173 67.709 228.000 65.500 C 231.827 63.291 233.139 58.397 230.930 54.570 L 230.600 54.000 C 222.658 40.153 209.496 30.067 194.060 26.000 C 189.805 24.900 185.459 27.438 184.327 31.685 C 183.195 35.932 185.702 40.297 189.940 41.460 ZM 79.580 225.720 C 69.214 217.539 60.507 207.451 53.930 196.000 C 51.721 192.173 46.827 190.861 43.000 193.070 C 39.173 195.279 37.861 200.173 40.070 204.000 C 47.662 217.208 57.709 228.844 69.670 238.280 C 73.142 240.951 78.116 240.333 80.829 236.895 C 83.542 233.456 82.985 228.475 79.580 225.720 Z"),
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
        return _handWaving!!
    }

private var _handWaving: ImageVector? = null
