package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorFillIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 80.000 L 240.000 200.000 C 240.000 204.418 236.418 208.000 232.000 208.000 L 160.000 208.000 C 146.769 208.000 136.033 218.709 136.000 231.940 C 136.066 235.287 134.014 238.312 130.880 239.490 C 128.415 240.441 125.640 240.114 123.464 238.616 C 121.287 237.118 119.991 234.642 120.000 232.000 C 120.000 218.745 109.255 208.000 96.000 208.000 L 24.000 208.000 C 19.582 208.000 16.000 204.418 16.000 200.000 L 16.000 80.000 C 16.000 75.582 19.582 72.000 24.000 72.000 L 88.000 72.000 C 105.673 72.000 120.000 86.327 120.000 104.000 L 120.000 167.730 C 119.942 172.013 123.202 175.613 127.470 175.980 C 129.682 176.127 131.856 175.349 133.473 173.833 C 135.090 172.316 136.005 170.197 136.000 167.980 L 136.000 104.000 C 136.000 86.327 150.327 72.000 168.000 72.000 L 232.000 72.000 C 236.418 72.000 240.000 75.582 240.000 80.000 ZM 88.810 56.000 L 89.000 56.000 C 102.962 56.277 116.109 62.632 125.000 73.400 C 125.760 74.289 126.871 74.800 128.040 74.800 C 129.209 74.800 130.320 74.289 131.080 73.400 C 139.953 62.652 153.066 56.300 167.000 56.000 L 167.190 56.000 C 168.584 55.996 169.876 55.266 170.599 54.073 C 171.322 52.881 171.371 51.398 170.730 50.160 C 162.521 34.119 146.020 24.027 128.000 24.027 C 109.980 24.027 93.479 34.119 85.270 50.160 C 84.629 51.398 84.678 52.881 85.401 54.073 C 86.124 55.266 87.416 55.996 88.810 56.000 Z"),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
