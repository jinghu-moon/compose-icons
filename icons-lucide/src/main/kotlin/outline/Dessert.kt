package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dessert: ImageVector
    get() {
        if (_dessert != null) return _dessert!!
        _dessert = lucideOutlineIcon(
            name = "Dessert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.162 3.167 C 5.429 4.052 1.998 8.185 2.000 13.000 C 2.000 14.105 2.895 15.000 4.000 15.000 C 5.105 15.000 6.000 14.105 6.000 13.000 L 6.000 12.000 C 6.000 10.895 6.895 10.000 8.000 10.000 C 9.105 10.000 10.000 10.895 10.000 12.000 L 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 L 14.000 12.000 C 14.000 10.895 14.895 10.000 16.000 10.000 C 17.105 10.000 18.000 10.895 18.000 12.000 L 18.000 13.000 C 18.002 14.105 18.898 14.999 20.003 14.997 C 21.108 14.995 22.002 14.099 22.000 12.994 C 21.998 8.182 18.569 4.053 13.839 3.168"),
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
                pathData = parseSvgPathData("M 20.804 14.869 C 19.922 19.027 16.251 22.001 12.000 22.001 C 7.749 22.001 4.078 19.027 3.196 14.869"),
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
                pathData = parseSvgPathData("M 14.000 4.000 C 14.000 5.105 13.105 6.000 12.000 6.000 C 10.895 6.000 10.000 5.105 10.000 4.000 C 10.000 2.895 10.895 2.000 12.000 2.000 C 13.105 2.000 14.000 2.895 14.000 4.000 Z"),
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
        return _dessert!!
    }

private var _dessert: ImageVector? = null
