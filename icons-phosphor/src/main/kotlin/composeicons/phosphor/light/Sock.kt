package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorLightIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 18h-88C96.268 18 90 24.268 90 32v77.51L50.67 148.85C36.09 163.185 30.32 184.24 35.556 204.005c5.236 19.765 20.673 35.202 40.438 40.438 19.765 5.236 40.82-.533 55.155-15.113l68.41-68.4c4.137-4.12 6.455-9.722 6.44-15.56v-113.37c0-7.732-6.268-14-14-14ZM104 30h88c1.105 0 2 .895 2 2v18h-92v-18c0-1.105 .895-2 2-2ZM122.67 220.85c-17.612 17.116-45.704 16.915-63.07-.45C42.235 203.034 42.034 174.942 59.15 157.33l41.09-41.09c1.126-1.124 1.759-2.649 1.76-4.24v-50h92v44.34c-27.314 3.086-47.965 26.173-48 53.66-.028 10.281 2.913 20.35 8.47 29ZM191.07 152.44l-27.85 27.86C159.773 174.091 157.976 167.102 158 160c.026-20.867 15.35-38.558 36-41.56v26.93c.007 2.653-1.048 5.199-2.93 7.07Z"),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
