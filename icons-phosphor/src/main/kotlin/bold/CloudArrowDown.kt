package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorBoldIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.490 167.510 C 194.749 169.762 196.019 172.820 196.019 176.010 C 196.019 179.200 194.749 182.258 192.490 184.510 L 160.490 216.510 C 158.238 218.769 155.180 220.039 151.990 220.039 C 148.800 220.039 145.742 218.769 143.490 216.510 L 111.490 184.510 C 106.796 179.816 106.796 172.204 111.490 167.510 C 116.184 162.816 123.796 162.816 128.490 167.510 L 140.000 179.000 L 140.000 128.000 C 140.000 121.373 145.373 116.000 152.000 116.000 C 158.627 116.000 164.000 121.373 164.000 128.000 L 164.000 179.000 L 175.510 167.480 C 177.765 165.231 180.821 163.970 184.006 163.976 C 187.191 163.981 190.243 165.253 192.490 167.510 ZM 160.000 36.000 C 126.164 36.016 95.062 54.589 79.000 84.370 C 53.986 81.750 29.568 93.151 15.517 114.012 C 1.466 134.872 0.077 161.784 11.906 183.980 C 23.735 206.177 46.849 220.031 72.000 220.000 L 84.000 220.000 C 90.627 220.000 96.000 214.627 96.000 208.000 C 96.000 201.373 90.627 196.000 84.000 196.000 L 72.000 196.000 C 48.158 195.854 28.770 176.744 28.279 152.906 C 27.788 129.068 46.374 109.177 70.190 108.050 C 68.732 114.600 67.998 121.290 68.000 128.000 C 68.000 134.627 73.373 140.000 80.000 140.000 C 86.627 140.000 92.000 134.627 92.000 128.000 C 92.000 90.445 122.445 60.000 160.000 60.000 C 197.555 60.000 228.000 90.445 228.000 128.000 C 228.033 138.626 225.549 149.109 220.750 158.590 C 218.746 162.425 218.961 167.041 221.313 170.673 C 223.666 174.305 227.791 176.388 232.110 176.127 C 236.429 175.865 240.273 173.299 242.170 169.410 C 248.671 156.577 252.040 142.386 252.000 128.000 C 251.945 77.213 210.787 36.055 160.000 36.000 Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
