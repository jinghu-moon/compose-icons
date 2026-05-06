package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalFull: ImageVector
    get() {
        if (_cellSignalFull != null) return _cellSignalFull!!
        _cellSignalFull = phosphorThinIcon(
            name = "CellSignalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 72v128c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM200 28c-2.209 0-4 1.791-4 4v168c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-168c0-2.209-1.791-4-4-4ZM120 108c-2.209 0-4 1.791-4 4v88c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-88c0-2.209-1.791-4-4-4ZM80 148c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM40 188c-2.209 0-4 1.791-4 4v8c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-8c0-2.209-1.791-4-4-4Z"),
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
        return _cellSignalFull!!
    }

private var _cellSignalFull: ImageVector? = null
