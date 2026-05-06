package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorThinIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 152v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM40 188c-2.209 0-4 1.791-4 4v8c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-8c0-2.209-1.791-4-4-4ZM211 213.31 51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69l71 78.06v79.25c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-70.45l32 35.2v35.25c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-26.45l41 45.14c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM160 119.63c2.209 0 4-1.791 4-4v-43.63c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v43.63c0 2.209 1.791 4 4 4ZM200 163.63c2.209 0 4-1.791 4-4v-127.63c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v127.63c0 2.209 1.791 4 4 4Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
