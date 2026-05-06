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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.949 10.112c.214 .8-.26 1.623-1.061 1.837L5.222 16.147c-.443 .119-.91-.079-1.133-.481L1.466 10.941l1.449-.388 2.468 2.445 5.095-1.365L5.967 4.559 7.899 4.041l6.951 6.42L20.112 9.051c.8-.214 1.623 .26 1.837 1.061ZM4 19h16v2h-16v-2Z"),
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
        return _flightTakeoffFill!!
    }

private var _flightTakeoffFill: ImageVector? = null
