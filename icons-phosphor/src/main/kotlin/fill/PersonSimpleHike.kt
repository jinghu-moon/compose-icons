package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorFillIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 48.000 C 120.000 30.327 134.327 16.000 152.000 16.000 C 169.673 16.000 184.000 30.327 184.000 48.000 C 184.000 65.673 169.673 80.000 152.000 80.000 C 134.327 80.000 120.000 65.673 120.000 48.000 ZM 192.000 136.000 C 168.630 136.000 163.080 127.440 155.400 115.600 C 151.750 109.960 147.610 103.600 141.240 98.050 C 138.799 95.916 136.114 94.080 133.240 92.580 C 131.273 91.567 128.974 91.413 126.890 92.156 C 124.806 92.898 123.123 94.471 122.240 96.500 L 64.660 228.810 C 62.903 232.861 64.760 237.570 68.810 239.330 C 69.815 239.774 70.901 240.003 72.000 240.000 C 75.186 240.001 78.069 238.112 79.340 235.190 L 112.930 157.920 L 144.000 180.120 L 144.000 232.000 C 144.000 236.418 147.582 240.000 152.000 240.000 C 156.418 240.000 160.000 236.418 160.000 232.000 L 160.000 176.000 C 160.000 173.416 158.752 170.992 156.650 169.490 L 119.450 142.920 L 132.850 112.110 C 136.420 115.730 139.130 119.910 141.980 124.300 C 149.650 136.140 158.250 149.410 183.980 151.660 L 183.980 232.000 C 183.980 236.418 187.562 240.000 191.980 240.000 C 196.398 240.000 199.980 236.418 199.980 232.000 L 199.980 144.000 C 199.980 139.590 196.410 136.011 192.000 136.000 ZM 72.000 152.000 C 75.203 152.003 78.099 150.094 79.360 147.150 L 103.360 91.150 C 105.098 87.091 103.218 82.391 99.160 80.650 L 71.160 68.650 C 67.101 66.912 62.401 68.792 60.660 72.850 L 36.660 128.850 C 34.922 132.909 36.802 137.609 40.860 139.350 L 68.860 151.350 C 69.852 151.776 70.920 151.997 72.000 152.000 Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
