package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorDuotoneIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 60.000 C 192.000 71.046 183.046 80.000 172.000 80.000 C 160.954 80.000 152.000 71.046 152.000 60.000 C 152.000 48.954 160.954 40.000 172.000 40.000 C 183.046 40.000 192.000 48.954 192.000 60.000 Z"),
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
        pathData = parseSvgPathData("M 172.000 88.000 C 187.464 88.000 200.000 75.464 200.000 60.000 C 200.000 44.536 187.464 32.000 172.000 32.000 C 156.536 32.000 144.000 44.536 144.000 60.000 C 144.000 75.464 156.536 88.000 172.000 88.000 ZM 172.000 48.000 C 178.627 48.000 184.000 53.373 184.000 60.000 C 184.000 66.627 178.627 72.000 172.000 72.000 C 165.373 72.000 160.000 66.627 160.000 60.000 C 160.000 53.373 165.373 48.000 172.000 48.000 ZM 32.320 77.760 C 33.557 73.518 37.998 71.083 42.240 72.320 L 112.000 92.670 L 122.320 82.340 C 123.821 80.838 125.857 79.994 127.980 79.994 C 130.103 79.994 132.139 80.838 133.640 82.340 L 163.310 112.000 L 200.000 112.000 C 204.418 112.000 208.000 115.582 208.000 120.000 C 208.000 124.418 204.418 128.000 200.000 128.000 L 160.000 128.000 C 157.878 128.002 155.842 127.160 154.340 125.660 L 148.730 120.000 L 37.730 87.640 C 33.521 86.389 31.106 81.980 32.320 77.760 ZM 236.440 204.240 C 219.267 215.715 197.892 218.992 178.070 213.190 L 21.760 167.670 C 17.518 166.433 15.083 161.992 16.320 157.750 C 17.557 153.508 21.998 151.073 26.240 152.310 L 102.240 174.440 L 128.730 148.000 L 85.800 135.690 C 81.550 134.475 79.090 130.045 80.305 125.795 C 81.520 121.545 85.950 119.085 90.200 120.300 L 146.200 136.300 C 148.926 137.078 151.037 139.241 151.748 141.986 C 152.459 144.730 151.665 147.646 149.660 149.650 L 119.760 179.550 L 182.550 197.830 C 197.832 202.305 214.311 199.779 227.550 190.930 C 231.225 188.478 236.193 189.470 238.645 193.145 C 241.097 196.820 240.105 201.788 236.430 204.240 Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
