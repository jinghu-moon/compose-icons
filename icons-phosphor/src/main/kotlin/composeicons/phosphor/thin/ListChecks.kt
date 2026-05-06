package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorThinIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c0 2.209-1.791 4-4 4h-88c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h88c2.209 0 4 1.791 4 4ZM128 68h88c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-88c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM216 188h-88c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h88c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM85.17 45.17 56 74.34 42.83 61.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l16 16c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l32-32c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0ZM85.17 109.17 56 138.34 42.83 125.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l16 16c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l32-32c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0ZM85.17 173.17 56 202.34 42.83 189.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l16 16c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l32-32c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0Z"),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
