package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorRegularIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 116.430 C 102.476 115.001 104.001 112.359 104.000 109.500 L 104.000 37.500 C 103.986 34.912 102.720 32.491 100.603 31.002 C 98.487 29.513 95.781 29.139 93.340 30.000 C 45.102 47.072 16.435 96.681 25.730 147.000 C 26.203 149.556 27.889 151.723 30.250 152.810 C 31.299 153.300 32.442 153.553 33.600 153.550 C 35.004 153.551 36.384 153.182 37.600 152.480 ZM 88.000 49.620 L 88.000 104.880 L 40.120 132.510 C 40.000 131.000 40.000 129.480 40.000 128.000 C 40.029 94.937 58.563 64.673 88.000 49.620 ZM 128.000 24.000 C 123.582 24.000 120.000 27.582 120.000 32.000 L 120.000 123.820 L 41.190 169.730 C 39.343 170.801 38.000 172.566 37.461 174.632 C 36.922 176.698 37.231 178.893 38.320 180.730 C 63.853 224.136 116.817 243.013 164.048 225.538 C 211.278 208.064 239.203 159.261 230.336 109.689 C 221.470 60.116 178.359 24.019 128.000 24.000 ZM 128.000 216.000 C 99.672 215.924 73.093 202.287 56.510 179.320 L 132.030 135.320 C 134.503 133.892 136.027 131.255 136.030 128.400 L 136.030 40.360 C 182.906 44.613 218.136 84.999 215.987 132.019 C 213.837 179.039 175.069 216.042 128.000 216.000 Z"),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
