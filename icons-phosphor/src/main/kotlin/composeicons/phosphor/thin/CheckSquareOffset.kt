package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorThinIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 48v160c0 6.627-5.373 12-12 12h-72c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h72c2.209 0 4-1.791 4-4v-160c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-96C36 41.373 41.373 36 48 36h160c6.627 0 12 5.373 12 12ZM117.17 157.17 64 210.34 42.83 189.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l24 24c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l56-56c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0Z"),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
