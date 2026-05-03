package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorFillIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 168.000 168.000 L 72.000 168.000 C 58.745 168.000 48.000 157.255 48.000 144.000 C 48.000 130.745 58.745 120.000 72.000 120.000 L 168.000 120.000 C 172.418 120.000 176.000 123.582 176.000 128.000 C 176.000 132.418 172.418 136.000 168.000 136.000 L 72.000 136.000 C 67.582 136.000 64.000 139.582 64.000 144.000 C 64.000 148.418 67.582 152.000 72.000 152.000 L 168.000 152.000 C 181.255 152.000 192.000 141.255 192.000 128.000 C 192.000 114.745 181.255 104.000 168.000 104.000 L 96.000 104.000 C 91.582 104.000 88.000 100.418 88.000 96.000 C 88.000 91.582 91.582 88.000 96.000 88.000 L 168.000 88.000 C 190.091 88.000 208.000 105.909 208.000 128.000 C 208.000 150.091 190.091 168.000 168.000 168.000 Z"),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
