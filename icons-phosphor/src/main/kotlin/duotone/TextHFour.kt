package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorDuotoneIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 248.000 72.000 L 248.000 192.000 C 248.000 200.837 240.837 208.000 232.000 208.000 L 56.000 208.000 C 47.163 208.000 40.000 200.837 40.000 192.000 L 40.000 56.000 L 232.000 56.000 C 240.837 56.000 248.000 63.163 248.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 152.000 56.000 L 152.000 176.000 C 152.000 180.418 148.418 184.000 144.000 184.000 C 139.582 184.000 136.000 180.418 136.000 176.000 L 136.000 124.000 L 48.000 124.000 L 48.000 176.000 C 48.000 180.418 44.418 184.000 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 C 44.418 48.000 48.000 51.582 48.000 56.000 L 48.000 108.000 L 136.000 108.000 L 136.000 56.000 C 136.000 51.582 139.582 48.000 144.000 48.000 C 148.418 48.000 152.000 51.582 152.000 56.000 ZM 256.000 184.000 C 256.000 188.418 252.418 192.000 248.000 192.000 L 240.000 192.000 L 240.000 208.000 C 240.000 212.418 236.418 216.000 232.000 216.000 C 227.582 216.000 224.000 212.418 224.000 208.000 L 224.000 192.000 L 176.000 192.000 C 172.946 191.998 170.160 190.257 168.819 187.513 C 167.477 184.769 167.816 181.501 169.690 179.090 L 225.690 107.090 C 227.789 104.397 231.366 103.332 234.596 104.441 C 237.826 105.549 239.997 108.585 240.000 112.000 L 240.000 176.000 L 248.000 176.000 C 252.418 176.000 256.000 179.582 256.000 184.000 ZM 224.000 135.320 L 192.360 176.000 L 224.000 176.000 Z"),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
