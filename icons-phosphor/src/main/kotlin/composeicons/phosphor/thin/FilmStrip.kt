package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) return _filmStrip!!
        _filmStrip = phosphorThinIcon(
            name = "FilmStrip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM36 84h88v88h-88ZM132 76v-24h40v24ZM124 76h-40v-24h40ZM124 180v24h-40v-24ZM132 180h40v24h-40ZM132 172v-88h88v88ZM220 56v20h-40v-24h36c2.209 0 4 1.791 4 4ZM40 52h36v24h-40v-20c0-2.209 1.791-4 4-4ZM36 200v-20h40v24h-36c-2.209 0-4-1.791-4-4ZM216 204h-36v-24h40v20c0 2.209-1.791 4-4 4Z"),
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
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null
