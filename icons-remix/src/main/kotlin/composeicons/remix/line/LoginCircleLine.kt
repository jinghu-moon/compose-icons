package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoginCircleLine: ImageVector
    get() {
        if (_loginCircleLine != null) return _loginCircleLine!!
        _loginCircleLine = remixIcon(
            name = "LoginCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 11v-3l5 4-5 4v-3h-9v-2h9ZM2.458 15h2.124c1.187 2.932 4.061 5 7.418 5 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 8.643 4 5.768 6.068 4.582 9h-2.124C3.732 4.943 7.522 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C7.522 22 3.732 19.057 2.458 15Z"),
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
        return _loginCircleLine!!
    }

private var _loginCircleLine: ImageVector? = null
