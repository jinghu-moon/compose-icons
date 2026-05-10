package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorFillIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 80v96c0 8.837-7.163 16-16 16h-92c-2.209 0-4-1.791-4-4v-120c0-2.209 1.791-4 4-4h92c8.837 0 16 7.163 16 16ZM120 48v160c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-80C15.163 192 8 184.837 8 176v-96C8 71.163 15.163 64 24 64h80v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM88 112c0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h8c4.418 0 8-3.582 8-8Z"),
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
