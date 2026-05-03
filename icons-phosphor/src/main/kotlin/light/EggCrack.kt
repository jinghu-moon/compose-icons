package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorLightIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 185.000 60.670 C 167.180 34.000 145.870 18.000 128.000 18.000 C 110.130 18.000 88.820 34.000 71.000 60.670 C 52.570 88.320 42.000 121.610 42.000 152.000 C 42.000 199.496 80.504 238.000 128.000 238.000 C 175.496 238.000 214.000 199.496 214.000 152.000 C 214.000 121.610 203.430 88.320 185.000 60.670 ZM 128.000 226.000 C 87.151 225.950 54.050 192.849 54.000 152.000 C 54.000 123.920 63.840 93.060 81.000 67.330 C 96.110 44.650 114.560 30.000 128.000 30.000 C 138.520 30.000 152.120 39.000 164.780 53.770 L 123.520 100.000 C 122.119 101.564 121.638 103.747 122.251 105.756 C 122.865 107.764 124.484 109.306 126.520 109.820 L 153.000 116.430 L 146.130 150.820 C 145.480 154.067 147.583 157.227 150.830 157.880 C 151.215 157.958 151.607 157.998 152.000 158.000 C 154.854 157.994 157.309 155.978 157.870 153.180 L 165.870 113.180 C 166.500 110.041 164.555 106.960 161.450 106.180 L 139.080 100.590 L 172.280 63.390 Q 173.640 65.310 175.000 67.330 C 192.150 93.060 202.000 123.920 202.000 152.000 C 201.950 192.849 168.849 225.950 128.000 226.000 Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
