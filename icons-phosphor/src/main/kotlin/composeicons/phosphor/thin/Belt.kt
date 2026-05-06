package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorThinIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 164h-60v-72h60c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-60.7C185.607 79.21 181.08 76.006 176 76h-64c-5.08 .006-9.607 3.21-11.3 8h-40.7v-4c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v4h-44C5.791 84 4 85.791 4 88c0 2.209 1.791 4 4 4h44v72h-44c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h44v4c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-4h40.7c1.693 4.79 6.22 7.994 11.3 8h64c5.08-.006 9.607-3.21 11.3-8h60.7c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM60 92h40v72h-40ZM176 172h-64c-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4v36h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v36c0 2.209-1.791 4-4 4Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
