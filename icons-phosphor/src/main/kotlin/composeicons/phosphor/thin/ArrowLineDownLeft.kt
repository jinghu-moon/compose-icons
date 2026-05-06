package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorThinIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 48c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM181.17 93.17 76 198.34v-86.34c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-86.34L186.83 98.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
