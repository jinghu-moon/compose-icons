package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorThinIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 64c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4ZM40 132h120c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-120c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM112 188h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM243.83 125.15c-.305 1.02-1.004 1.877-1.943 2.38-.939 .503-2.039 .611-3.057 .3L204 117.38v74.62c.012 13.387-9.453 24.911-22.588 27.498-13.135 2.587-26.264-4.485-31.33-16.877-5.066-12.392-.651-26.636 10.535-33.991 11.186-7.355 26.014-5.762 35.383 3.8v-60.43c0-1.264 .598-2.454 1.613-3.209 1.015-.755 2.326-.985 3.537-.621l40 12c2.115 .636 3.314 2.865 2.68 4.98ZM196 192c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
