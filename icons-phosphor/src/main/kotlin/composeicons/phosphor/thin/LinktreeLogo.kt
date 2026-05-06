package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorThinIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 160v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-72c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM208 100h-70.34L186.83 50.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L132 94.34v-70.34c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v70.34L74.83 45.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L118.34 100h-70.34c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h70.34L69.17 157.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L128 109.66l53.17 53.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L137.66 108h70.34c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
