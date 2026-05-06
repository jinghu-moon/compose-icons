package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorThinIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 138.83l-32 32c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L222.34 140h-100.68L57.66 204h38.34c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v38.34l64-64v-100.68L90.83 58.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l32 32c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L124 33.66v98.34h98.34L197.17 106.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l32 32c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83Z"),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
