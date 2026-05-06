package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorRegularIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 208h-18.31L153.42 34.75C151.185 28.316 145.121 24.002 138.31 24h-20.62c-6.809 0-12.872 4.31-15.11 10.74L42.31 208h-18.31c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h208c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM95.43 104h65.14l16.7 48h-98.54ZM117.69 40h20.62L155 88h-54ZM73.17 168h109.66l13.92 40h-137.5Z"),
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
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
