package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PushpinLine: ImageVector
    get() {
        if (_pushpinLine != null) return _pushpinLine!!
        _pushpinLine = remixIcon(
            name = "PushpinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.827 1.69l8.485 8.485-1.414 1.414-.707-.707-4.243 4.243-.707 3.536-1.414 1.414L9.585 15.832 4.635 20.782 3.221 19.368 8.17 14.418 3.928 10.175 5.342 8.761 8.878 8.054 13.12 3.811l-.707-.707L13.827 1.69ZM14.534 5.226 9.864 9.896l-2.822 .564 6.5 6.5 .564-2.822L18.777 9.468 14.534 5.226Z"),
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
        return _pushpinLine!!
    }

private var _pushpinLine: ImageVector? = null
