package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorThinIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 152c0 2.209-1.791 4-4 4h-76v66.34l25.17-25.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66l-32 32c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-32-32c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L124 222.34v-66.34h-76c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM48 108h160c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-76v-66.34l25.17 25.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66l-32-32c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-32 32c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L124 33.66v66.34h-76c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
