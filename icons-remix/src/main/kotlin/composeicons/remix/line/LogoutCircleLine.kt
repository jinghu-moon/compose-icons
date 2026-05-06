package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LogoutCircleLine: ImageVector
    get() {
        if (_logoutCircleLine != null) return _logoutCircleLine!!
        _logoutCircleLine = remixIcon(
            name = "LogoutCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 11h8v2h-8v3L0 12 5 8v3ZM3.999 18h2.709c1.41 1.245 3.263 2 5.292 2 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 9.971 4 8.119 4.755 6.708 6h-2.709C5.824 3.571 8.728 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C8.728 22 5.824 20.429 3.999 18Z"),
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
        return _logoutCircleLine!!
    }

private var _logoutCircleLine: ImageVector? = null
