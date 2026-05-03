package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorLightIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.840 118.630 C 213.384 116.680 211.985 115.085 210.110 114.380 L 150.880 92.170 L 165.880 17.170 C 166.406 14.540 165.122 11.880 162.736 10.656 C 160.349 9.431 157.440 9.939 155.610 11.900 L 43.610 131.900 C 42.244 133.365 41.699 135.414 42.157 137.364 C 42.614 139.314 44.015 140.906 45.890 141.610 L 105.120 163.820 L 90.120 238.820 C 89.591 241.451 90.873 244.113 93.260 245.340 C 94.109 245.772 95.048 245.998 96.000 246.000 C 97.665 246.000 99.255 245.308 100.390 244.090 L 212.390 124.090 C 213.753 122.626 214.297 120.578 213.840 118.630 ZM 106.000 220.460 L 117.850 161.180 C 118.431 158.296 116.834 155.416 114.080 154.380 L 58.480 133.530 L 149.940 35.530 L 138.120 94.820 C 137.539 97.704 139.136 100.584 141.890 101.620 L 197.490 122.470 Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
