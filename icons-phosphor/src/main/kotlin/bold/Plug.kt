package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorBoldIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.490 63.510 C 238.238 61.251 235.180 59.981 231.990 59.981 C 228.800 59.981 225.742 61.251 223.490 63.510 L 192.000 95.000 L 161.000 64.000 L 192.520 32.490 C 197.214 27.796 197.214 20.184 192.520 15.490 C 187.826 10.796 180.214 10.796 175.520 15.490 L 144.000 47.000 L 120.490 23.510 C 115.796 18.816 108.184 18.816 103.490 23.510 C 98.796 28.204 98.796 35.816 103.490 40.510 L 107.000 44.000 L 56.890 94.140 C 48.637 102.392 44.000 113.584 44.000 125.255 C 44.000 136.926 48.637 148.118 56.890 156.370 L 69.770 169.250 L 23.510 215.510 C 18.816 220.204 18.816 227.816 23.510 232.510 C 28.204 237.204 35.816 237.204 40.510 232.510 L 86.770 186.250 L 99.650 199.130 C 107.902 207.383 119.094 212.020 130.765 212.020 C 142.436 212.020 153.628 207.383 161.880 199.130 L 212.000 149.000 L 215.510 152.520 C 220.204 157.214 227.816 157.214 232.510 152.520 C 237.204 147.826 237.204 140.214 232.510 135.520 L 209.000 112.000 L 240.520 80.490 C 242.769 78.235 244.030 75.179 244.024 71.994 C 244.019 68.809 242.747 65.757 240.490 63.510 ZM 144.890 182.140 C 141.139 185.892 136.051 188.001 130.745 188.001 C 125.439 188.001 120.351 185.892 116.600 182.140 L 73.860 139.400 C 70.108 135.649 67.999 130.561 67.999 125.255 C 67.999 119.949 70.108 114.861 73.860 111.110 L 124.000 61.000 L 195.000 132.000 Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
