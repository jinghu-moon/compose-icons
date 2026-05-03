package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorRegularIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 128.000 C 247.967 158.914 222.914 183.967 192.000 184.000 L 48.000 184.000 C 25.909 184.000 8.000 166.091 8.000 144.000 C 8.000 121.909 25.909 104.000 48.000 104.000 L 192.000 104.000 C 205.255 104.000 216.000 114.745 216.000 128.000 C 216.000 141.255 205.255 152.000 192.000 152.000 L 80.000 152.000 C 75.582 152.000 72.000 148.418 72.000 144.000 C 72.000 139.582 75.582 136.000 80.000 136.000 L 192.000 136.000 C 196.418 136.000 200.000 132.418 200.000 128.000 C 200.000 123.582 196.418 120.000 192.000 120.000 L 48.000 120.000 C 34.745 120.000 24.000 130.745 24.000 144.000 C 24.000 157.255 34.745 168.000 48.000 168.000 L 192.000 168.000 C 214.091 168.000 232.000 150.091 232.000 128.000 C 232.000 105.909 214.091 88.000 192.000 88.000 L 80.000 88.000 C 75.582 88.000 72.000 84.418 72.000 80.000 C 72.000 75.582 75.582 72.000 80.000 72.000 L 192.000 72.000 C 222.914 72.033 247.967 97.086 248.000 128.000 Z"),
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
