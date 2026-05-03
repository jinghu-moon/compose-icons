package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextColumns: ImageVector
    get() {
        if (_textColumns != null) return _textColumns!!
        _textColumns = phosphorRegularIcon(
            name = "TextColumns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 64.000 C 120.000 68.418 116.418 72.000 112.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 68.418 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 112.000 56.000 C 116.418 56.000 120.000 59.582 120.000 64.000 ZM 112.000 96.000 L 40.000 96.000 C 35.582 96.000 32.000 99.582 32.000 104.000 C 32.000 108.418 35.582 112.000 40.000 112.000 L 112.000 112.000 C 116.418 112.000 120.000 108.418 120.000 104.000 C 120.000 99.582 116.418 96.000 112.000 96.000 ZM 112.000 136.000 L 40.000 136.000 C 35.582 136.000 32.000 139.582 32.000 144.000 C 32.000 148.418 35.582 152.000 40.000 152.000 L 112.000 152.000 C 116.418 152.000 120.000 148.418 120.000 144.000 C 120.000 139.582 116.418 136.000 112.000 136.000 ZM 112.000 176.000 L 40.000 176.000 C 35.582 176.000 32.000 179.582 32.000 184.000 C 32.000 188.418 35.582 192.000 40.000 192.000 L 112.000 192.000 C 116.418 192.000 120.000 188.418 120.000 184.000 C 120.000 179.582 116.418 176.000 112.000 176.000 ZM 144.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 68.418 224.000 64.000 C 224.000 59.582 220.418 56.000 216.000 56.000 L 144.000 56.000 C 139.582 56.000 136.000 59.582 136.000 64.000 C 136.000 68.418 139.582 72.000 144.000 72.000 ZM 216.000 96.000 L 144.000 96.000 C 139.582 96.000 136.000 99.582 136.000 104.000 C 136.000 108.418 139.582 112.000 144.000 112.000 L 216.000 112.000 C 220.418 112.000 224.000 108.418 224.000 104.000 C 224.000 99.582 220.418 96.000 216.000 96.000 ZM 216.000 136.000 L 144.000 136.000 C 139.582 136.000 136.000 139.582 136.000 144.000 C 136.000 148.418 139.582 152.000 144.000 152.000 L 216.000 152.000 C 220.418 152.000 224.000 148.418 224.000 144.000 C 224.000 139.582 220.418 136.000 216.000 136.000 ZM 216.000 176.000 L 144.000 176.000 C 139.582 176.000 136.000 179.582 136.000 184.000 C 136.000 188.418 139.582 192.000 144.000 192.000 L 216.000 192.000 C 220.418 192.000 224.000 188.418 224.000 184.000 C 224.000 179.582 220.418 176.000 216.000 176.000 Z"),
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
        return _textColumns!!
    }

private var _textColumns: ImageVector? = null
