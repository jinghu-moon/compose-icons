package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorFillIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 128.700 C 239.620 185.190 193.540 231.430 137.060 231.990 C 128.322 232.082 119.607 231.074 111.120 228.990 C 110.089 228.733 109.202 228.076 108.657 227.164 C 108.111 226.252 107.950 225.160 108.210 224.130 L 116.850 189.580 C 125.277 193.803 134.574 196.002 144.000 196.000 C 181.000 196.000 210.700 162.550 207.810 122.640 C 205.668 94.340 187.102 69.938 160.398 60.327 C 133.694 50.716 103.835 57.689 84.150 78.133 C 64.465 98.578 58.626 128.679 69.240 155.000 C 70.056 157.031 71.668 158.639 73.701 159.450 C 75.734 160.261 78.011 160.203 80.000 159.290 C 83.897 157.401 85.650 152.804 84.000 148.800 C 75.832 128.316 80.446 104.945 95.786 89.103 C 111.126 73.260 134.336 67.895 155.073 75.399 C 175.809 82.904 190.211 101.879 191.860 123.870 C 194.000 154.400 171.730 180.000 144.000 180.000 C 135.845 179.996 127.845 177.770 120.860 173.560 L 135.760 113.940 C 136.746 109.688 134.142 105.431 129.907 104.372 C 125.673 103.313 121.371 105.844 120.240 110.060 L 93.380 217.510 C 93.085 218.695 92.264 219.681 91.151 220.185 C 90.039 220.690 88.756 220.659 87.670 220.100 C 53.078 201.948 31.576 165.943 32.000 126.880 C 32.600 70.520 78.670 24.520 135.000 24.000 C 162.877 23.731 189.695 34.666 209.436 54.351 C 229.177 74.036 240.189 100.822 240.000 128.700 Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
