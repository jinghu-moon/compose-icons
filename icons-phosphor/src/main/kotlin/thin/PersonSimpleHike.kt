package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorThinIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 76.000 C 167.464 76.000 180.000 63.464 180.000 48.000 C 180.000 32.536 167.464 20.000 152.000 20.000 C 136.536 20.000 124.000 32.536 124.000 48.000 C 124.000 63.464 136.536 76.000 152.000 76.000 ZM 152.000 28.000 C 163.046 28.000 172.000 36.954 172.000 48.000 C 172.000 59.046 163.046 68.000 152.000 68.000 C 140.954 68.000 132.000 59.046 132.000 48.000 C 132.000 36.954 140.954 28.000 152.000 28.000 ZM 196.000 144.000 L 196.000 232.000 C 196.000 234.209 194.209 236.000 192.000 236.000 C 189.791 236.000 188.000 234.209 188.000 232.000 L 188.000 147.920 C 161.320 146.790 153.200 134.260 145.330 122.130 C 141.800 116.670 138.460 111.520 133.330 107.130 C 132.670 106.570 132.000 106.030 131.330 105.530 L 114.500 144.290 L 154.330 172.740 C 155.381 173.493 156.003 174.707 156.000 176.000 L 156.000 232.000 C 156.000 234.209 154.209 236.000 152.000 236.000 C 149.791 236.000 148.000 234.209 148.000 232.000 L 148.000 178.060 L 111.230 151.800 L 75.670 233.590 C 75.036 235.053 73.594 236.000 72.000 236.000 C 71.453 235.998 70.913 235.885 70.410 235.670 C 69.434 235.248 68.666 234.456 68.276 233.467 C 67.886 232.478 67.905 231.374 68.330 230.400 L 125.860 98.090 C 126.294 97.069 127.132 96.273 128.175 95.894 C 129.218 95.515 130.372 95.586 131.360 96.090 C 133.966 97.445 136.403 99.103 138.620 101.030 C 144.560 106.180 148.360 112.030 152.040 117.740 C 159.770 129.700 166.450 140.000 192.000 140.000 C 194.209 140.000 196.000 141.791 196.000 144.000 ZM 72.000 148.000 C 73.603 148.000 75.051 147.044 75.680 145.570 L 99.680 89.570 C 100.549 87.540 99.609 85.191 97.580 84.320 L 69.580 72.320 C 68.604 71.900 67.501 71.885 66.514 72.279 C 65.528 72.673 64.738 73.443 64.320 74.420 L 40.320 130.420 C 39.900 131.397 39.887 132.501 40.283 133.488 C 40.679 134.475 41.451 135.264 42.430 135.680 L 70.430 147.680 C 70.926 147.893 71.460 148.002 72.000 148.000 ZM 49.250 129.900 L 70.100 81.250 L 90.750 90.100 L 69.900 138.750 Z"),
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
