package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IntersectSquare: ImageVector
    get() {
        if (_intersectSquare != null) return _intersectSquare!!
        _intersectSquare = phosphorBoldIcon(
            name = "IntersectSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 84h-44v-44c0-6.627-5.373-12-12-12h-120C33.373 28 28 33.373 28 40v120c0 6.627 5.373 12 12 12h44v44c0 6.627 5.373 12 12 12h120c6.627 0 12-5.373 12-12v-120c0-6.627-5.373-12-12-12ZM52 148v-96h96v32h-52C89.373 84 84 89.373 84 96v52ZM108 125l23 23h-23ZM148 131 125 108h23ZM204 204h-96v-32h52c6.627 0 12-5.373 12-12v-52h32Z"),
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
