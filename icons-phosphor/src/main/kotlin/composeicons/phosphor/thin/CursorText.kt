package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorThinIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 208c0 2.209-1.791 4-4 4h-16c-13.484-.006-25.835-7.548-32-19.54C121.835 204.452 109.484 211.994 96 212h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c15.464 0 28-12.536 28-28v-44h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-44C124 64.536 111.464 52 96 52h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c13.484 .006 25.835 7.548 32 19.54C134.165 51.548 146.516 44.006 160 44h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-15.464 0-28 12.536-28 28v44h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-20v44c0 15.464 12.536 28 28 28h16c2.209 0 4 1.791 4 4Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
