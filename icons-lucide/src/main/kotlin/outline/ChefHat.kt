package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = lucideOutlineIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 21.000 C 17.552 21.000 18.000 20.552 18.000 20.000 L 18.000 14.650 C 18.000 14.193 18.316 13.806 18.727 13.609 C 20.484 12.771 21.382 10.790 20.855 8.916 C 20.329 7.042 18.529 5.820 16.593 6.020 C 15.804 4.185 13.998 2.996 12.000 2.996 C 10.002 2.996 8.196 4.185 7.407 6.020 C 5.472 5.821 3.674 7.043 3.147 8.916 C 2.621 10.789 3.518 12.769 5.273 13.608 C 5.684 13.806 6.000 14.193 6.000 14.649 L 6.000 20.000 C 6.000 20.552 6.448 21.000 7.000 21.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 6.000 17.000 L 18.000 17.000"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
