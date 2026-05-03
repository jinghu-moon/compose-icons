package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SensorFill: ImageVector
    get() {
        if (_sensorFill != null) return _sensorFill!!
        _sensorFill = remixIcon(
            name = "SensorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 8.000 L 6.000 10.000 L 18.000 10.000 L 18.000 8.000 L 15.000 8.000 L 15.000 2.000 L 17.000 2.000 L 17.000 6.000 L 22.000 6.000 L 22.000 8.000 L 20.000 8.000 L 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 8.000 L 2.000 8.000 L 2.000 6.000 L 7.000 6.000 L 7.000 2.000 L 9.000 2.000 L 9.000 8.000 L 6.000 8.000 ZM 13.000 2.000 L 13.000 8.000 L 11.000 8.000 L 11.000 2.000 L 13.000 2.000 Z"),
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
        return _sensorFill!!
    }

private var _sensorFill: ImageVector? = null
