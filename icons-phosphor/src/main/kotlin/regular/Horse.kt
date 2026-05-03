package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorRegularIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 100.000 C 136.000 106.627 130.627 112.000 124.000 112.000 C 117.373 112.000 112.000 106.627 112.000 100.000 C 112.000 93.373 117.373 88.000 124.000 88.000 C 130.627 88.000 136.000 93.373 136.000 100.000 ZM 232.000 129.480 C 231.064 185.468 186.081 230.725 130.100 232.000 L 127.930 232.000 C 102.426 232.179 77.756 222.918 58.670 206.000 C 55.356 203.054 55.059 197.979 58.005 194.665 C 60.951 191.351 66.026 191.054 69.340 194.000 C 75.367 199.393 82.136 203.896 89.440 207.370 L 116.000 170.840 C 93.220 161.010 68.530 165.190 54.600 167.550 C 42.570 169.628 30.411 164.644 23.300 154.720 L 23.000 154.290 L 9.220 132.290 C 8.091 130.483 7.730 128.300 8.216 126.226 C 8.702 124.152 9.996 122.357 11.810 121.240 L 112.000 59.530 L 112.000 32.000 C 112.000 27.582 115.582 24.000 120.000 24.000 L 128.000 24.000 C 155.841 23.997 182.520 35.157 202.067 54.982 C 221.614 74.807 232.396 101.642 232.000 129.480 ZM 216.000 129.260 C 216.337 105.703 207.215 82.995 190.675 66.218 C 174.135 49.442 151.559 39.998 128.000 40.000 L 128.000 64.000 C 127.998 66.777 126.556 69.355 124.190 70.810 L 27.060 130.590 L 36.420 145.590 C 40.021 150.438 46.055 152.832 52.000 151.770 C 68.000 149.070 100.770 143.530 130.070 159.950 C 151.316 158.819 167.972 141.276 168.000 120.000 C 168.000 115.582 171.582 112.000 176.000 112.000 C 180.418 112.000 184.000 115.582 184.000 120.000 C 183.960 149.281 161.396 173.600 132.200 175.830 L 105.090 213.110 C 113.149 215.200 121.456 216.172 129.780 216.000 C 177.135 214.897 215.181 176.621 216.000 129.260 Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
