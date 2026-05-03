package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorFillIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 60.000 C 144.000 44.536 156.536 32.000 172.000 32.000 C 187.464 32.000 200.000 44.536 200.000 60.000 C 200.000 75.464 187.464 88.000 172.000 88.000 C 156.536 88.000 144.000 75.464 144.000 60.000 ZM 37.760 87.680 L 148.760 120.040 L 154.370 125.650 C 155.863 127.146 157.887 127.991 160.000 128.000 L 200.000 128.000 C 204.418 128.000 208.000 124.418 208.000 120.000 C 208.000 115.582 204.418 112.000 200.000 112.000 L 163.310 112.000 L 158.590 107.280 L 158.590 107.280 L 133.690 82.380 C 132.189 80.878 130.153 80.034 128.030 80.034 C 125.907 80.034 123.871 80.878 122.370 82.380 L 112.000 92.670 L 42.240 72.320 C 37.998 71.083 33.557 73.518 32.320 77.760 C 31.083 82.002 33.518 86.443 37.760 87.680 ZM 238.660 193.150 C 237.483 191.383 235.652 190.156 233.570 189.739 C 231.488 189.323 229.326 189.751 227.560 190.930 C 214.321 199.779 197.842 202.305 182.560 197.830 L 119.770 179.550 L 149.670 149.650 C 151.675 147.646 152.469 144.730 151.758 141.986 C 151.047 139.241 148.936 137.078 146.210 136.300 L 90.210 120.300 C 85.960 119.085 81.530 121.545 80.315 125.795 C 79.100 130.045 81.560 134.475 85.810 135.690 L 128.730 148.000 L 102.230 174.490 L 26.230 152.360 C 21.988 151.123 17.547 153.558 16.310 157.800 C 15.073 162.042 17.508 166.483 21.750 167.720 L 178.060 213.240 C 197.882 219.042 219.257 215.765 236.430 204.290 C 238.210 203.114 239.447 201.276 239.866 199.185 C 240.285 197.093 239.850 194.920 238.660 193.150 Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
