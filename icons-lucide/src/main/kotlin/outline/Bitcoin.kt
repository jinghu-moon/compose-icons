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
                pathData = parseSvgPathData("M 11.767 19.089 C 16.691 19.957 17.907 13.064 12.983 12.195M 11.767 19.089 L 5.860 18.047M 11.768 19.089 L 11.421 21.059M 12.984 12.195 C 17.908 13.064 19.124 6.170 14.199 5.302M 12.984 12.195 L 9.044 11.501M 14.199 5.301 L 8.290 4.260M 14.198 5.302 L 14.546 3.332M 7.480 20.364 L 10.606 2.637"),
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
