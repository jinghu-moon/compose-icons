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
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c3.271 0 6.176 1.571 8 3.999l-2.709 0C15.881 4.755 14.028 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 2.029 0 3.882-.755 5.292-2h2.709C18.177 20.429 15.272 22 12 22ZM19 16v-3h-8v-2h8v-3l5 4-5 4Z"),
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
