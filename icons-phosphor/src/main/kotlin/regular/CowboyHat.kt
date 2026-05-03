package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorRegularIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 120.000 C 213.243 120.001 210.681 121.422 209.220 123.760 C 205.044 130.470 200.431 136.897 195.410 143.000 L 178.320 53.070 C 177.286 47.547 173.430 42.972 168.163 41.016 C 162.895 39.060 156.988 40.011 152.600 43.520 L 152.470 43.620 L 128.000 64.000 L 103.530 43.620 L 103.400 43.520 C 99.015 40.011 93.111 39.058 87.844 41.009 C 82.578 42.961 78.720 47.531 77.680 53.050 L 60.590 143.000 C 55.567 136.895 50.954 130.464 46.780 123.750 C 45.316 121.416 42.755 119.999 40.000 120.000 C 17.909 120.000 0.000 137.909 0.000 160.000 C 0.000 182.091 17.909 200.000 40.000 200.000 L 216.000 200.000 C 238.091 200.000 256.000 182.091 256.000 160.000 C 256.000 137.909 238.091 120.000 216.000 120.000 ZM 93.410 56.000 L 117.880 76.400 L 118.000 76.500 C 123.835 81.210 132.165 81.210 138.000 76.500 L 138.120 76.400 L 162.590 56.000 L 176.270 128.000 L 79.730 128.000 ZM 40.000 184.000 C 27.551 183.999 17.169 174.480 16.091 162.078 C 15.014 149.676 23.598 138.508 35.860 136.360 C 51.280 159.830 67.730 174.650 82.400 184.000 ZM 128.000 184.000 C 127.670 184.000 102.510 183.600 74.140 157.400 L 76.680 144.000 L 179.310 144.000 L 181.850 157.350 C 173.719 164.996 164.503 171.399 154.500 176.350 C 139.100 183.770 128.060 184.000 128.000 184.000 ZM 216.000 184.000 L 173.600 184.000 C 188.270 174.650 204.720 159.830 220.140 136.360 C 232.402 138.508 240.986 149.676 239.909 162.078 C 238.831 174.480 228.449 183.999 216.000 184.000 Z"),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
