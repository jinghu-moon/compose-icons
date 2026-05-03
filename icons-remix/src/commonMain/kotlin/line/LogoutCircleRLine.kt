package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LogoutCircleRLine: ImageVector
    get() {
        if (_logoutCircleRLine != null) return _logoutCircleRLine!!
        _logoutCircleRLine = remixIcon(
            name = "LogoutCircleRLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 15.271 2.000 18.176 3.571 20.000 5.999 L 17.291 5.999 C 15.881 4.755 14.028 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 14.029 20.000 15.882 19.245 17.292 18.000 L 20.001 18.000 C 18.177 20.429 15.272 22.000 12.000 22.000 ZM 19.000 16.000 L 19.000 13.000 L 11.000 13.000 L 11.000 11.000 L 19.000 11.000 L 19.000 8.000 L 24.000 12.000 L 19.000 16.000 Z"),
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
        return _logoutCircleRLine!!
    }

private var _logoutCircleRLine: ImageVector? = null
