package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorFillIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 56v32c0 2.209-1.791 4-4 4h-92v-40c0-2.209 1.791-4 4-4h84c4.418 0 8 3.582 8 8ZM228 108h-44v44h44c2.209 0 4-1.791 4-4v-36c0-2.209-1.791-4-4-4ZM88 152h80v-44h-80ZM28 152h44v-44h-44c-2.209 0-4 1.791-4 4v36c0 2.209 1.791 4 4 4ZM228 168h-92v36c0 2.209 1.791 4 4 4h84c4.418 0 8-3.582 8-8v-28c0-2.209-1.791-4-4-4ZM28 92h92v-40c0-2.209-1.791-4-4-4h-84c-4.418 0-8 3.582-8 8v32c0 2.209 1.791 4 4 4ZM24 172v28c0 4.418 3.582 8 8 8h84c2.209 0 4-1.791 4-4v-36h-92c-2.209 0-4 1.791-4 4Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
