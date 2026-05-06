package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorThinIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 76h-144C33.373 76 28 81.373 28 88v112c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM188 200c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4ZM228 56v120c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-120c0-2.209-1.791-4-4-4h-152c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h152c6.627 0 12 5.373 12 12Z"),
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
        return _cards!!
    }

private var _cards: ImageVector? = null
