package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LogoutBoxRLine: ImageVector
    get() {
        if (_logoutBoxRLine != null) return _logoutBoxRLine!!
        _logoutBoxRLine = remixIcon(
            name = "LogoutBoxRLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 22C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2h14c.552 0 1 .448 1 1v3h-2v-2h-12v16h12v-2h2v3c0 .552-.448 1-1 1h-14ZM18 16v-3h-7v-2h7v-3l5 4-5 4Z"),
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
        return _logoutBoxRLine!!
    }

private var _logoutBoxRLine: ImageVector? = null
