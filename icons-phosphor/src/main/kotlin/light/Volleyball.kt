package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorLightIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 211.370 161.890 C 182.233 182.149 143.911 183.394 113.520 165.070 L 131.460 134.000 L 217.800 134.000 C 217.167 143.581 214.996 152.999 211.370 161.890 ZM 88.300 47.240 C 96.908 42.996 106.143 40.163 115.650 38.850 C 147.767 53.951 168.012 86.516 167.340 122.000 L 131.460 122.000 ZM 217.800 122.000 L 179.340 122.000 C 179.878 89.267 164.691 58.260 138.500 38.620 C 181.541 43.736 214.848 78.757 217.800 122.000 ZM 77.920 53.260 L 97.130 86.530 C 68.517 102.435 49.260 131.089 45.340 163.590 C 28.181 123.768 41.881 77.373 77.920 53.260 ZM 57.000 183.190 C 54.052 147.852 72.130 114.077 103.170 96.930 L 121.070 128.000 L 77.920 202.740 C 69.954 197.374 62.893 190.774 57.000 183.190 ZM 128.000 218.000 C 114.232 218.015 100.646 214.853 88.300 208.760 L 107.520 175.470 C 135.583 192.291 170.006 194.648 200.100 181.810 C 183.131 204.584 156.400 218.001 128.000 218.000 Z"),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
