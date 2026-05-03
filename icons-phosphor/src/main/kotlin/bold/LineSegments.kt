package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorBoldIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.470 30.530 C 234.718 23.776 225.560 19.982 216.010 19.982 C 206.460 19.982 197.302 23.776 190.550 30.530 L 190.550 30.530 C 176.994 44.125 176.467 65.956 189.350 80.190 L 165.520 124.450 C 158.371 123.345 151.054 124.414 144.520 127.520 L 128.520 111.520 C 136.111 95.695 131.183 76.703 116.856 66.564 C 102.528 56.426 82.979 58.097 70.580 70.520 L 70.580 70.520 C 56.994 84.102 56.466 105.958 69.380 120.180 L 45.500 164.450 C 34.147 162.676 22.629 166.429 14.500 174.550 L 14.500 174.550 C 0.604 188.450 0.426 210.926 14.099 225.046 C 27.771 239.165 50.242 239.708 64.581 226.266 C 78.920 212.824 79.828 190.365 66.620 175.810 L 90.450 131.550 C 92.285 131.846 94.141 131.997 96.000 132.000 C 101.366 132.002 106.665 130.806 111.510 128.500 L 127.510 144.500 C 119.714 160.821 125.238 180.392 140.417 190.228 C 155.595 200.064 175.716 197.111 187.428 183.328 C 199.140 169.545 198.807 149.212 186.650 135.820 L 210.500 91.550 C 212.319 91.839 214.158 91.990 216.000 92.000 C 230.559 91.999 243.684 83.230 249.257 69.780 C 254.829 56.330 251.752 40.847 241.460 30.550 ZM 87.470 87.530 C 92.164 82.836 99.776 82.836 104.470 87.530 C 109.164 92.224 109.164 99.836 104.470 104.530 L 104.470 104.530 C 99.776 109.224 92.164 109.224 87.470 104.530 C 82.776 99.836 82.776 92.224 87.470 87.530 ZM 48.470 208.530 C 43.779 213.204 36.189 213.196 31.509 208.510 C 26.830 203.825 26.830 196.235 31.509 191.550 C 36.189 186.864 43.779 186.856 48.470 191.530 C 53.156 196.216 53.156 203.814 48.470 208.500 ZM 168.470 168.530 C 163.779 173.204 156.189 173.196 151.509 168.510 C 146.830 163.825 146.830 156.235 151.509 151.550 C 156.189 146.864 163.779 146.856 168.470 151.530 C 173.155 156.210 173.164 163.799 168.490 168.490 ZM 224.470 64.530 C 219.779 69.204 212.189 69.196 207.509 64.510 C 202.830 59.825 202.830 52.235 207.509 47.550 C 212.189 42.864 219.779 42.856 224.470 47.530 C 229.151 52.206 229.164 59.788 224.500 64.480 Z"),
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
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
