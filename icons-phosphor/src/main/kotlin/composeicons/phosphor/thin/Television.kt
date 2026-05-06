package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorThinIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 68h-78.34L178.83 26.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L128 66.34 82.83 21.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L118.34 68h-78.34C33.373 68 28 73.373 28 80v120c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-120c0-6.627-5.373-12-12-12ZM36 200v-120c0-2.209 1.791-4 4-4h108v128h-108c-2.209 0-4-1.791-4-4ZM220 200c0 2.209-1.791 4-4 4h-60v-128h60c2.209 0 4 1.791 4 4ZM196 116c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM196 164c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _television!!
    }

private var _television: ImageVector? = null
