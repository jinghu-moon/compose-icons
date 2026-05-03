package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorDuotoneIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 L 128.000 168.000 C 150.091 168.000 168.000 150.091 168.000 128.000 C 168.000 105.909 150.091 88.000 128.000 88.000 L 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 123.582 24.000 120.000 27.582 120.000 32.000 L 120.000 88.000 C 120.000 92.418 123.582 96.000 128.000 96.000 C 142.483 96.003 155.158 105.733 158.904 119.723 C 162.650 133.713 156.533 148.475 143.990 155.715 C 131.446 162.955 115.604 160.868 105.364 150.626 C 95.124 140.385 93.039 124.542 100.280 112.000 C 101.341 110.162 101.629 107.978 101.079 105.928 C 100.530 103.878 99.188 102.131 97.350 101.070 L 48.850 73.070 C 47.012 72.009 44.828 71.721 42.778 72.271 C 40.728 72.820 38.981 74.162 37.920 76.000 C 14.385 116.764 21.163 168.252 54.445 201.537 C 87.727 234.821 139.216 241.602 179.981 218.070 C 220.746 194.538 240.624 146.560 228.446 101.092 C 216.267 55.625 175.070 24.006 128.000 24.000 ZM 48.090 91.100 L 83.000 111.260 C 81.013 116.617 79.998 122.286 80.000 128.000 C 80.000 129.530 80.080 131.000 80.220 132.520 L 41.280 143.000 C 38.243 125.410 40.618 107.312 48.090 91.100 ZM 45.420 158.410 L 84.420 147.970 C 91.040 162.400 104.353 172.634 120.000 175.320 L 120.000 215.630 C 86.200 212.497 57.198 190.246 45.420 158.410 ZM 136.000 215.630 L 136.000 175.320 C 159.085 171.407 175.979 151.409 175.979 127.995 C 175.979 104.581 159.085 84.583 136.000 80.670 L 136.000 40.360 C 181.310 44.500 215.993 82.496 215.993 127.995 C 215.993 173.494 181.310 211.490 136.000 215.630 Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
