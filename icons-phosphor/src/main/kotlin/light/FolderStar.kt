package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorLightIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 86.000 C 217.105 86.000 218.000 86.895 218.000 88.000 L 218.000 120.000 C 218.000 123.314 220.686 126.000 224.000 126.000 C 227.314 126.000 230.000 123.314 230.000 120.000 L 230.000 88.000 C 230.000 80.268 223.732 74.000 216.000 74.000 L 130.480 74.000 L 102.580 46.100 C 99.963 43.468 96.402 41.991 92.690 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.610 C 26.000 208.001 31.989 213.994 39.380 214.000 L 120.560 214.000 C 123.874 214.000 126.560 211.314 126.560 208.000 C 126.560 204.686 123.874 202.000 120.560 202.000 L 39.380 202.000 C 38.618 201.989 38.005 201.372 38.000 200.610 L 38.000 86.000 ZM 40.000 54.000 L 92.690 54.000 C 93.218 54.000 93.725 54.208 94.100 54.580 L 113.520 74.000 L 38.000 74.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 ZM 237.720 159.800 C 236.981 157.468 234.900 155.817 232.460 155.630 L 201.460 153.230 L 189.550 125.620 C 188.596 123.432 186.437 122.018 184.050 122.018 C 181.663 122.018 179.504 123.432 178.550 125.620 L 166.640 153.230 L 135.640 155.630 C 133.200 155.817 131.118 157.468 130.379 159.801 C 129.640 162.134 130.392 164.682 132.280 166.240 L 155.770 185.630 L 148.610 214.560 C 148.030 216.905 148.913 219.368 150.849 220.811 C 152.786 222.255 155.399 222.396 157.480 221.170 L 184.000 205.500 L 210.620 221.170 C 212.701 222.396 215.314 222.255 217.251 220.811 C 219.187 219.368 220.070 216.905 219.490 214.560 L 212.330 185.630 L 235.820 166.240 C 237.708 164.682 238.460 162.133 237.720 159.800 ZM 201.780 178.800 C 200.002 180.270 199.224 182.630 199.780 184.870 L 204.420 203.610 L 187.000 193.360 C 185.123 192.257 182.797 192.257 180.920 193.360 L 163.550 203.590 L 168.180 184.850 C 168.736 182.610 167.958 180.250 166.180 178.780 L 151.240 166.450 L 171.070 164.920 C 173.275 164.731 175.197 163.343 176.070 161.310 L 184.000 143.140 L 191.840 161.310 C 192.713 163.343 194.635 164.731 196.840 164.920 L 216.670 166.450 Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
