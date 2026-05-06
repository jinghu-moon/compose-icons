package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ExcludeSquare: ImageVector
    get() {
        if (_excludeSquare != null) return _excludeSquare!!
        _excludeSquare = phosphorFillIcon(
            name = "ExcludeSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 88v80h-48c-4.418 0-8-3.582-8-8v-120c0-4.418 3.582-8 8-8h120c4.418 0 8 3.582 8 8v48ZM216 88h-48v80h-80v48c0 4.418 3.582 8 8 8h120c4.418 0 8-3.582 8-8v-120c0-4.418-3.582-8-8-8Z"),
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
        return _excludeSquare!!
    }

private var _excludeSquare: ImageVector? = null
