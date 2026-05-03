package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorBoldIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 140.000 C 113.373 140.000 108.000 134.627 108.000 128.000 L 108.000 45.000 L 100.490 52.510 C 95.796 57.204 88.184 57.204 83.490 52.510 C 78.796 47.816 78.796 40.204 83.490 35.510 L 111.490 7.510 C 113.742 5.251 116.800 3.981 119.990 3.981 C 123.180 3.981 126.238 5.251 128.490 7.510 L 156.490 35.510 C 161.184 40.204 161.184 47.816 156.490 52.510 C 151.796 57.204 144.184 57.204 139.490 52.510 L 132.000 45.000 L 132.000 128.000 C 132.000 134.627 126.627 140.000 120.000 140.000 ZM 196.000 121.520 L 196.000 96.000 C 196.000 84.954 187.046 76.000 176.000 76.000 L 164.000 76.000 C 157.373 76.000 152.000 81.373 152.000 88.000 C 152.000 94.627 157.373 100.000 164.000 100.000 L 172.000 100.000 L 172.000 168.300 C 159.460 161.069 143.627 163.157 133.390 173.392 C 123.154 183.626 121.062 199.458 128.290 212.000 C 128.400 212.200 128.520 212.390 128.640 212.580 L 150.900 246.580 C 154.531 252.130 161.975 253.686 167.525 250.055 C 173.075 246.424 174.631 238.980 171.000 233.430 L 149.000 199.770 C 146.854 195.904 148.249 191.031 152.115 188.885 C 155.981 186.739 160.854 188.134 163.000 192.000 C 163.110 192.200 163.230 192.390 163.360 192.580 L 174.000 208.880 C 176.919 213.281 182.373 215.257 187.434 213.745 C 192.495 212.234 195.972 207.591 196.000 202.310 L 196.000 154.000 C 206.310 166.585 211.961 182.341 212.000 198.610 L 212.000 240.000 C 212.000 246.627 217.373 252.000 224.000 252.000 C 230.627 252.000 236.000 246.627 236.000 240.000 L 236.000 198.650 C 235.908 167.988 221.010 139.259 196.000 121.520 ZM 76.000 76.000 L 64.000 76.000 C 52.954 76.000 44.000 84.954 44.000 96.000 L 44.000 200.000 C 44.000 206.627 49.373 212.000 56.000 212.000 C 62.627 212.000 68.000 206.627 68.000 200.000 L 68.000 100.000 L 76.000 100.000 C 82.627 100.000 88.000 94.627 88.000 88.000 C 88.000 81.373 82.627 76.000 76.000 76.000 Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
