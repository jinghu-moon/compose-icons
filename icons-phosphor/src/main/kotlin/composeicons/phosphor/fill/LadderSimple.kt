package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorFillIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 24c-4.418 0-8 3.582-8 8v8h-112v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v192c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h112v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-192c0-4.418-3.582-8-8-8ZM176 184h-96c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM176 136h-96c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM176 88h-96c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
