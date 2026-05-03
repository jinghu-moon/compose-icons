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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 210.000 L 212.270 210.000 L 151.540 35.400 C 149.581 29.769 144.272 25.997 138.310 26.000 L 117.690 26.000 C 111.728 25.997 106.419 29.769 104.460 35.400 L 43.730 210.000 L 24.000 210.000 C 20.686 210.000 18.000 212.686 18.000 216.000 C 18.000 219.314 20.686 222.000 24.000 222.000 L 232.000 222.000 C 235.314 222.000 238.000 219.314 238.000 216.000 C 238.000 212.686 235.314 210.000 232.000 210.000 ZM 94.000 102.000 L 162.000 102.000 L 180.080 154.000 L 75.920 154.000 ZM 115.800 39.340 C 116.081 38.537 116.839 37.999 117.690 38.000 L 138.310 38.000 C 139.161 37.999 139.919 38.537 140.200 39.340 L 157.820 90.000 L 98.180 90.000 ZM 71.740 166.000 L 184.260 166.000 L 199.560 210.000 L 56.440 210.000 Z"),
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
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
