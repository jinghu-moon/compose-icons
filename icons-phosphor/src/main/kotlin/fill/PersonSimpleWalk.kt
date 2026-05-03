package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorFillIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 48.000 C 120.000 30.327 134.327 16.000 152.000 16.000 C 169.673 16.000 184.000 30.327 184.000 48.000 C 184.000 65.673 169.673 80.000 152.000 80.000 C 134.327 80.000 120.000 65.673 120.000 48.000 ZM 208.000 136.000 C 179.360 136.000 166.190 122.700 152.250 108.630 C 148.720 105.060 145.070 101.370 141.250 98.050 C 104.250 65.910 45.030 120.780 42.530 123.130 C 39.434 126.178 39.336 131.140 42.311 134.308 C 45.285 137.475 50.244 137.689 53.480 134.790 C 62.786 126.383 73.026 119.072 84.000 113.000 C 97.780 105.620 109.390 102.770 118.700 104.420 L 64.660 228.810 C 62.903 232.861 64.760 237.570 68.810 239.330 C 69.815 239.774 70.901 240.003 72.000 240.000 C 75.186 240.001 78.069 238.112 79.340 235.190 L 112.930 157.920 L 144.000 180.120 L 144.000 232.000 C 144.000 236.418 147.582 240.000 152.000 240.000 C 156.418 240.000 160.000 236.418 160.000 232.000 L 160.000 176.000 C 160.000 173.416 158.752 170.992 156.650 169.490 L 119.450 142.920 L 132.880 112.000 C 135.520 114.440 138.140 117.070 140.880 119.840 C 155.050 134.190 172.690 152.000 208.000 152.000 C 212.418 152.000 216.000 148.418 216.000 144.000 C 216.000 139.582 212.418 136.000 208.000 136.000 Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
