package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorLightIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 34.000 64.000 C 34.000 60.686 36.686 58.000 40.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 40.000 70.000 C 36.686 70.000 34.000 67.314 34.000 64.000 ZM 40.000 134.000 L 96.000 134.000 C 99.314 134.000 102.000 131.314 102.000 128.000 C 102.000 124.686 99.314 122.000 96.000 122.000 L 40.000 122.000 C 36.686 122.000 34.000 124.686 34.000 128.000 C 34.000 131.314 36.686 134.000 40.000 134.000 ZM 112.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 112.000 198.000 C 115.314 198.000 118.000 195.314 118.000 192.000 C 118.000 188.686 115.314 186.000 112.000 186.000 ZM 235.820 142.240 L 212.330 161.630 L 219.490 190.560 C 220.070 192.905 219.187 195.368 217.251 196.811 C 215.314 198.255 212.701 198.396 210.620 197.170 L 184.000 181.500 L 157.380 197.170 C 155.299 198.396 152.686 198.255 150.749 196.811 C 148.813 195.368 147.930 192.905 148.510 190.560 L 155.670 161.630 L 132.180 142.240 C 130.292 140.682 129.540 138.134 130.279 135.801 C 131.018 133.468 133.100 131.817 135.540 131.630 L 166.540 129.230 L 178.450 101.620 C 179.404 99.432 181.563 98.018 183.950 98.018 C 186.337 98.018 188.496 99.432 189.450 101.620 L 201.360 129.230 L 232.360 131.630 C 234.800 131.817 236.882 133.468 237.621 135.801 C 238.360 138.134 237.608 140.682 235.720 142.240 ZM 216.720 142.450 L 196.890 140.920 C 194.685 140.731 192.763 139.343 191.890 137.310 L 184.000 119.140 L 176.160 137.310 C 175.287 139.343 173.365 140.731 171.160 140.920 L 151.330 142.450 L 166.270 154.780 C 168.048 156.250 168.826 158.610 168.270 160.850 L 163.640 179.590 L 181.000 169.370 C 182.877 168.267 185.203 168.267 187.080 169.370 L 204.450 179.590 L 199.820 160.850 C 199.264 158.610 200.042 156.250 201.820 154.780 Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
