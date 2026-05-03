package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessagesSquare: ImageVector
    get() {
        if (_messagesSquare != null) return _messagesSquare!!
        _messagesSquare = lucideOutlineIcon(
            name = "MessagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 10.000 C 16.000 11.105 15.105 12.000 14.000 12.000 L 6.828 12.000 C 6.298 12.000 5.789 12.211 5.414 12.586 L 3.212 14.788 C 3.009 14.991 2.704 15.052 2.438 14.942 C 2.173 14.832 2.000 14.573 2.000 14.286 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000 L 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 Z"),
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
                pathData = parseSvgPathData("M 20.000 9.000 C 21.105 9.000 22.000 9.895 22.000 11.000 L 22.000 21.286 C 22.000 21.573 21.827 21.832 21.562 21.942 C 21.296 22.052 20.991 21.991 20.788 21.788 L 18.586 19.586 C 18.211 19.211 17.702 19.000 17.172 19.000 L 10.000 19.000 C 8.895 19.000 8.000 18.105 8.000 17.000 L 8.000 16.000"),
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
        return _messagesSquare!!
    }

private var _messagesSquare: ImageVector? = null
