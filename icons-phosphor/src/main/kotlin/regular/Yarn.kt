package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorRegularIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 216.000 L 183.390 216.000 C 227.205 188.395 244.019 132.750 222.822 85.501 C 201.625 38.252 148.883 13.812 99.131 28.183 C 49.379 42.554 17.794 91.354 25.056 142.628 C 32.319 193.902 76.214 232.011 128.000 232.000 L 232.000 232.000 C 236.418 232.000 240.000 228.418 240.000 224.000 C 240.000 219.582 236.418 216.000 232.000 216.000 ZM 128.000 40.000 C 143.425 39.983 158.580 44.044 171.930 51.770 C 162.289 56.129 152.972 61.172 144.050 66.860 C 129.927 57.854 114.831 50.474 99.050 44.860 C 108.358 41.622 118.145 39.979 128.000 40.000 ZM 78.560 55.240 C 96.491 60.093 113.684 67.348 129.670 76.810 C 122.839 81.952 116.305 87.477 110.100 93.360 C 93.682 84.623 76.019 78.462 57.730 75.090 C 63.546 67.383 70.582 60.678 78.560 55.240 ZM 48.720 89.820 C 65.990 92.344 82.753 97.578 98.390 105.330 C 92.837 111.432 87.619 117.832 82.760 124.500 C 69.595 118.591 55.609 114.713 41.280 113.000 C 42.668 104.964 45.172 97.162 48.720 89.820 ZM 40.000 129.000 C 51.572 130.430 62.890 133.459 73.630 138.000 C 66.048 150.172 59.662 163.048 54.560 176.450 C 45.229 162.370 40.172 145.890 40.000 129.000 ZM 66.420 190.810 C 85.860 132.487 129.953 85.655 187.000 62.740 C 193.315 68.454 198.777 75.044 203.220 82.310 C 146.675 102.092 103.310 148.177 87.000 205.820 C 79.456 201.834 72.528 196.778 66.430 190.810 ZM 125.660 216.000 C 117.570 215.773 109.551 214.427 101.830 212.000 C 116.475 157.897 157.161 114.676 210.280 96.790 C 213.155 104.353 214.966 112.279 215.660 120.340 C 172.073 135.975 138.611 171.541 125.660 216.000 ZM 215.480 137.560 C 211.164 176.615 181.531 208.103 142.810 214.780 C 154.797 179.778 181.275 151.632 215.480 137.530 Z"),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null
