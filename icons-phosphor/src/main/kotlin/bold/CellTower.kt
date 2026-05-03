package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorBoldIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 138.670 86.510 C 136.613 82.513 132.495 80.001 128.000 80.001 C 123.505 80.001 119.387 82.513 117.330 86.510 L 45.330 226.510 C 42.292 232.403 44.607 239.642 50.500 242.680 C 56.393 245.718 63.632 243.403 66.670 237.510 L 77.670 216.020 L 178.280 216.020 L 189.330 237.510 C 192.368 243.403 199.607 245.718 205.500 242.680 C 211.393 239.642 213.708 232.403 210.670 226.510 ZM 128.000 118.240 L 145.360 152.000 L 110.640 152.000 ZM 90.070 192.000 L 98.290 176.000 L 157.710 176.000 L 165.930 192.000 ZM 174.510 68.730 C 176.555 72.576 176.355 77.229 173.988 80.885 C 171.620 84.542 167.457 86.629 163.111 86.337 C 158.764 86.045 154.917 83.420 153.060 79.480 C 148.276 69.885 138.433 63.863 127.712 63.974 C 116.991 64.085 107.274 70.308 102.690 80.000 C 99.846 85.990 92.685 88.539 86.695 85.695 C 80.705 82.851 78.156 75.690 81.000 69.700 C 89.668 51.600 107.931 40.059 128.000 40.000 C 147.710 39.936 165.745 51.076 174.510 68.730 ZM 49.930 144.730 C 25.893 106.176 33.599 55.848 68.071 26.253 C 102.543 -3.342 153.457 -3.342 187.929 26.253 C 222.401 55.848 230.107 106.176 206.070 144.730 C 202.555 150.352 195.147 152.060 189.525 148.545 C 183.903 145.030 182.195 137.622 185.710 132.000 C 203.470 103.503 197.770 66.309 172.292 44.438 C 146.814 22.566 109.186 22.566 83.708 44.438 C 58.230 66.309 52.530 103.503 70.290 132.000 C 73.655 137.613 71.901 144.888 66.349 148.351 C 60.796 151.815 53.491 150.191 49.930 144.700 Z"),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
