package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorFillIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 96.000 C 208.000 89.373 213.373 84.000 220.000 84.000 C 226.627 84.000 232.000 89.373 232.000 96.000 C 232.000 102.627 226.627 108.000 220.000 108.000 C 213.373 108.000 208.000 102.627 208.000 96.000 ZM 196.000 72.000 C 202.627 72.000 208.000 66.627 208.000 60.000 C 208.000 53.373 202.627 48.000 196.000 48.000 C 189.373 48.000 184.000 53.373 184.000 60.000 C 184.000 66.627 189.373 72.000 196.000 72.000 ZM 224.660 128.000 C 220.259 127.637 216.396 130.909 216.030 135.310 C 212.046 181.852 172.435 217.199 125.742 215.879 C 79.048 214.559 41.497 177.032 40.148 130.339 C 38.799 83.646 74.120 44.013 120.660 40.000 C 125.078 39.635 128.365 35.758 128.000 31.340 C 127.635 26.922 123.758 23.635 119.340 24.000 C 64.352 28.730 22.607 75.546 24.186 130.715 C 25.764 185.883 70.117 230.236 125.285 231.814 C 180.454 233.393 227.270 191.648 232.000 136.660 C 232.182 134.537 231.510 132.428 230.132 130.803 C 228.754 129.177 226.785 128.168 224.660 128.000 ZM 128.000 56.000 C 167.764 56.000 200.000 88.235 200.000 128.000 C 200.000 167.764 167.764 200.000 128.000 200.000 C 88.235 200.000 56.000 167.764 56.000 128.000 C 56.044 88.254 88.254 56.044 128.000 56.000 ZM 120.000 128.000 C 120.000 132.418 123.582 136.000 128.000 136.000 L 176.000 136.000 C 180.418 136.000 184.000 132.418 184.000 128.000 C 184.000 123.582 180.418 120.000 176.000 120.000 L 136.000 120.000 L 136.000 80.000 C 136.000 75.582 132.418 72.000 128.000 72.000 C 123.582 72.000 120.000 75.582 120.000 80.000 ZM 160.000 48.000 C 166.627 48.000 172.000 42.627 172.000 36.000 C 172.000 29.373 166.627 24.000 160.000 24.000 C 153.373 24.000 148.000 29.373 148.000 36.000 C 148.000 42.627 153.373 48.000 160.000 48.000 Z"),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
