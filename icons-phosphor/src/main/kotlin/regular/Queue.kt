package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorRegularIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 68.418 32.000 64.000 ZM 136.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 L 136.000 136.000 C 140.418 136.000 144.000 132.418 144.000 128.000 C 144.000 123.582 140.418 120.000 136.000 120.000 ZM 136.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 136.000 200.000 C 140.418 200.000 144.000 196.418 144.000 192.000 C 144.000 187.582 140.418 184.000 136.000 184.000 ZM 248.000 160.000 C 247.999 162.757 246.578 165.319 244.240 166.780 L 180.240 206.780 C 177.774 208.321 174.667 208.403 172.124 206.994 C 169.580 205.585 168.001 202.907 168.000 200.000 L 168.000 120.000 C 168.001 117.093 169.580 114.415 172.124 113.006 C 174.667 111.597 177.774 111.679 180.240 113.220 L 244.240 153.220 C 246.578 154.681 247.999 157.243 248.000 160.000 ZM 224.910 160.000 L 184.000 134.430 L 184.000 185.570 Z"),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
