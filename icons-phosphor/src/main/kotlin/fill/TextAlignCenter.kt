package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextAlignCenter: ImageVector
    get() {
        if (_textAlignCenter != null) return _textAlignCenter!!
        _textAlignCenter = phosphorFillIcon(
            name = "TextAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 176.000 184.000 L 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 C 72.000 171.582 75.582 168.000 80.000 168.000 L 176.000 168.000 C 180.418 168.000 184.000 171.582 184.000 176.000 C 184.000 180.418 180.418 184.000 176.000 184.000 ZM 192.000 152.000 L 64.000 152.000 C 59.582 152.000 56.000 148.418 56.000 144.000 C 56.000 139.582 59.582 136.000 64.000 136.000 L 192.000 136.000 C 196.418 136.000 200.000 139.582 200.000 144.000 C 200.000 148.418 196.418 152.000 192.000 152.000 ZM 72.000 112.000 C 72.000 107.582 75.582 104.000 80.000 104.000 L 176.000 104.000 C 180.418 104.000 184.000 107.582 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 L 80.000 120.000 C 75.582 120.000 72.000 116.418 72.000 112.000 ZM 192.000 88.000 L 64.000 88.000 C 59.582 88.000 56.000 84.418 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 C 200.000 84.418 196.418 88.000 192.000 88.000 Z"),
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
