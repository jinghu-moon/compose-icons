package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorFillIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 120.000 C 213.243 120.001 210.681 121.422 209.220 123.760 C 205.044 130.470 200.431 136.897 195.410 143.000 L 193.780 134.430 L 193.780 134.430 L 178.320 53.070 C 177.286 47.547 173.430 42.972 168.163 41.016 C 162.895 39.060 156.988 40.011 152.600 43.520 L 152.470 43.620 L 128.000 64.000 L 103.530 43.620 L 103.400 43.520 C 99.015 40.011 93.111 39.058 87.844 41.009 C 82.578 42.961 78.720 47.531 77.680 53.050 L 62.230 134.380 L 62.230 134.380 L 60.590 143.000 C 55.567 136.895 50.954 130.464 46.780 123.750 C 45.316 121.416 42.755 119.999 40.000 120.000 C 17.909 120.000 0.000 137.909 0.000 160.000 C 0.000 182.091 17.909 200.000 40.000 200.000 L 216.000 200.000 C 238.091 200.000 256.000 182.091 256.000 160.000 C 256.000 137.909 238.091 120.000 216.000 120.000 ZM 76.680 144.000 L 179.310 144.000 L 181.850 157.350 C 173.719 164.996 164.503 171.399 154.500 176.350 C 139.100 183.770 128.060 184.000 128.000 184.000 C 127.670 184.000 102.510 183.600 74.140 157.400 Z"),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
