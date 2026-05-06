package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorLightIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.74 117.71 138.29 14.26c-5.685-5.679-14.895-5.679-20.58 0L14.26 117.71c-5.679 5.685-5.679 14.895 0 20.58L117.71 241.74h0c5.685 5.679 14.895 5.679 20.58 0L241.74 138.29c5.679-5.685 5.679-14.895 0-20.58ZM233.25 129.81 129.81 233.25c-1 .999-2.62 .999-3.62 0h0L22.75 129.81c-.999-1-.999-2.62 0-3.62L126.19 22.75c1-.999 2.62-.999 3.62 0L233.25 126.19c.999 1 .999 2.62 0 3.62ZM172.25 115.81c2.34 2.343 2.34 6.137 0 8.48l-24 24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L153.51 126h-41.51c-9.941 0-18 8.059-18 18v8c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-8c0-16.569 13.431-30 30-30h41.51L139.76 100.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
