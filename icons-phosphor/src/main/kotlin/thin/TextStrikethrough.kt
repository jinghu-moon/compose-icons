package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorThinIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 161.160 132.000 C 176.610 139.240 188.000 149.800 188.000 168.000 C 188.000 192.260 161.080 212.000 128.000 212.000 C 94.920 212.000 68.000 192.260 68.000 168.000 C 68.000 165.791 69.791 164.000 72.000 164.000 C 74.209 164.000 76.000 165.791 76.000 168.000 C 76.000 187.850 99.330 204.000 128.000 204.000 C 156.670 204.000 180.000 187.850 180.000 168.000 C 180.000 148.460 163.870 139.700 137.820 132.000 L 40.000 132.000 C 37.791 132.000 36.000 130.209 36.000 128.000 C 36.000 125.791 37.791 124.000 40.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 ZM 76.330 100.000 C 76.755 100.003 77.177 99.935 77.580 99.800 C 79.653 99.109 80.788 96.883 80.130 94.800 C 79.446 92.616 79.109 90.338 79.130 88.050 C 79.130 67.530 100.130 52.050 128.020 52.050 C 148.340 52.050 165.020 60.250 172.510 73.970 C 173.632 75.777 175.972 76.390 177.836 75.365 C 179.700 74.340 180.436 72.035 179.510 70.120 C 170.540 53.750 151.290 44.000 128.000 44.000 C 95.570 44.000 71.110 62.920 71.110 88.000 C 71.093 91.139 71.572 94.261 72.530 97.250 C 73.070 98.891 74.602 100.000 76.330 100.000 Z"),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
