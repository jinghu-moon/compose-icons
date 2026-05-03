package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorLightIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 38.000 64.000 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 120.000 202.000 C 123.314 202.000 126.000 204.686 126.000 208.000 C 126.000 211.314 123.314 214.000 120.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 64.000 C 26.000 56.268 32.268 50.000 40.000 50.000 L 93.330 50.000 C 96.358 50.004 99.305 50.986 101.730 52.800 L 130.000 74.000 L 216.000 74.000 C 223.732 74.000 230.000 80.268 230.000 88.000 L 230.000 120.000 C 230.000 123.314 227.314 126.000 224.000 126.000 C 220.686 126.000 218.000 123.314 218.000 120.000 L 218.000 88.000 C 218.000 86.895 217.105 86.000 216.000 86.000 L 128.000 86.000 C 126.702 86.000 125.439 85.579 124.400 84.800 L 94.530 62.400 C 94.184 62.140 93.763 62.000 93.330 62.000 L 40.000 62.000 C 38.895 62.000 38.000 62.895 38.000 64.000 ZM 235.820 166.240 L 212.330 185.630 L 219.490 214.560 C 220.070 216.905 219.187 219.368 217.251 220.811 C 215.314 222.255 212.701 222.396 210.620 221.170 L 184.000 205.500 L 157.380 221.170 C 155.299 222.396 152.686 222.255 150.749 220.811 C 148.813 219.368 147.930 216.905 148.510 214.560 L 155.670 185.630 L 132.180 166.240 C 130.292 164.682 129.540 162.134 130.279 159.801 C 131.018 157.468 133.100 155.817 135.540 155.630 L 166.540 153.230 L 178.450 125.620 C 179.404 123.432 181.563 122.018 183.950 122.018 C 186.337 122.018 188.496 123.432 189.450 125.620 L 201.360 153.230 L 232.360 155.630 C 234.800 155.817 236.882 157.468 237.621 159.801 C 238.360 162.134 237.608 164.682 235.720 166.240 ZM 216.720 166.450 L 196.890 164.920 C 194.685 164.731 192.763 163.343 191.890 161.310 L 184.000 143.140 L 176.160 161.310 C 175.287 163.343 173.365 164.731 171.160 164.920 L 151.330 166.450 L 166.270 178.780 C 168.048 180.250 168.826 182.610 168.270 184.850 L 163.640 203.590 L 181.000 193.360 C 182.877 192.257 185.203 192.257 187.080 193.360 L 204.450 203.590 L 199.810 184.850 C 199.254 182.610 200.032 180.250 201.810 178.780 Z"),
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
        return _folderSimpleStar!!
    }

private var _folderSimpleStar: ImageVector? = null
