package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = lucideOutlineIcon(
            name = "Send",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.536 21.686 C 14.614 21.880 14.804 22.005 15.013 22.000 C 15.222 21.994 15.405 21.860 15.473 21.662 L 21.973 2.662 C 22.038 2.481 21.993 2.279 21.857 2.143 C 21.721 2.007 21.519 1.962 21.338 2.027 L 2.338 8.527 C 2.140 8.595 2.006 8.778 2.000 8.987 C 1.995 9.196 2.120 9.386 2.314 9.464 L 10.244 12.644 C 10.751 12.847 11.152 13.248 11.356 13.754 Z"),
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
        pathData = parseSvgPathData("M 21.854 2.147 L 10.914 13.086"),
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
        return _send!!
    }

private var _send: ImageVector? = null
