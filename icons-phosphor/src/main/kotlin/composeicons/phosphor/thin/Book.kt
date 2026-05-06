package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorThinIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-136C56.536 28 44 40.536 44 56v168c0 2.209 1.791 4 4 4h144c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-140v-4c0-11.046 8.954-20 20-20h136c2.209 0 4-1.791 4-4v-160c0-2.209-1.791-4-4-4ZM204 188h-132c-7.529-.003-14.74 3.033-20 8.42v-140.42C52 44.954 60.954 36 72 36h132Z"),
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
        return _book!!
    }

private var _book: ImageVector? = null
