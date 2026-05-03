package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorLightIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.000 120.000 C 245.972 94.606 225.394 74.028 200.000 74.000 L 160.150 74.000 C 157.570 73.850 106.050 70.430 57.000 29.290 C 52.834 25.794 47.020 25.027 42.090 27.322 C 37.160 29.618 34.005 34.561 34.000 40.000 L 34.000 200.000 C 33.963 205.446 37.121 210.407 42.070 212.680 C 43.928 213.544 45.951 213.994 48.000 214.000 C 51.296 214.002 54.486 212.832 57.000 210.700 C 97.000 177.180 138.570 168.700 154.000 166.630 L 154.000 200.630 C 153.999 205.311 156.336 209.682 160.230 212.280 L 171.230 219.610 C 175.005 222.124 179.764 222.653 184.000 221.030 C 188.235 219.407 191.422 215.833 192.550 211.440 L 204.680 165.730 C 228.123 163.300 245.952 143.569 246.000 120.000 ZM 49.290 201.520 C 48.696 202.021 47.866 202.133 47.161 201.807 C 46.456 201.481 46.003 200.777 46.000 200.000 L 46.000 40.000 C 45.978 39.221 46.434 38.507 47.150 38.200 C 47.416 38.074 47.706 38.006 48.000 38.000 C 48.464 38.002 48.912 38.172 49.260 38.480 C 93.260 75.400 138.260 83.670 153.970 85.480 L 153.970 154.480 C 138.290 156.330 93.300 164.610 49.290 201.520 ZM 180.930 208.520 C 180.773 209.151 180.318 209.666 179.711 209.901 C 179.104 210.136 178.421 210.061 177.880 209.700 L 166.880 202.370 C 166.322 201.998 165.988 201.371 165.990 200.700 L 165.990 166.000 L 192.190 166.000 ZM 200.000 154.000 L 166.000 154.000 L 166.000 86.000 L 200.000 86.000 C 218.778 86.000 234.000 101.222 234.000 120.000 C 234.000 138.778 218.778 154.000 200.000 154.000 Z"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
