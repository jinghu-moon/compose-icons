package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorFillIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 80c0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8ZM40 88h96v16c0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8h-16c-4.418 0-8 3.582-8 8v16h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216 168h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96 144h-16c-4.418 0-8 3.582-8 8v16h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v16c0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8Z"),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
