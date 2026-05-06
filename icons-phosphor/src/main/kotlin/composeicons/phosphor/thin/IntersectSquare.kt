package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IntersectSquare: ImageVector
    get() {
        if (_intersectSquare != null) return _intersectSquare!!
        _intersectSquare = phosphorThinIcon(
            name = "IntersectSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 92h-52v-52c0-2.209-1.791-4-4-4h-120c-2.209 0-4 1.791-4 4v120c0 2.209 1.791 4 4 4h52v52c0 2.209 1.791 4 4 4h120c2.209 0 4-1.791 4-4v-120c0-2.209-1.791-4-4-4ZM44 156v-112h112v48h-60c-2.209 0-4 1.791-4 4v60ZM100 105.66 150.34 156h-50.34ZM156 150.34 105.66 100h50.34ZM212 212h-112v-48h60c2.209 0 4-1.791 4-4v-60h48Z"),
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
