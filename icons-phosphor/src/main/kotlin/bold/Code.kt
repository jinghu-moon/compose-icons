package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorBoldIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 71.680 97.220 L 34.740 128.000 L 71.680 158.780 C 75.014 161.512 76.626 165.822 75.904 170.071 C 75.182 174.320 72.237 177.856 68.189 179.334 C 64.140 180.812 59.609 180.005 56.320 177.220 L 8.320 137.220 C 5.583 134.940 4.001 131.562 4.001 128.000 C 4.001 124.438 5.583 121.060 8.320 118.780 L 56.320 78.780 C 61.417 74.603 68.929 75.318 73.147 80.381 C 77.364 85.445 76.710 92.962 71.680 97.220 ZM 247.680 118.780 L 199.680 78.780 C 196.391 75.995 191.860 75.188 187.811 76.666 C 183.763 78.144 180.818 81.680 180.096 85.929 C 179.374 90.178 180.986 94.488 184.320 97.220 L 221.260 128.000 L 184.320 158.780 C 180.986 161.512 179.374 165.822 180.096 170.071 C 180.818 174.320 183.763 177.856 187.811 179.334 C 191.860 180.812 196.391 180.005 199.680 177.220 L 247.680 137.220 C 250.417 134.940 251.999 131.562 251.999 128.000 C 251.999 124.438 250.417 121.060 247.680 118.780 ZM 164.100 28.720 C 161.108 27.632 157.807 27.777 154.923 29.124 C 152.038 30.471 149.807 32.908 148.720 35.900 L 84.720 211.900 C 82.461 218.127 85.675 225.006 91.900 227.270 C 93.213 227.755 94.601 228.002 96.000 228.000 C 101.047 228.001 105.556 224.843 107.280 220.100 L 171.280 44.100 C 172.368 41.108 172.223 37.807 170.876 34.923 C 169.529 32.038 167.092 29.807 164.100 28.720 Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
