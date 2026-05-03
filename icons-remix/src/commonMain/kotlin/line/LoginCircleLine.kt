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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 11.000 L 10.000 8.000 L 15.000 12.000 L 10.000 16.000 L 10.000 13.000 L 1.000 13.000 L 1.000 11.000 L 10.000 11.000 ZM 2.458 15.000 L 4.582 15.000 C 5.768 17.932 8.643 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 8.643 4.000 5.768 6.068 4.582 9.000 L 2.458 9.000 C 3.732 4.943 7.522 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 7.522 22.000 3.732 19.057 2.458 15.000 Z"),
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
        return _loginCircleLine!!
    }

private var _loginCircleLine: ImageVector? = null
