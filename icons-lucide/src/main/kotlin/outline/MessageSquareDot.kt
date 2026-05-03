package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareDot: ImageVector
    get() {
        if (_messageSquareDot != null) return _messageSquareDot!!
        _messageSquareDot = lucideOutlineIcon(
            name = "MessageSquareDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.700 3.000 L 4.000 3.000 C 2.895 3.000 2.000 3.895 2.000 5.000 L 2.000 21.286 C 2.000 21.573 2.173 21.832 2.438 21.942 C 2.704 22.052 3.009 21.991 3.212 21.788 L 5.414 19.586 C 5.789 19.211 6.298 19.000 6.828 19.000 L 20.000 19.000 C 21.105 19.000 22.000 18.105 22.000 17.000 L 22.000 12.300"),
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
                pathData = parseSvgPathData("M 22.000 6.000 C 22.000 7.657 20.657 9.000 19.000 9.000 C 17.343 9.000 16.000 7.657 16.000 6.000 C 16.000 4.343 17.343 3.000 19.000 3.000 C 20.657 3.000 22.000 4.343 22.000 6.000 Z"),
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
        return _messageSquareDot!!
    }

private var _messageSquareDot: ImageVector? = null
