package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorThinIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 48v104c0 6.627-5.373 12-12 12h-118.34l17.17 17.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0l-24-24c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l24-24c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L89.66 156h118.34c2.209 0 4-1.791 4-4v-104c0-2.209-1.791-4-4-4h-112c-2.209 0-4 1.791-4 4v8c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-8C84 41.373 89.373 36 96 36h112c6.627 0 12 5.373 12 12ZM168 196c-2.209 0-4 1.791-4 4v8c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4v-104c0-2.209 1.791-4 4-4h118.34l-17.17 17.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l24-24c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83l-24-24c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L166.34 92h-118.34c-6.627 0-12 5.373-12 12v104c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12v-8c0-2.209-1.791-4-4-4Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
