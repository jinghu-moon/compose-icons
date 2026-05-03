package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = lucideOutlineIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 22.000 L 4.000 4.000 C 4.000 3.685 4.148 3.389 4.400 3.200 C 5.439 2.421 6.702 2.000 8.000 2.000 C 11.000 2.000 13.000 4.000 15.333 4.000 Q 17.333 4.000 18.400 3.200 C 18.703 2.973 19.108 2.936 19.447 3.106 C 19.786 3.275 20.000 3.621 20.000 4.000 L 20.000 14.000 C 20.000 14.315 19.852 14.611 19.600 14.800 C 18.561 15.579 17.298 16.000 16.000 16.000 C 13.000 16.000 11.000 14.000 8.000 14.000 C 6.524 14.000 5.100 14.544 4.000 15.528"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
