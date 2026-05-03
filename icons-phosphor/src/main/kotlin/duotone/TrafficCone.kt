package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorDuotoneIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 188.520 160.000 L 67.520 160.000 L 89.740 96.000 L 166.260 96.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 232.000 208.000 L 213.690 208.000 L 153.420 34.750 C 151.185 28.316 145.121 24.002 138.310 24.000 L 117.690 24.000 C 110.881 24.000 104.818 28.310 102.580 34.740 L 42.310 208.000 L 24.000 208.000 C 19.582 208.000 16.000 211.582 16.000 216.000 C 16.000 220.418 19.582 224.000 24.000 224.000 L 232.000 224.000 C 236.418 224.000 240.000 220.418 240.000 216.000 C 240.000 211.582 236.418 208.000 232.000 208.000 ZM 117.690 40.000 L 138.310 40.000 L 155.000 88.000 L 101.000 88.000 ZM 95.430 104.000 L 160.570 104.000 L 177.270 152.000 L 78.730 152.000 ZM 59.250 208.000 L 73.170 168.000 L 182.830 168.000 L 196.750 208.000 Z"),
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
