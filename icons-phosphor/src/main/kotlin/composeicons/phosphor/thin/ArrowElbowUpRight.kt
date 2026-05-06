package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorThinIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.83 82.83l-48 48c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L206.34 84h-130.34v140c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4h134.34L165.17 34.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l48 48c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83Z"),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
