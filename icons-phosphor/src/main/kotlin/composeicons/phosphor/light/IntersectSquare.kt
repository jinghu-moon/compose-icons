package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.IntersectSquare: ImageVector
    get() {
        if (_intersectSquare != null) return _intersectSquare!!
        _intersectSquare = phosphorLightIcon(
            name = "IntersectSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 90h-50v-50c0-3.314-2.686-6-6-6h-120c-3.314 0-6 2.686-6 6v120c0 3.314 2.686 6 6 6h50v50c0 3.314 2.686 6 6 6h120c3.314 0 6-2.686 6-6v-120c0-3.314-2.686-6-6-6ZM46 154v-108h108v44h-58c-3.314 0-6 2.686-6 6v58ZM102 110.48 145.52 154h-43.52ZM154 145.48 110.48 102h43.52ZM210 210h-108v-44h58c3.314 0 6-2.686 6-6v-58h44Z"),
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
