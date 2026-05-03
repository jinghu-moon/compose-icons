package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = lucideOutlineIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 Q 13.000 7.000 16.000 9.500 Q 19.000 12.000 19.000 15.000 C 19.000 18.866 15.866 22.000 12.000 22.000 C 8.134 22.000 5.000 18.866 5.000 15.000 C 5.000 13.918 5.351 12.865 6.000 12.000 C 6.000 13.381 7.119 14.500 8.500 14.500 C 9.881 14.500 11.000 13.381 11.000 12.000 C 11.000 10.000 9.500 9.000 9.500 7.000 Q 9.500 5.000 12.000 3.000"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
