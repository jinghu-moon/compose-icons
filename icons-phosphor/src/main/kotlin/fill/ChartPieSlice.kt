package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorFillIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 116.430 C 102.476 115.001 104.001 112.359 104.000 109.500 L 104.000 37.500 C 103.986 34.912 102.720 32.491 100.603 31.002 C 98.487 29.513 95.781 29.139 93.340 30.000 C 45.102 47.072 16.435 96.681 25.730 147.000 C 26.203 149.556 27.889 151.723 30.250 152.810 C 31.299 153.300 32.442 153.553 33.600 153.550 C 35.004 153.551 36.384 153.182 37.600 152.480 ZM 88.000 49.620 L 88.000 104.880 L 40.120 132.510 C 40.000 131.000 40.000 129.480 40.000 128.000 C 40.029 94.937 58.563 64.673 88.000 49.620 ZM 232.000 128.000 C 232.016 174.935 200.594 216.065 155.305 228.387 C 110.017 240.710 62.087 221.172 38.320 180.700 C 37.231 178.863 36.922 176.668 37.461 174.602 C 38.000 172.536 39.343 170.771 41.190 169.700 L 120.000 123.830 L 120.000 32.000 C 120.000 27.582 123.582 24.000 128.000 24.000 C 164.929 24.019 199.082 43.611 217.740 75.480 C 217.850 75.640 217.950 75.800 218.050 75.970 C 218.150 76.140 218.250 76.340 218.340 76.520 C 227.313 92.192 232.023 109.941 232.000 128.000 Z"),
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
