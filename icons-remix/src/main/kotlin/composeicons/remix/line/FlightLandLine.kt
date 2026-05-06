package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlightLandLine: ImageVector
    get() {
        if (_flightLandLine != null) return _flightLandLine!!
        _flightLandLine = remixIcon(
            name = "FlightLandLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.949 14.888c-.214 .8-1.037 1.275-1.837 1.061L3.445 11.751c-.443-.119-.749-.524-.741-.983L2.795 5.365l1.449 .388 .915 3.351 5.095 1.365L9.885 2.088l1.932 .518 2.81 9.035 5.261 1.41c.8 .214 1.275 1.037 1.061 1.837ZM4 19h16v2h-16v-2Z"),
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
        return _flightLandLine!!
    }

private var _flightLandLine: ImageVector? = null
