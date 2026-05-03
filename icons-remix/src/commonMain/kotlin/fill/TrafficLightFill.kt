package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TrafficLightFill: ImageVector
    get() {
        if (_trafficLightFill != null) return _trafficLightFill!!
        _trafficLightFill = remixIcon(
            name = "TrafficLightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 4.000 L 7.000 3.000 C 7.000 2.448 7.448 2.000 8.000 2.000 L 16.000 2.000 C 16.552 2.000 17.000 2.448 17.000 3.000 L 17.000 4.000 L 20.000 4.000 C 20.000 6.500 17.500 7.500 17.000 7.500 L 17.000 10.000 L 20.000 10.000 C 20.000 12.500 17.500 13.500 17.000 13.500 L 17.000 16.000 L 20.000 16.000 C 20.000 18.500 17.500 19.500 17.000 19.500 L 17.000 21.000 C 17.000 21.552 16.552 22.000 16.000 22.000 L 8.000 22.000 C 7.448 22.000 7.000 21.552 7.000 21.000 L 7.000 19.500 C 6.500 19.500 4.000 18.500 4.000 16.000 L 7.000 16.000 L 7.000 13.500 C 6.500 13.500 4.000 12.500 4.000 10.000 L 7.000 10.000 L 7.000 7.500 C 6.500 7.500 4.000 6.500 4.000 4.000 L 7.000 4.000 ZM 12.000 20.000 C 13.105 20.000 14.000 19.105 14.000 18.000 C 14.000 16.895 13.105 16.000 12.000 16.000 C 10.895 16.000 10.000 16.895 10.000 18.000 C 10.000 19.105 10.895 20.000 12.000 20.000 ZM 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 10.895 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 ZM 12.000 8.000 C 13.105 8.000 14.000 7.105 14.000 6.000 C 14.000 4.895 13.105 4.000 12.000 4.000 C 10.895 4.000 10.000 4.895 10.000 6.000 C 10.000 7.105 10.895 8.000 12.000 8.000 Z"),
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
        return _trafficLightFill!!
    }

private var _trafficLightFill: ImageVector? = null
