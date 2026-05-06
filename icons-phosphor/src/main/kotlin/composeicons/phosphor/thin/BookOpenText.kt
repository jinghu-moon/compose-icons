package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorThinIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 52h-72c-13.484 .006-25.835 7.548-32 19.54C121.835 59.548 109.484 52.006 96 52h-72c-2.209 0-4 1.791-4 4v144c0 2.209 1.791 4 4 4h72c15.464 0 28 12.536 28 28 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-15.464 12.536-28 28-28h72c2.209 0 4-1.791 4-4v-144c0-2.209-1.791-4-4-4ZM96 196h-68v-136h68c15.464 0 28 12.536 28 28v121.4C117.176 200.925 106.881 195.998 96 196ZM228 196h-68c-10.882 0-21.178 4.931-28 13.41v-121.41c0-15.464 12.536-28 28-28h68ZM160 92h40c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4ZM204 128c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM204 160c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
