package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorBoldIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 212.000 L 89.450 212.000 L 199.630 121.260 C 203.016 118.558 204.683 114.241 203.991 109.964 C 203.300 105.688 200.357 102.116 196.291 100.619 C 192.226 99.122 187.670 99.933 184.370 102.740 L 166.590 117.380 C 161.180 114.582 155.479 112.386 149.590 110.830 C 169.432 100.814 179.803 78.485 174.655 56.862 C 169.507 35.240 150.187 19.980 127.960 19.980 C 105.733 19.980 86.413 35.240 81.265 56.862 C 76.117 78.485 86.488 100.814 106.330 110.830 C 79.064 118.086 57.271 138.560 48.330 165.320 C 46.226 171.605 49.615 178.406 55.900 180.510 C 62.185 182.614 68.986 179.225 71.090 172.940 C 81.449 142.080 114.509 125.093 145.630 134.640 L 48.370 214.740 C 44.463 217.961 42.997 223.287 44.708 228.054 C 46.418 232.820 50.936 235.999 56.000 236.000 L 200.000 236.000 C 206.627 236.000 212.000 230.627 212.000 224.000 C 212.000 217.373 206.627 212.000 200.000 212.000 ZM 128.000 44.000 C 141.255 44.000 152.000 54.745 152.000 68.000 C 152.000 81.255 141.255 92.000 128.000 92.000 C 114.745 92.000 104.000 81.255 104.000 68.000 C 104.000 54.745 114.745 44.000 128.000 44.000 ZM 204.610 157.510 C 208.207 165.488 210.529 173.982 211.490 182.680 C 212.219 189.269 207.469 195.201 200.880 195.930 C 194.291 196.659 188.359 191.909 187.630 185.320 C 186.954 179.116 185.300 173.057 182.730 167.370 C 180.078 161.342 182.780 154.303 188.784 151.597 C 194.788 148.892 201.851 151.530 204.610 157.510 Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
