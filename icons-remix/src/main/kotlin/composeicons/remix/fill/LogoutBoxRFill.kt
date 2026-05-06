package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LogoutBoxRFill: ImageVector
    get() {
        if (_logoutBoxRFill != null) return _logoutBoxRFill!!
        _logoutBoxRFill = remixIcon(
            name = "LogoutBoxRFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 22C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2h14c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-14ZM15 16l5-4L15 8v3h-6v2h6v3Z"),
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
        return _logoutBoxRFill!!
    }

private var _logoutBoxRFill: ImageVector? = null
