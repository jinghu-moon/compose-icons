package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlagTriangleLeft: ImageVector
    get() {
        if (_flagTriangleLeft != null) return _flagTriangleLeft!!
        _flagTriangleLeft = lucideOutlineIcon(
            name = "FlagTriangleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 22.000 L 18.000 2.800 C 18.000 2.520 17.854 2.261 17.615 2.115 C 17.376 1.970 17.078 1.961 16.830 2.090 L 5.450 7.780 C 5.174 7.914 4.999 8.193 4.999 8.500 C 4.999 8.807 5.174 9.086 5.450 9.220 L 18.000 15.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _flagTriangleLeft!!
    }

private var _flagTriangleLeft: ImageVector? = null
