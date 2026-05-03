package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextAlignCenter: ImageVector
    get() {
        if (_textAlignCenter != null) return _textAlignCenter!!
        _textAlignCenter = phosphorRegularIcon(
            name = "TextAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 68.418 32.000 64.000 ZM 64.000 96.000 C 59.582 96.000 56.000 99.582 56.000 104.000 C 56.000 108.418 59.582 112.000 64.000 112.000 L 192.000 112.000 C 196.418 112.000 200.000 108.418 200.000 104.000 C 200.000 99.582 196.418 96.000 192.000 96.000 ZM 216.000 136.000 L 40.000 136.000 C 35.582 136.000 32.000 139.582 32.000 144.000 C 32.000 148.418 35.582 152.000 40.000 152.000 L 216.000 152.000 C 220.418 152.000 224.000 148.418 224.000 144.000 C 224.000 139.582 220.418 136.000 216.000 136.000 ZM 192.000 176.000 L 64.000 176.000 C 59.582 176.000 56.000 179.582 56.000 184.000 C 56.000 188.418 59.582 192.000 64.000 192.000 L 192.000 192.000 C 196.418 192.000 200.000 188.418 200.000 184.000 C 200.000 179.582 196.418 176.000 192.000 176.000 Z"),
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
        return _textAlignCenter!!
    }

private var _textAlignCenter: ImageVector? = null
