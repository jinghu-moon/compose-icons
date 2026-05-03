package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorThinIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 55.000 62.670 C 46.340 74.930 36.000 96.220 36.000 128.000 C 36.000 159.780 46.340 181.070 55.000 193.330 C 64.410 206.630 74.000 212.520 74.060 212.570 C 75.602 213.495 76.337 215.336 75.857 217.069 C 75.376 218.802 73.798 220.001 72.000 220.000 C 71.295 219.990 70.605 219.793 70.000 219.430 C 68.230 218.400 28.000 193.510 28.000 128.000 C 28.000 62.490 68.230 37.600 69.940 36.570 C 71.834 35.430 74.295 36.041 75.435 37.935 C 76.575 39.829 75.964 42.290 74.070 43.430 C 74.000 43.480 64.420 49.370 55.000 62.670 ZM 186.050 36.570 C 184.156 35.430 181.695 36.041 180.555 37.935 C 179.415 39.829 180.026 42.290 181.920 43.430 C 182.020 43.430 191.570 49.370 200.980 62.670 C 209.650 74.930 219.980 96.220 219.980 128.000 C 219.980 159.780 209.640 181.070 200.980 193.330 C 191.570 206.630 181.980 212.520 181.930 212.570 C 180.036 213.708 179.422 216.166 180.560 218.060 C 181.698 219.954 184.156 220.568 186.050 219.430 C 187.760 218.430 227.990 193.510 227.990 128.000 C 227.990 62.490 187.770 37.600 186.060 36.570 Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
