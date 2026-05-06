package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorThinIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 48v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-38.34l-49.17 49.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L198.34 52h-38.34c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM101.17 149.17 52 198.34v-38.34c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-38.34l49.17-49.17c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0ZM208 156c-2.209 0-4 1.791-4 4v38.34L154.83 149.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L198.34 204h-38.34c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM57.66 52h38.34c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-38.34l49.17 49.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66Z"),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
