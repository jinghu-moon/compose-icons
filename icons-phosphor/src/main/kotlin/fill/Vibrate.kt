package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorFillIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 56.000 L 184.000 200.000 C 184.000 213.255 173.255 224.000 160.000 224.000 L 96.000 224.000 C 82.745 224.000 72.000 213.255 72.000 200.000 L 72.000 56.000 C 72.000 42.745 82.745 32.000 96.000 32.000 L 160.000 32.000 C 173.255 32.000 184.000 42.745 184.000 56.000 ZM 208.000 80.000 C 203.582 80.000 200.000 83.582 200.000 88.000 L 200.000 168.000 C 200.000 172.418 203.582 176.000 208.000 176.000 C 212.418 176.000 216.000 172.418 216.000 168.000 L 216.000 88.000 C 216.000 83.582 212.418 80.000 208.000 80.000 ZM 240.000 96.000 C 235.582 96.000 232.000 99.582 232.000 104.000 L 232.000 152.000 C 232.000 156.418 235.582 160.000 240.000 160.000 C 244.418 160.000 248.000 156.418 248.000 152.000 L 248.000 104.000 C 248.000 99.582 244.418 96.000 240.000 96.000 ZM 48.000 80.000 C 43.582 80.000 40.000 83.582 40.000 88.000 L 40.000 168.000 C 40.000 172.418 43.582 176.000 48.000 176.000 C 52.418 176.000 56.000 172.418 56.000 168.000 L 56.000 88.000 C 56.000 83.582 52.418 80.000 48.000 80.000 ZM 16.000 96.000 C 11.582 96.000 8.000 99.582 8.000 104.000 L 8.000 152.000 C 8.000 156.418 11.582 160.000 16.000 160.000 C 20.418 160.000 24.000 156.418 24.000 152.000 L 24.000 104.000 C 24.000 99.582 20.418 96.000 16.000 96.000 Z"),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
