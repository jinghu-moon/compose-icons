package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorFillIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-24v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-32v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-32v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-24c-4.418 0-8 3.582-8 8v160c0 17.673 14.327 32 32 32h112c17.673 0 32-14.327 32-32v-160c0-4.418-3.582-8-8-8ZM120 56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM80 72c-4.418 0-8-3.582-8-8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8c0 4.418-3.582 8-8 8ZM160 168h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM160 136h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM184 64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
