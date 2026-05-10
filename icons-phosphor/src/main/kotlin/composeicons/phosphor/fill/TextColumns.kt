package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextColumns: ImageVector
    get() {
        if (_textColumns != null) return _textColumns!!
        _textColumns = phosphorFillIcon(
            name = "TextColumns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM112 184h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM112 152h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM112 120h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM112 88h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 184h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 152h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 120h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 88h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _textColumns!!
    }

private var _textColumns: ImageVector? = null
