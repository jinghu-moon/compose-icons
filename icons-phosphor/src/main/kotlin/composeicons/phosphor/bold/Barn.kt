package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorBoldIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 84c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12ZM252 200c0 6.627-5.373 12-12 12h-224C9.373 212 4 206.627 4 200c0-6.627 5.373-12 12-12h4v-48.69c-4.944 1.755-10.455 .095-13.607-4.099C3.241 131.016 3.179 125.261 6.24 121L46.24 65c.804-1.13 1.799-2.112 2.94-2.9L116.74 15.45l.17-.11c6.711-4.491 15.469-4.491 22.18 0l.17 .11 67.56 46.65c1.141 .788 2.136 1.77 2.94 2.9l40 56c3.061 4.261 2.999 10.016-.153 14.211-3.152 4.194-8.663 5.854-13.607 4.099v48.69h4c6.627 0 12 5.373 12 12ZM44 188h20v-64c0-6.627 5.373-12 12-12h104c6.627 0 12 5.373 12 12v64h20v-78.55L191.45 80.69 128 36.87 64.55 80.69 44 109.45ZM168 136h-54.1L168 174.07ZM88 188h58.1L88 147.12Z"),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
