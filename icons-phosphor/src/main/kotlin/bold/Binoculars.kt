package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorBoldIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.000 150.650 C 241.000 150.650 241.000 150.650 241.000 150.600 C 240.281 148.582 239.436 146.612 238.470 144.700 L 196.930 50.180 C 196.330 48.819 195.482 47.581 194.430 46.530 C 187.678 39.776 178.520 35.982 168.970 35.982 C 159.420 35.982 150.262 39.776 143.510 46.530 C 141.265 48.777 140.003 51.823 140.000 55.000 L 140.000 76.000 L 116.000 76.000 L 116.000 55.000 C 116.000 51.820 114.737 48.770 112.490 46.520 C 105.738 39.766 96.580 35.972 87.030 35.972 C 77.480 35.972 68.322 39.766 61.570 46.520 C 60.518 47.571 59.670 48.809 59.070 50.170 L 17.530 144.700 C 16.564 146.612 15.719 148.582 15.000 150.600 C 15.000 150.600 15.000 150.600 15.000 150.650 C 8.066 170.170 13.379 191.944 28.525 206.077 C 43.671 220.209 65.760 224.003 84.754 215.736 C 103.748 207.468 116.023 188.715 116.000 168.000 L 116.000 100.000 L 140.000 100.000 L 140.000 168.000 C 139.977 188.715 152.252 207.468 171.246 215.736 C 190.240 224.003 212.329 220.209 227.475 206.077 C 242.621 191.944 247.934 170.170 241.000 150.650 ZM 80.000 62.280 C 83.490 59.747 88.071 59.281 92.000 61.060 L 92.000 124.210 C 81.361 117.383 68.595 114.673 56.100 116.590 ZM 64.000 196.000 C 48.536 196.000 36.000 183.464 36.000 168.000 C 36.000 152.536 48.536 140.000 64.000 140.000 C 79.464 140.000 92.000 152.536 92.000 168.000 C 92.000 183.464 79.464 196.000 64.000 196.000 ZM 164.000 61.060 C 167.931 59.293 172.505 59.759 176.000 62.280 L 199.870 116.590 C 187.375 114.673 174.609 117.383 163.970 124.210 ZM 192.000 196.000 C 176.536 196.000 164.000 183.464 164.000 168.000 C 164.000 152.536 176.536 140.000 192.000 140.000 C 207.464 140.000 220.000 152.536 220.000 168.000 C 220.000 183.464 207.464 196.000 192.000 196.000 Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
