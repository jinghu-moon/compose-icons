package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorBoldIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 207.000 36.000 L 49.000 36.000 C 37.402 36.000 28.000 45.402 28.000 57.000 L 28.000 106.210 C 28.003 114.442 32.816 121.913 40.310 125.320 L 96.310 150.790 C 78.639 164.353 71.569 187.665 78.731 208.758 C 85.892 229.852 105.694 244.041 127.970 244.041 C 150.246 244.041 170.048 229.852 177.209 208.758 C 184.371 187.665 177.301 164.353 159.630 150.790 L 215.630 125.320 C 223.148 121.931 227.986 114.456 228.000 106.210 L 228.000 57.000 C 228.000 45.402 218.598 36.000 207.000 36.000 ZM 128.000 138.820 L 100.000 126.090 L 100.000 60.000 L 156.000 60.000 L 156.000 126.090 ZM 52.000 60.000 L 76.000 60.000 L 76.000 115.180 L 52.000 104.270 ZM 128.000 220.000 C 112.536 220.000 100.000 207.464 100.000 192.000 C 100.000 176.536 112.536 164.000 128.000 164.000 C 143.464 164.000 156.000 176.536 156.000 192.000 C 156.000 207.464 143.464 220.000 128.000 220.000 ZM 204.000 104.270 L 180.000 115.180 L 180.000 60.000 L 204.000 60.000 Z"),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
