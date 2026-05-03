package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorRegularIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 120.000 C 231.934 62.590 185.410 16.066 128.000 16.000 L 128.000 16.000 C 70.590 16.066 24.066 62.590 24.000 120.000 C 23.996 122.448 25.121 124.762 27.050 126.270 C 27.095 126.319 27.146 126.362 27.200 126.400 L 120.000 196.000 L 120.000 216.000 L 112.000 216.000 C 107.582 216.000 104.000 219.582 104.000 224.000 C 104.000 228.418 107.582 232.000 112.000 232.000 L 144.000 232.000 C 148.418 232.000 152.000 228.418 152.000 224.000 C 152.000 219.582 148.418 216.000 144.000 216.000 L 136.000 216.000 L 136.000 196.000 L 228.800 126.400 L 228.800 126.400 C 230.814 124.889 232.000 122.518 232.000 120.000 ZM 215.640 112.000 L 175.830 112.000 C 174.290 74.050 161.920 49.570 150.720 35.000 C 186.328 44.574 212.222 75.287 215.640 112.000 ZM 128.000 34.000 C 133.358 38.735 138.030 44.194 141.880 50.220 C 149.490 62.000 158.450 81.870 159.820 112.000 L 96.180 112.000 C 97.550 81.870 106.510 62.000 114.120 50.260 C 117.967 44.220 122.639 38.747 128.000 34.000 ZM 154.400 128.000 L 128.000 175.530 L 101.600 128.000 ZM 83.290 128.000 L 102.790 163.090 L 56.000 128.000 ZM 172.710 128.000 L 200.000 128.000 L 153.210 163.090 ZM 105.280 35.000 C 94.080 49.570 81.710 74.050 80.170 112.000 L 40.360 112.000 C 43.778 75.287 69.672 44.574 105.280 35.000 Z"),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
