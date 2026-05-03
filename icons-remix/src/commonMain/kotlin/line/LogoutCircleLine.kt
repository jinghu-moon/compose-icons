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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 11.000 L 13.000 11.000 L 13.000 13.000 L 5.000 13.000 L 5.000 16.000 L 0.000 12.000 L 5.000 8.000 L 5.000 11.000 ZM 3.999 18.000 L 6.708 18.000 C 8.119 19.245 9.971 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 9.971 4.000 8.119 4.755 6.708 6.000 L 3.999 6.000 C 5.824 3.571 8.728 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 8.728 22.000 5.824 20.429 3.999 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _logoutCircleLine!!
    }

private var _logoutCircleLine: ImageVector? = null
