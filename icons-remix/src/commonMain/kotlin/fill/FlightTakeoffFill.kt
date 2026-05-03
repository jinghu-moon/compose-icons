package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlightTakeoffFill: ImageVector
    get() {
        if (_flightTakeoffFill != null) return _flightTakeoffFill!!
        _flightTakeoffFill = remixIcon(
            name = "FlightTakeoffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.949 10.112 C 22.163 10.912 21.689 11.734 20.888 11.949 L 5.222 16.147 C 4.779 16.265 4.311 16.067 4.089 15.666 L 1.466 10.941 L 2.915 10.553 L 5.383 12.998 L 10.478 11.633 L 5.967 4.559 L 7.899 4.041 L 14.851 10.461 L 20.112 9.051 C 20.912 8.837 21.735 9.312 21.949 10.112 ZM 4.000 19.000 L 20.000 19.000 L 20.000 21.000 L 4.000 21.000 L 4.000 19.000 Z"),
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
        return _flightTakeoffFill!!
    }

private var _flightTakeoffFill: ImageVector? = null
