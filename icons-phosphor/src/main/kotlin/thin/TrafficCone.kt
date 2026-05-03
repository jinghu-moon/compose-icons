package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorThinIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 212.000 L 210.840 212.000 L 149.650 36.060 C 147.972 31.233 143.421 27.998 138.310 28.000 L 117.690 28.000 C 112.579 27.998 108.028 31.233 106.350 36.060 L 45.160 212.000 L 24.000 212.000 C 21.791 212.000 20.000 213.791 20.000 216.000 C 20.000 218.209 21.791 220.000 24.000 220.000 L 232.000 220.000 C 234.209 220.000 236.000 218.209 236.000 216.000 C 236.000 213.791 234.209 212.000 232.000 212.000 ZM 92.580 100.000 L 163.420 100.000 L 182.890 156.000 L 73.110 156.000 ZM 113.910 38.690 C 114.468 37.080 115.986 36.000 117.690 36.000 L 138.310 36.000 C 140.014 36.000 141.532 37.080 142.090 38.690 L 160.630 92.000 L 95.370 92.000 ZM 70.320 164.000 L 185.680 164.000 L 202.370 212.000 L 53.630 212.000 Z"),
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
