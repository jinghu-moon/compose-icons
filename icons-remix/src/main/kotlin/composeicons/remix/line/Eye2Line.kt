package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Eye2Line: ImageVector
    get() {
        if (_eye2Line != null) return _eye2Line!!
        _eye2Line = remixIcon(
            name = "Eye2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM12 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12c0-.513 .077-1.007 .221-1.473C7.612 11.395 8.485 12 9.5 12 10.881 12 12 10.881 12 9.5 12 8.485 11.395 7.612 10.527 7.22 10.993 7.077 11.487 7 12 7Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _eye2Line!!
    }

private var _eye2Line: ImageVector? = null
