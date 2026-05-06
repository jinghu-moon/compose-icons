package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorThinIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 220h-28v-180c0-6.627-5.373-12-12-12h-128C57.373 28 52 33.373 52 40v180h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h208c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM60 40c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4v180h-136ZM164 132c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _door!!
    }

private var _door: ImageVector? = null
