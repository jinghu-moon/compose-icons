package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorThinIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 104c.002-1.675 1.048-3.172 2.62-3.75l152-56c1.357-.571 2.919-.35 4.064 .575 1.146 .925 1.69 2.405 1.418 3.852-.273 1.447-1.318 2.627-2.722 3.073L59.57 104l141.81 52.25c1.813 .673 2.885 2.547 2.546 4.451-.339 1.904-1.992 3.293-3.926 3.299-.471 .001-.939-.084-1.38-.25l-152-56C45.048 107.172 44.002 105.675 44 104ZM200 196h-152c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h152c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
