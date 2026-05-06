package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapPinUserLine: ImageVector
    get() {
        if (_mapPinUserLine != null) return _mapPinUserLine!!
        _mapPinUserLine = remixIcon(
            name = "MapPinUserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.084 15.812c2.599-2.743 2.554-7.074-.134-9.762C14.216 3.317 9.784 3.317 7.05 6.05 4.362 8.738 4.317 13.069 6.916 15.812 7.978 14.123 9.858 13 12 13c2.142 0 4.022 1.123 5.084 2.812ZM8.385 17.285 12 20.899l3.615-3.615C14.972 15.934 13.595 15 12 15c-1.595 0-2.972 .934-3.615 2.285ZM12 23.728 5.636 17.364C2.121 13.849 2.121 8.151 5.636 4.636c3.515-3.515 9.213-3.515 12.728 0 3.515 3.515 3.515 9.213 0 12.728L12 23.728ZM12 10c.552 0 1-.448 1-1C13 8.448 12.552 8 12 8c-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM12 12C10.343 12 9 10.657 9 9 9 7.343 10.343 6 12 6c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z"),
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
        return _mapPinUserLine!!
    }

private var _mapPinUserLine: ImageVector? = null
