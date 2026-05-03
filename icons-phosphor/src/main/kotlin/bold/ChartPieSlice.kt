package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorBoldIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 93.820 116.640 C 97.633 114.526 99.998 110.510 100.000 106.150 L 100.000 40.740 C 100.000 36.653 97.921 32.847 94.481 30.640 C 91.042 28.432 86.715 28.127 83.000 29.830 C 44.659 47.475 20.068 85.794 20.000 128.000 C 20.000 131.370 20.160 134.760 20.470 138.100 C 20.847 142.132 23.233 145.701 26.814 147.592 C 30.394 149.484 34.687 149.441 38.230 147.480 ZM 76.000 62.060 L 76.000 99.060 L 44.810 116.360 C 47.858 94.930 59.024 75.490 76.000 62.060 ZM 128.000 20.000 C 121.373 20.000 116.000 25.373 116.000 32.000 L 116.000 121.530 L 39.180 166.270 C 36.421 167.877 34.416 170.517 33.609 173.606 C 32.802 176.696 33.259 179.979 34.880 182.730 C 61.385 227.820 116.392 247.437 165.448 229.294 C 214.504 211.152 243.509 160.464 234.297 108.978 C 225.085 57.492 180.304 20.007 128.000 20.000 ZM 128.000 212.000 C 102.510 211.931 78.414 200.355 62.430 180.500 L 134.000 138.790 C 137.706 136.650 139.992 132.699 140.000 128.420 L 140.000 44.850 C 183.643 51.106 215.022 90.039 211.865 134.015 C 208.708 177.991 172.089 212.042 128.000 212.000 Z"),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
