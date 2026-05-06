package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorThinIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 197.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L184 181.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L178.34 176 157.17 154.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L184 170.34l21.17-21.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L189.66 176ZM160 116c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4ZM200 116c2.209 0 4-1.791 4-4v-80c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v80c0 2.209 1.791 4 4 4ZM120 108c-2.209 0-4 1.791-4 4v88c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-88c0-2.209-1.791-4-4-4ZM80 148c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM40 188c-2.209 0-4 1.791-4 4v8c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-8c0-2.209-1.791-4-4-4Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
