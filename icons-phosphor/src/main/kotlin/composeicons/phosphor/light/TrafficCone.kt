package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorLightIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 210h-19.73L151.54 35.4C149.581 29.769 144.272 25.997 138.31 26h-20.62c-5.962-.003-11.271 3.769-13.23 9.4L43.73 210h-19.73c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h208c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM94 102h68l18.08 52h-104.16ZM115.8 39.34c.281-.803 1.039-1.341 1.89-1.34h20.62c.851-.001 1.609 .537 1.89 1.34L157.82 90h-59.64ZM71.74 166h112.52l15.3 44h-143.12Z"),
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
