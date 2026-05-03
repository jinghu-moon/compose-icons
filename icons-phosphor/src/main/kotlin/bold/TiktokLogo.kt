package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorBoldIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 68.000 C 199.711 67.972 180.028 48.289 180.000 24.000 C 180.000 17.373 174.627 12.000 168.000 12.000 L 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 L 116.000 156.000 C 115.995 163.927 110.186 170.655 102.344 171.817 C 94.502 172.978 86.993 168.223 84.690 160.637 C 82.387 153.052 85.986 144.924 93.150 141.530 C 97.334 139.542 100.001 135.323 100.000 130.690 L 100.000 88.000 C 99.999 84.451 98.426 81.084 95.705 78.805 C 92.984 76.527 89.394 75.569 85.900 76.190 C 67.417 79.571 50.734 89.401 38.820 103.930 C 26.688 118.573 20.033 136.984 20.000 156.000 C 20.000 200.183 55.817 236.000 100.000 236.000 C 144.183 236.000 180.000 200.183 180.000 156.000 L 180.000 122.670 C 193.844 128.849 208.839 132.028 224.000 132.000 C 230.627 132.000 236.000 126.627 236.000 120.000 L 236.000 80.000 C 236.000 73.373 230.627 68.000 224.000 68.000 ZM 212.000 107.150 C 198.638 105.260 185.939 100.142 175.000 92.240 C 171.343 89.613 166.522 89.255 162.517 91.313 C 158.511 93.370 155.995 97.497 156.000 102.000 L 156.000 156.000 C 156.000 186.928 130.928 212.000 100.000 212.000 C 69.072 212.000 44.000 186.928 44.000 156.000 C 44.075 134.150 56.453 114.206 76.000 104.440 L 76.000 124.000 C 60.952 135.286 55.800 155.533 63.625 172.638 C 71.449 189.744 90.135 199.087 108.514 195.083 C 126.894 191.079 140.000 174.810 140.000 156.000 L 140.000 36.000 L 157.060 36.000 C 162.134 63.973 184.027 85.866 212.000 90.940 Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
