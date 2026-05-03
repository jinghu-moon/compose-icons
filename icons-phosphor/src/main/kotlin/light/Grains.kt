package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorLightIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 58.000 C 196.730 57.990 185.569 60.210 175.160 64.530 C 161.450 34.310 132.000 19.300 130.680 18.630 C 128.993 17.788 127.007 17.788 125.320 18.630 C 123.990 19.300 94.550 34.310 80.840 64.530 C 70.431 60.210 59.270 57.991 48.000 58.000 C 44.686 58.000 42.000 60.686 42.000 64.000 L 42.000 144.000 C 42.000 191.496 80.504 230.000 128.000 230.000 C 175.496 230.000 214.000 191.496 214.000 144.000 L 214.000 64.000 C 214.000 60.686 211.314 58.000 208.000 58.000 ZM 122.000 217.760 C 83.605 214.589 54.046 182.525 54.000 144.000 L 54.000 126.240 C 92.395 129.411 121.954 161.475 122.000 200.000 ZM 122.000 156.250 C 107.598 131.940 82.185 116.244 54.000 114.250 L 54.000 70.250 C 92.388 73.426 121.944 105.480 122.000 144.000 ZM 91.580 69.910 C 101.240 48.310 120.850 35.130 128.000 30.910 C 135.160 35.160 154.760 48.340 164.410 69.910 C 147.884 79.674 135.075 94.657 128.000 112.500 C 120.924 94.654 108.111 79.670 91.580 69.910 ZM 202.000 144.000 C 201.954 182.525 172.395 214.589 134.000 217.760 L 134.000 200.000 C 134.046 161.475 163.605 129.411 202.000 126.240 ZM 202.000 114.230 C 173.815 116.224 148.402 131.920 134.000 156.230 L 134.000 144.000 C 134.051 105.477 163.608 73.416 202.000 70.240 Z"),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
