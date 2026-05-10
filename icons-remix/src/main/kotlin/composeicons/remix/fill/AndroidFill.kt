package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AndroidFill: ImageVector
    get() {
        if (_androidFill != null) return _androidFill!!
        _androidFill = remixIcon(
            name = "AndroidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.382 3.968C7.922 2.736 9.875 2 12 2c2.125 0 4.078 .736 5.618 1.968L19.071 2.515l1.414 1.414L19.032 5.382C20.264 6.922 21 8.875 21 11v1h-18v-1C3 8.875 3.736 6.922 4.968 5.382L3.515 3.929 4.929 2.515 6.382 3.968ZM3 14h18v7c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-7ZM9 9c.552 0 1-.448 1-1C10 7.448 9.552 7 9 7 8.448 7 8 7.448 8 8c0 .552 .448 1 1 1ZM15 9c.552 0 1-.448 1-1C16 7.448 15.552 7 15 7c-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _androidFill!!
    }

private var _androidFill: ImageVector? = null
