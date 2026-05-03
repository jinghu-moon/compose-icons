package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorLightIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 94.000 164.000 C 94.000 169.523 89.523 174.000 84.000 174.000 C 78.477 174.000 74.000 169.523 74.000 164.000 C 74.000 158.477 78.477 154.000 84.000 154.000 C 89.523 154.000 94.000 158.477 94.000 164.000 ZM 230.000 176.000 L 230.000 208.000 C 230.000 215.732 223.732 222.000 216.000 222.000 L 180.000 222.000 C 173.814 221.973 168.369 217.918 166.570 212.000 L 155.350 174.000 L 129.250 174.000 L 133.580 188.560 C 133.580 188.690 133.650 188.830 133.680 188.960 C 134.603 193.108 133.592 197.451 130.931 200.764 C 128.271 204.078 124.249 206.004 120.000 206.000 L 72.140 206.000 C 70.935 206.015 69.754 205.666 68.750 205.000 C 41.984 186.729 25.980 156.408 26.000 124.000 C 26.000 70.730 69.350 26.780 122.610 26.000 C 148.841 25.628 174.126 35.788 192.807 54.207 C 211.487 72.626 222.003 97.766 222.000 124.000 L 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 156.000 134.000 L 164.270 162.000 L 216.000 162.000 C 223.732 162.000 230.000 168.268 230.000 176.000 ZM 122.000 191.710 L 106.460 139.450 C 106.460 139.310 106.390 139.170 106.360 139.040 C 105.439 134.899 106.445 130.563 109.096 127.251 C 111.747 123.939 115.758 122.008 120.000 122.000 L 210.000 122.000 C 208.913 75.286 170.726 37.987 124.000 38.000 L 122.760 38.000 C 76.000 38.660 38.000 77.220 38.000 124.000 C 37.991 151.778 51.399 177.850 74.000 194.000 L 120.000 194.000 C 120.585 194.006 121.143 193.756 121.528 193.316 C 121.912 192.875 122.085 192.289 122.000 191.710 ZM 151.790 162.000 L 143.520 134.000 L 120.000 134.000 C 119.415 133.994 118.857 134.244 118.472 134.684 C 118.088 135.125 117.915 135.711 118.000 136.290 L 125.660 162.000 ZM 218.000 176.000 C 218.000 174.895 217.105 174.000 216.000 174.000 L 167.850 174.000 L 178.060 208.570 C 178.315 209.427 179.106 210.010 180.000 210.000 L 216.000 210.000 C 217.105 210.000 218.000 209.105 218.000 208.000 Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
