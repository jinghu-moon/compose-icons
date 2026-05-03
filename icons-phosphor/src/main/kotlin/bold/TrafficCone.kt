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
                pathData = parseSvgPathData("M 232.000 204.000 L 216.530 204.000 L 157.200 33.430 C 154.403 25.389 146.823 20.000 138.310 20.000 L 117.690 20.000 C 109.177 20.000 101.597 25.389 98.800 33.430 L 39.470 204.000 L 24.000 204.000 C 17.373 204.000 12.000 209.373 12.000 216.000 C 12.000 222.627 17.373 228.000 24.000 228.000 L 232.000 228.000 C 238.627 228.000 244.000 222.627 244.000 216.000 C 244.000 209.373 238.627 204.000 232.000 204.000 ZM 98.270 108.000 L 157.730 108.000 L 171.640 148.000 L 84.360 148.000 ZM 120.530 44.000 L 135.470 44.000 L 149.380 84.000 L 106.620 84.000 ZM 76.000 172.000 L 180.000 172.000 L 191.130 204.000 L 64.880 204.000 Z"),
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
