package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.IntersectSquare: ImageVector
    get() {
        if (_intersectSquare != null) return _intersectSquare!!
        _intersectSquare = phosphorFillIcon(
            name = "IntersectSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 88h-48v-48c0-4.418-3.582-8-8-8h-120c-4.418 0-8 3.582-8 8v120c0 4.418 3.582 8 8 8h48v48c0 4.418 3.582 8 8 8h120c4.418 0 8-3.582 8-8v-120c0-4.418-3.582-8-8-8ZM48 152v-104h104v40h-56c-4.418 0-8 3.582-8 8v56ZM208 208h-104v-40h56c4.418 0 8-3.582 8-8v-56h40Z"),
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
        return _intersectSquare!!
    }

private var _intersectSquare: ImageVector? = null
