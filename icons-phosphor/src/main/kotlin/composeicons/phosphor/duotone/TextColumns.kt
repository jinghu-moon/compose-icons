package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextColumns: ImageVector
    get() {
        if (_textColumns != null) return _textColumns!!
        _textColumns = phosphorDuotoneIcon(
            name = "TextColumns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 64v120h-176v-120Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M120 64c0 4.418-3.582 8-8 8h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8ZM112 96h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM112 136h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM112 176h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM144 72h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216 96h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM216 136h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM216 176h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
