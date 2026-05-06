package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorThinIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 52h-44v-12C172 28.954 163.046 20 152 20h-48C92.954 20 84 28.954 84 40v12h-44c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v148c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-148h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM92 40c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12v12h-72ZM196 208c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4v-148h136ZM108 104v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM156 104v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
