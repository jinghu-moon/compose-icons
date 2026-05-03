package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareLock: ImageVector
    get() {
        if (_messageSquareLock != null) return _messageSquareLock!!
        _messageSquareLock = lucideOutlineIcon(
            name = "MessageSquareLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 8.500 L 22.000 5.000 C 22.000 3.895 21.105 3.000 20.000 3.000 L 4.000 3.000 C 2.895 3.000 2.000 3.895 2.000 5.000 L 2.000 21.286 C 2.000 21.573 2.173 21.832 2.438 21.942 C 2.704 22.052 3.009 21.991 3.212 21.788 L 5.414 19.586 C 5.789 19.211 6.298 19.000 6.828 19.000 L 10.000 19.000"),
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
        pathData = parseSvgPathData("M 20.000 15.000 L 20.000 13.000 C 20.000 11.895 19.105 11.000 18.000 11.000 C 16.895 11.000 16.000 11.895 16.000 13.000 L 16.000 15.000"),
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
        pathData = parseSvgPathData("M 15.000 15.000 L 21.000 15.000 C 21.552 15.000 22.000 15.448 22.000 16.000 L 22.000 19.000 C 22.000 19.552 21.552 20.000 21.000 20.000 L 15.000 20.000 C 14.448 20.000 14.000 19.552 14.000 19.000 L 14.000 16.000 C 14.000 15.448 14.448 15.000 15.000 15.000 Z"),
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
        return _messageSquareLock!!
    }

private var _messageSquareLock: ImageVector? = null
