package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorThinIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.83 106.83l-48 48c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L214.34 108h-86.34c-50.787 .055-91.945 41.213-92 92 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 .061-55.203 44.797-99.939 100-100h86.34L173.17 58.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l48 48c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83Z"),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
