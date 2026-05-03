package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorFillIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 152.000 C 104.000 156.418 100.418 160.000 96.000 160.000 L 56.000 160.000 C 51.582 160.000 48.000 156.418 48.000 152.000 C 48.000 147.582 51.582 144.000 56.000 144.000 L 96.000 144.000 C 100.418 144.000 104.000 147.582 104.000 152.000 ZM 168.000 32.000 L 192.000 32.000 C 196.418 32.000 200.000 28.418 200.000 24.000 C 200.000 19.582 196.418 16.000 192.000 16.000 L 160.000 16.000 C 155.582 16.000 152.000 19.582 152.000 24.000 L 152.000 56.000 L 168.000 56.000 ZM 240.000 116.000 L 240.000 176.000 C 240.000 184.837 232.837 192.000 224.000 192.000 L 136.000 192.000 L 136.000 224.000 C 136.000 228.418 132.418 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 192.000 L 32.000 192.000 C 23.163 192.000 16.000 184.837 16.000 176.000 L 16.000 116.000 C 16.039 82.879 42.879 56.039 76.000 56.000 L 152.000 56.000 L 152.000 144.000 C 152.000 148.418 155.582 152.000 160.000 152.000 C 164.418 152.000 168.000 148.418 168.000 144.000 L 168.000 56.000 L 180.000 56.000 C 213.121 56.039 239.961 82.879 240.000 116.000 ZM 120.000 116.000 C 120.000 91.699 100.301 72.000 76.000 72.000 C 51.699 72.000 32.000 91.699 32.000 116.000 L 32.000 176.000 L 120.000 176.000 Z"),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
