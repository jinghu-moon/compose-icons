package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TrafficLightLine: ImageVector
    get() {
        if (_trafficLightLine != null) return _trafficLightLine!!
        _trafficLightLine = remixIcon(
            name = "TrafficLightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 4v-1C7 2.448 7.448 2 8 2h8c.552 0 1 .448 1 1v1h3c0 2.5-2.5 3.5-3 3.5v2.5h3c0 2.5-2.5 3.5-3 3.5v2.5h3c0 2.5-2.5 3.5-3 3.5v1.5c0 .552-.448 1-1 1h-8C7.448 22 7 21.552 7 21v-1.5c-.5 0-3-1-3-3.5h3v-2.5c-.5 0-3-1-3-3.5h3v-2.5C6.5 7.5 4 6.5 4 4h3ZM12 20c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM12 14c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM12 8c1.105 0 2-.895 2-2C14 4.895 13.105 4 12 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _trafficLightLine!!
    }

private var _trafficLightLine: ImageVector? = null
