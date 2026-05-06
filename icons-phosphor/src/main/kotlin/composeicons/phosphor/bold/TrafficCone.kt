package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorBoldIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 204h-15.47L157.2 33.43C154.403 25.389 146.823 20 138.31 20h-20.62c-8.513 0-16.093 5.389-18.89 13.43L39.47 204h-15.47c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM98.27 108h59.46l13.91 40h-87.28ZM120.53 44h14.94l13.91 40h-42.76ZM76 172h104l11.13 32h-126.25Z"),
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
