package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Weight: ImageVector
    get() {
        if (_weight != null) return _weight!!
        _weight = lucideOutlineIcon(
            name = "Weight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 5.000 C 15.000 6.657 13.657 8.000 12.000 8.000 C 10.343 8.000 9.000 6.657 9.000 5.000 C 9.000 3.343 10.343 2.000 12.000 2.000 C 13.657 2.000 15.000 3.343 15.000 5.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 6.500 8.000 C 5.611 8.009 4.835 8.604 4.595 9.460 L 2.100 18.500 C 1.947 19.093 2.074 19.723 2.444 20.210 C 2.815 20.698 3.388 20.989 4.000 21.000 L 20.000 21.000 C 20.626 21.000 21.215 20.707 21.593 20.208 C 21.971 19.709 22.094 19.062 21.925 18.460 L 19.400 9.500 C 19.174 8.623 18.386 8.007 17.480 8.000 Z"),
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
        return _weight!!
    }

private var _weight: ImageVector? = null
