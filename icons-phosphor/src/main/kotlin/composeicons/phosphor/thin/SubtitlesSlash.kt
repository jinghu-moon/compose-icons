package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorThinIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 136c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM211 213.31c.982 1.054 1.32 2.555 .887 3.929-.433 1.374-1.572 2.408-2.981 2.709-1.409 .3-2.87-.18-3.826-1.258L191.69 204h-159.69c-6.627 0-12-5.373-12-12v-128C20 57.373 25.373 52 32 52h21.5L45 42.69C43.514 41.033 43.653 38.486 45.31 37c1.657-1.486 4.204-1.347 5.69 .31ZM184.41 196 162.59 172h-106.59c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h99.32L133.5 140h-29.5c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h22.23L60.78 60h-28.78c-2.209 0-4 1.791-4 4v128c0 2.209 1.791 4 4 4ZM200 140c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-21.48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM224 52h-118.21c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h118.21c2.209 0 4 1.791 4 4v130.83c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-130.83c0-6.627-5.373-12-12-12Z"),
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
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
