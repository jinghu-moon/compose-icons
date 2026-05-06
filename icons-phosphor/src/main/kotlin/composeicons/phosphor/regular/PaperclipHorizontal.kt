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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 128c-.033 30.914-25.086 55.967-56 56h-144C25.909 184 8 166.091 8 144 8 121.909 25.909 104 48 104h144c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24h-112c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h112c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-144c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24h144c22.091 0 40-17.909 40-40C232 105.909 214.091 88 192 88h-112c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h112c30.914 .033 55.967 25.086 56 56Z"),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
