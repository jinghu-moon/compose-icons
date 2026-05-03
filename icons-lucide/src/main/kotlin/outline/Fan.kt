package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = lucideOutlineIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.827 16.379 C 8.686 17.461 6.110 17.183 4.249 15.671 C 2.387 14.159 1.588 11.694 2.209 9.377 L 7.621 10.827 C 6.539 8.686 6.817 6.110 8.329 4.249 C 9.841 2.387 12.306 1.588 14.623 2.209 L 13.173 7.621 C 15.314 6.539 17.890 6.817 19.751 8.329 C 21.613 9.841 22.412 12.306 21.791 14.623 L 16.379 13.173 C 17.461 15.314 17.183 17.890 15.671 19.751 C 14.159 21.613 11.694 22.412 9.377 21.791 L 10.827 16.379 Z"),
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
        pathData = parseSvgPathData("M 12.000 12.000 L 12.000 12.010"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
