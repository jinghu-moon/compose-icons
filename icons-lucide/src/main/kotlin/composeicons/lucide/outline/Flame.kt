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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3q1 4 4 6.5Q19 12 19 15c0 3.866-3.134 7-7 7C8.134 22 5 18.866 5 15c0-1.082 .351-2.135 1-3 0 1.381 1.119 2.5 2.5 2.5C9.881 14.5 11 13.381 11 12 11 10 9.5 9 9.5 7Q9.5 5 12 3"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
