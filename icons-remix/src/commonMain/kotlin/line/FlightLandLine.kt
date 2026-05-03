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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.949 14.888 C 20.735 15.688 19.912 16.163 19.112 15.949 L 3.445 11.751 C 3.002 11.632 2.697 11.227 2.704 10.768 L 2.795 5.365 L 4.244 5.753 L 5.159 9.104 L 10.254 10.470 L 9.885 2.088 L 11.817 2.606 L 14.627 11.641 L 19.888 13.051 C 20.688 13.266 21.163 14.088 20.949 14.888 ZM 4.000 19.000 L 20.000 19.000 L 20.000 21.000 L 4.000 21.000 L 4.000 19.000 Z"),
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
        return _flightLandLine!!
    }

private var _flightLandLine: ImageVector? = null
