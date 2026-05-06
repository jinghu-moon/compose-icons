package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bitcoin: ImageVector
    get() {
        if (_bitcoin != null) return _bitcoin!!
        _bitcoin = lucideOutlineIcon(
            name = "Bitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.767 19.089c4.924 .868 6.14-6.025 1.216-6.894M11.767 19.089 5.86 18.047 11.768 19.089l-.347 1.97M12.984 12.195c4.924 .869 6.14-6.025 1.215-6.893M12.984 12.195 9.044 11.501 14.199 5.301 8.29 4.26 14.198 5.302l.348-1.97M7.48 20.364 10.606 2.637"),
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
        return _bitcoin!!
    }

private var _bitcoin: ImageVector? = null
