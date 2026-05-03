package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorBoldIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 28.000 C 237.373 28.000 232.000 33.373 232.000 40.000 C 231.799 45.483 230.673 50.892 228.670 56.000 C 224.230 66.640 217.430 68.000 212.000 68.000 C 203.190 68.000 197.090 59.500 188.090 45.510 C 178.500 30.580 166.550 12.000 144.000 12.000 C 125.860 12.000 112.000 21.780 104.860 39.540 C 103.271 43.570 102.069 47.742 101.270 52.000 L 88.000 52.000 C 76.954 52.000 68.000 60.954 68.000 72.000 L 68.000 79.180 C 31.030 99.287 12.417 141.916 22.800 182.699 C 33.184 223.482 69.916 252.020 112.000 252.000 L 113.660 252.000 C 155.439 251.278 191.484 222.491 201.427 181.906 C 211.370 141.321 192.713 99.133 156.000 79.180 L 156.000 72.000 C 156.000 60.954 147.046 52.000 136.000 52.000 L 125.930 52.000 C 126.327 50.643 126.795 49.308 127.330 48.000 C 131.770 37.380 138.570 36.000 144.000 36.000 C 152.810 36.000 158.910 44.500 167.910 58.490 C 177.500 73.420 189.450 92.000 212.000 92.000 C 230.140 92.000 244.000 82.220 251.140 64.460 C 254.172 56.652 255.817 48.374 256.000 40.000 C 256.000 33.373 250.627 28.000 244.000 28.000 ZM 139.200 97.650 C 168.712 110.530 185.145 142.345 178.566 173.866 C 171.987 205.388 144.201 227.973 112.000 227.973 C 79.799 227.973 52.013 205.388 45.434 173.866 C 38.855 142.345 55.288 110.530 84.800 97.650 C 89.174 95.741 92.001 91.422 92.000 86.650 L 92.000 76.000 L 111.500 76.000 C 111.670 76.000 111.830 76.000 112.000 76.000 C 112.170 76.000 112.340 76.000 112.510 76.000 L 132.000 76.000 L 132.000 86.660 C 132.003 91.428 134.830 95.743 139.200 97.650 ZM 111.450 201.760 C 109.881 206.764 105.244 210.170 100.000 210.170 C 98.779 210.168 97.566 209.982 96.400 209.620 C 74.690 202.864 59.926 182.737 60.000 160.000 C 60.000 153.373 65.373 148.000 72.000 148.000 C 78.627 148.000 84.000 153.373 84.000 160.000 C 83.960 172.243 91.910 183.081 103.600 186.720 C 109.919 188.707 113.433 195.439 111.450 201.760 Z"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
