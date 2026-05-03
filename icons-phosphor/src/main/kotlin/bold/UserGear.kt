package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorBoldIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.500 156.530 C 172.626 137.562 182.077 105.386 172.042 76.384 C 162.006 47.382 134.690 27.928 104.000 27.928 C 73.310 27.928 45.994 47.382 35.958 76.384 C 25.923 105.386 35.374 137.562 59.500 156.530 C 40.571 164.251 23.845 176.532 10.810 192.280 C 6.546 197.355 7.205 204.926 12.280 209.190 C 17.355 213.454 24.926 212.796 29.190 207.720 C 48.540 184.690 75.110 172.000 104.000 172.000 C 141.000 172.000 165.120 191.420 178.810 207.720 C 183.074 212.796 190.645 213.454 195.720 209.190 C 200.796 204.926 201.454 197.355 197.190 192.280 C 184.155 176.532 167.429 164.251 148.500 156.530 ZM 56.000 100.000 C 56.000 73.490 77.490 52.000 104.000 52.000 C 130.510 52.000 152.000 73.490 152.000 100.000 C 152.000 126.510 130.510 148.000 104.000 148.000 C 77.502 147.972 56.028 126.498 56.000 100.000 ZM 246.530 140.000 L 239.420 142.310 L 243.810 148.360 C 246.417 151.823 246.953 156.423 245.213 160.394 C 243.473 164.364 239.727 167.087 235.414 167.517 C 231.100 167.948 226.890 166.018 224.400 162.470 L 220.000 156.410 L 215.600 162.470 C 213.110 166.018 208.900 167.948 204.586 167.517 C 200.273 167.087 196.527 164.364 194.787 160.394 C 193.047 156.423 193.583 151.823 196.190 148.360 L 200.580 142.310 L 193.470 140.000 C 187.166 137.954 183.714 131.184 185.760 124.880 C 187.806 118.576 194.576 115.124 200.880 117.170 L 208.000 119.480 L 208.000 112.000 C 208.000 105.373 213.373 100.000 220.000 100.000 C 226.627 100.000 232.000 105.373 232.000 112.000 L 232.000 119.480 L 239.120 117.170 C 245.424 115.124 252.194 118.576 254.240 124.880 C 256.286 131.184 252.834 137.954 246.530 140.000 Z"),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
