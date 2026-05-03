package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorFillIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 64.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 C 200.000 84.418 196.418 88.000 192.000 88.000 L 64.000 88.000 C 59.582 88.000 56.000 84.418 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 ZM 104.000 184.000 L 64.000 184.000 C 59.582 184.000 56.000 180.418 56.000 176.000 C 56.000 171.582 59.582 168.000 64.000 168.000 L 104.000 168.000 C 108.418 168.000 112.000 171.582 112.000 176.000 C 112.000 180.418 108.418 184.000 104.000 184.000 ZM 104.000 136.000 L 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 C 56.000 123.582 59.582 120.000 64.000 120.000 L 104.000 120.000 C 108.418 120.000 112.000 123.582 112.000 128.000 C 112.000 132.418 108.418 136.000 104.000 136.000 ZM 196.440 158.660 L 148.440 190.660 C 147.125 191.535 145.580 192.002 144.000 192.000 C 139.582 192.000 136.000 188.418 136.000 184.000 L 136.000 120.000 C 135.998 117.048 137.622 114.335 140.224 112.942 C 142.826 111.549 145.985 111.702 148.440 113.340 L 196.440 145.340 C 198.669 146.823 200.008 149.323 200.008 152.000 C 200.008 154.677 198.669 157.177 196.440 158.660 Z"),
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
