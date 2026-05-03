package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorLightIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.450 40.190 C 221.273 37.152 218.848 34.727 215.810 34.550 C 140.430 30.110 80.140 52.710 54.530 95.000 C 37.090 123.790 37.770 157.800 56.320 191.200 L 35.760 211.760 C 34.155 213.256 33.494 215.508 34.037 217.634 C 34.580 219.760 36.240 221.420 38.366 221.963 C 40.492 222.506 42.744 221.845 44.240 220.240 L 64.800 199.680 C 82.070 209.270 99.500 214.090 116.290 214.090 C 132.073 214.097 147.550 209.728 161.000 201.470 C 203.290 175.860 225.880 115.570 221.450 40.190 ZM 154.790 191.190 C 130.710 205.770 102.150 205.560 73.660 190.800 L 164.250 100.210 C 166.453 97.846 166.388 94.162 164.103 91.877 C 161.818 89.592 158.134 89.527 155.770 91.730 L 65.180 182.340 C 50.420 153.850 50.180 125.340 64.790 101.210 C 87.470 63.780 141.420 43.410 209.790 46.260 C 212.590 114.580 192.220 168.540 154.790 191.210 Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
