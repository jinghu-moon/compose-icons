package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorThinIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 72c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM104 180h-28v-28c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM152 172h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM216 196h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM157.17 98.83c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173L184 77.66l21.17 21.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L189.66 72 210.83 50.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L184 66.34 162.83 45.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L178.34 72 157.17 93.17c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
