package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SquareHalf: ImageVector
    get() {
        if (_squareHalf != null) return _squareHalf!!
        _squareHalf = phosphorThinIcon(
            name = "SquareHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 44h-144C49.373 44 44 49.373 44 56v144c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM132 116h72v24h-72ZM132 108v-24h72v24ZM132 148h72v24h-72ZM204 56v20h-72v-24h68c2.209 0 4 1.791 4 4ZM52 200v-144c0-2.209 1.791-4 4-4h68v152h-68c-2.209 0-4-1.791-4-4ZM200 204h-68v-24h72v20c0 2.209-1.791 4-4 4Z"),
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
        return _squareHalf!!
    }

private var _squareHalf: ImageVector? = null
