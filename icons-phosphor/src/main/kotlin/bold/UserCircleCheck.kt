package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorBoldIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.690 100.170 C 217.549 100.696 214.746 102.450 212.899 105.044 C 211.051 107.638 210.311 110.860 210.840 114.000 C 211.612 118.627 212.000 123.309 212.000 128.000 C 212.029 146.848 205.685 165.152 194.000 179.940 C 186.222 170.047 176.308 162.041 165.000 156.520 C 185.119 136.146 184.982 103.340 164.692 83.136 C 144.403 62.931 111.597 62.931 91.308 83.136 C 71.018 103.340 70.881 136.146 91.000 156.520 C 79.692 162.041 69.778 170.047 62.000 179.940 C 42.061 154.674 38.325 120.232 52.382 91.279 C 66.440 62.325 95.814 43.959 128.000 44.000 C 132.691 44.000 137.373 44.388 142.000 45.160 C 148.536 46.265 154.730 41.861 155.835 35.325 C 156.940 28.789 152.536 22.595 146.000 21.490 C 114.657 16.227 82.586 25.024 58.314 45.542 C 34.042 66.059 20.029 96.218 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 236.001 121.969 235.503 115.949 234.510 110.000 C 233.404 103.472 227.220 99.073 220.690 100.170 ZM 100.000 120.000 C 100.000 104.536 112.536 92.000 128.000 92.000 C 143.464 92.000 156.000 104.536 156.000 120.000 C 156.000 135.464 143.464 148.000 128.000 148.000 C 112.536 148.000 100.000 135.464 100.000 120.000 ZM 79.570 196.570 C 90.869 181.121 108.860 171.989 128.000 171.989 C 147.140 171.989 165.131 181.121 176.430 196.570 C 147.421 217.143 108.579 217.143 79.570 196.570 ZM 240.490 48.490 L 208.490 80.490 C 206.238 82.749 203.180 84.019 199.990 84.019 C 196.800 84.019 193.742 82.749 191.490 80.490 L 175.490 64.490 C 170.796 59.796 170.796 52.184 175.490 47.490 C 180.184 42.796 187.796 42.796 192.490 47.490 L 200.000 55.000 L 223.510 31.480 C 228.204 26.786 235.816 26.786 240.510 31.480 C 245.204 36.174 245.204 43.786 240.510 48.480 Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
