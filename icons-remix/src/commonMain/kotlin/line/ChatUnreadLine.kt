package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatUnreadLine: ImageVector
    get() {
        if (_chatUnreadLine != null) return _chatUnreadLine!!
        _chatUnreadLine = remixIcon(
            name = "ChatUnreadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 7.000 C 22.657 7.000 24.000 5.657 24.000 4.000 C 24.000 2.343 22.657 1.000 21.000 1.000 C 19.343 1.000 18.000 2.343 18.000 4.000 C 18.000 5.657 19.343 7.000 21.000 7.000 ZM 22.000 18.000 L 22.000 8.900 C 21.677 8.966 21.343 9.000 21.000 9.000 C 20.657 9.000 20.323 8.966 20.000 8.900 L 20.000 17.000 L 5.763 17.000 L 4.000 18.385 L 4.000 5.000 L 16.100 5.000 C 16.034 4.677 16.000 4.342 16.000 4.000 C 16.000 3.658 16.034 3.323 16.100 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 22.500 L 6.455 19.000 L 21.000 19.000 C 21.552 19.000 22.000 18.552 22.000 18.000 Z"),
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
        return _chatUnreadLine!!
    }

private var _chatUnreadLine: ImageVector? = null
