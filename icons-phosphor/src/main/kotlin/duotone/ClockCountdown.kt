package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorDuotoneIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 232.000 136.660 C 227.270 191.648 180.454 233.393 125.285 231.814 C 70.117 230.236 25.764 185.883 24.186 130.715 C 22.607 75.546 64.352 28.730 119.340 24.000 C 123.758 23.635 127.635 26.922 128.000 31.340 C 128.365 35.758 125.078 39.635 120.660 40.000 C 74.119 43.999 38.785 83.620 40.119 130.314 C 41.454 177.007 78.993 214.546 125.686 215.881 C 172.380 217.215 212.001 181.881 216.000 135.340 C 216.365 130.922 220.242 127.635 224.660 128.000 C 229.078 128.365 232.365 132.242 232.000 136.660 ZM 120.000 72.000 L 120.000 128.000 C 120.000 132.418 123.582 136.000 128.000 136.000 L 184.000 136.000 C 188.418 136.000 192.000 132.418 192.000 128.000 C 192.000 123.582 188.418 120.000 184.000 120.000 L 136.000 120.000 L 136.000 72.000 C 136.000 67.582 132.418 64.000 128.000 64.000 C 123.582 64.000 120.000 67.582 120.000 72.000 ZM 160.000 48.000 C 166.627 48.000 172.000 42.627 172.000 36.000 C 172.000 29.373 166.627 24.000 160.000 24.000 C 153.373 24.000 148.000 29.373 148.000 36.000 C 148.000 42.627 153.373 48.000 160.000 48.000 ZM 196.000 72.000 C 202.627 72.000 208.000 66.627 208.000 60.000 C 208.000 53.373 202.627 48.000 196.000 48.000 C 189.373 48.000 184.000 53.373 184.000 60.000 C 184.000 66.627 189.373 72.000 196.000 72.000 ZM 220.000 108.000 C 226.627 108.000 232.000 102.627 232.000 96.000 C 232.000 89.373 226.627 84.000 220.000 84.000 C 213.373 84.000 208.000 89.373 208.000 96.000 C 208.000 102.627 213.373 108.000 220.000 108.000 Z"),
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
