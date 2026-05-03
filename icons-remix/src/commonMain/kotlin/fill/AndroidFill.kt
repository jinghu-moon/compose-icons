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
                pathData = parseSvgPathData("M 6.382 3.968 C 7.922 2.736 9.875 2.000 12.000 2.000 C 14.125 2.000 16.078 2.736 17.618 3.968 L 19.071 2.515 L 20.485 3.929 L 19.032 5.382 C 20.264 6.922 21.000 8.875 21.000 11.000 L 21.000 12.000 L 3.000 12.000 L 3.000 11.000 C 3.000 8.875 3.736 6.922 4.968 5.382 L 3.515 3.929 L 4.929 2.515 L 6.382 3.968 ZM 3.000 14.000 L 21.000 14.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 14.000 ZM 9.000 9.000 C 9.552 9.000 10.000 8.552 10.000 8.000 C 10.000 7.448 9.552 7.000 9.000 7.000 C 8.448 7.000 8.000 7.448 8.000 8.000 C 8.000 8.552 8.448 9.000 9.000 9.000 ZM 15.000 9.000 C 15.552 9.000 16.000 8.552 16.000 8.000 C 16.000 7.448 15.552 7.000 15.000 7.000 C 14.448 7.000 14.000 7.448 14.000 8.000 C 14.000 8.552 14.448 9.000 15.000 9.000 Z"),
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
