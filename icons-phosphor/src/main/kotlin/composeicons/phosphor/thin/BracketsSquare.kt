package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorThinIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 44v168h36c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM216 36h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v168h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4v-176c0-2.209-1.791-4-4-4Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
