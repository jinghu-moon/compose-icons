package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorRegularIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 80.000 C 169.673 80.000 184.000 65.673 184.000 48.000 C 184.000 30.327 169.673 16.000 152.000 16.000 C 134.327 16.000 120.000 30.327 120.000 48.000 C 120.000 65.673 134.327 80.000 152.000 80.000 ZM 152.000 32.000 C 160.837 32.000 168.000 39.163 168.000 48.000 C 168.000 56.837 160.837 64.000 152.000 64.000 C 143.163 64.000 136.000 56.837 136.000 48.000 C 136.000 39.163 143.163 32.000 152.000 32.000 ZM 200.000 144.000 L 200.000 232.000 C 200.000 236.418 196.418 240.000 192.000 240.000 C 187.582 240.000 184.000 236.418 184.000 232.000 L 184.000 151.660 C 158.250 149.410 149.650 136.140 142.000 124.300 C 139.150 119.910 136.440 115.730 132.870 112.110 L 119.470 142.920 L 156.670 169.490 C 158.765 170.996 160.005 173.420 160.000 176.000 L 160.000 232.000 C 160.000 236.418 156.418 240.000 152.000 240.000 C 147.582 240.000 144.000 236.418 144.000 232.000 L 144.000 180.120 L 112.930 157.920 L 79.340 235.190 C 78.069 238.112 75.186 240.001 72.000 240.000 C 70.901 240.003 69.815 239.774 68.810 239.330 C 64.764 237.566 62.912 232.858 64.670 228.810 L 122.190 96.500 C 123.073 94.471 124.756 92.898 126.840 92.156 C 128.924 91.413 131.223 91.567 133.190 92.580 C 136.064 94.080 138.749 95.916 141.190 98.050 C 147.560 103.570 151.700 109.960 155.350 115.600 C 163.030 127.440 168.570 136.000 191.950 136.000 C 194.080 135.987 196.128 136.824 197.639 138.325 C 199.150 139.827 200.000 141.870 200.000 144.000 ZM 72.000 152.000 C 75.199 151.999 78.090 150.091 79.350 147.150 L 103.350 91.150 C 105.088 87.091 103.208 82.391 99.150 80.650 L 71.150 68.650 C 67.091 66.912 62.391 68.792 60.650 72.850 L 36.650 128.850 C 34.912 132.909 36.792 137.609 40.850 139.350 L 68.850 151.350 C 69.845 151.778 70.917 151.999 72.000 152.000 ZM 54.510 127.800 L 72.200 86.500 L 85.500 92.200 L 67.800 133.490 Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
