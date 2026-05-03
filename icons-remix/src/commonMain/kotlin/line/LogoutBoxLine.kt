package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LogoutBoxLine: ImageVector
    get() {
        if (_logoutBoxLine != null) return _logoutBoxLine!!
        _logoutBoxLine = remixIcon(
            name = "LogoutBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 18.000 L 6.000 18.000 L 6.000 20.000 L 18.000 20.000 L 18.000 4.000 L 6.000 4.000 L 6.000 6.000 L 4.000 6.000 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 L 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 18.000 ZM 6.000 11.000 L 13.000 11.000 L 13.000 13.000 L 6.000 13.000 L 6.000 16.000 L 1.000 12.000 L 6.000 8.000 L 6.000 11.000 Z"),
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
        return _logoutBoxLine!!
    }

private var _logoutBoxLine: ImageVector? = null
