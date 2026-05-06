package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorThinIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M54.62 156.25 196.43 104 54.62 51.75c-1.971-.829-2.942-3.062-2.203-5.069 .739-2.007 2.925-3.078 4.963-2.431l152 56c1.568 .582 2.608 2.078 2.608 3.75 0 1.672-1.04 3.168-2.608 3.75l-152 56c-.441 .166-.909 .251-1.38 .25-1.934-.006-3.587-1.395-3.926-3.299-.339-1.904 .733-3.778 2.546-4.451ZM208 196h-152c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h152c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
