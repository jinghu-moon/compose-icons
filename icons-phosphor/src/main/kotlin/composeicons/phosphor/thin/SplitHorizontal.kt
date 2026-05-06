package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorThinIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 48v160c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-76h-66.34l25.17 25.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0l-32-32c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l32-32c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L33.66 124h66.34v-76c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM234.83 125.17l-32-32c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L222.34 124h-66.34v-76c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v160c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-76h66.34l-25.17 25.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l32-32c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
