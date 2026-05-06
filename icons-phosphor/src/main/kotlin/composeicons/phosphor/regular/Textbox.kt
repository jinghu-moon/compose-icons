package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorRegularIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 40c-4.418 0-8 3.582-8 8v16h-80C15.163 64 8 71.163 8 80v96c0 8.837 7.163 16 16 16h80v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8ZM24 176v-96h80v96ZM248 80v96c0 8.837-7.163 16-16 16h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88v-96h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c8.837 0 16 7.163 16 16ZM88 112c0 4.418-3.582 8-8 8h-8v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8Z"),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
