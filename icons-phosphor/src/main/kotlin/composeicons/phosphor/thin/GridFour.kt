package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GridFour: ImageVector
    get() {
        if (_gridFour != null) return _gridFour!!
        _gridFour = phosphorThinIcon(
            name = "GridFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 44h-144C49.373 44 44 49.373 44 56v144c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM204 56v68h-72v-72h68c2.209 0 4 1.791 4 4ZM56 52h68v72h-72v-68c0-2.209 1.791-4 4-4ZM52 200v-68h72v72h-68c-2.209 0-4-1.791-4-4ZM200 204h-68v-72h72v68c0 2.209-1.791 4-4 4Z"),
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
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
