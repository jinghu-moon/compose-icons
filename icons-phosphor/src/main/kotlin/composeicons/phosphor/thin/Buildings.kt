package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorThinIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 212h-20v-116c0-6.627-5.373-12-12-12h-68v-52c.007-4.43-2.428-8.502-6.332-10.595-3.904-2.092-8.644-1.864-12.328 .595L41.34 75.33c-3.342 2.229-5.346 5.983-5.34 10v126.67h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM208 92c2.209 0 4 1.791 4 4v116h-72v-120ZM44 85.34c-.004-1.341 .664-2.596 1.78-3.34l80-53.33c1.228-.819 2.807-.896 4.108-.199 1.301 .697 2.113 2.053 2.112 3.529v180h-88ZM108 112v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM76 112v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM76 168v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM108 168v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
