package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorRegularIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40 104c.002-3.348 2.089-6.341 5.23-7.5l152-56c4.084-1.321 8.483 .817 9.967 4.845 1.485 4.027-.473 8.509-4.437 10.155L71.14 104l131.62 48.49c3.641 1.337 5.799 5.093 5.119 8.912-.68 3.819-4.001 6.6-7.879 6.598-.945-.001-1.882-.167-2.77-.49L45.23 111.51C42.086 110.349 39.998 107.352 40 104ZM200 192h-152c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h152c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
