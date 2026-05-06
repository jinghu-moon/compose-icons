package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorThinIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 192c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4ZM120 68h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM136 124h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM212 40v176c0 6.627-5.373 12-12 12h-144c-6.627 0-12-5.373-12-12v-176C44 33.373 49.373 28 56 28h144c6.627 0 12 5.373 12 12ZM52 156h152v-56h-152ZM52 40v52h152v-52c0-2.209-1.791-4-4-4h-144c-2.209 0-4 1.791-4 4ZM204 216v-52h-152v52c0 2.209 1.791 4 4 4h144c2.209 0 4-1.791 4-4Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
