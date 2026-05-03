package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlagTriangleRight: ImageVector
    get() {
        if (_flagTriangleRight != null) return _flagTriangleRight!!
        _flagTriangleRight = lucideOutlineIcon(
            name = "FlagTriangleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 22.000 L 6.000 2.800 C 6.000 2.520 6.146 2.261 6.385 2.115 C 6.624 1.970 6.922 1.961 7.170 2.090 L 18.550 7.780 C 18.826 7.914 19.001 8.193 19.001 8.500 C 19.001 8.807 18.826 9.086 18.550 9.220 L 6.000 15.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _flagTriangleRight!!
    }

private var _flagTriangleRight: ImageVector? = null
