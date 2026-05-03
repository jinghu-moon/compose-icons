package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorBoldIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 198.650 L 236.000 240.000 C 236.000 246.627 230.627 252.000 224.000 252.000 C 217.373 252.000 212.000 246.627 212.000 240.000 L 212.000 198.650 C 211.970 182.368 206.318 166.595 196.000 154.000 L 196.000 202.270 C 195.972 207.551 192.495 212.194 187.434 213.705 C 182.373 215.217 176.919 213.241 174.000 208.840 L 163.330 192.540 C 163.200 192.350 163.080 192.160 162.970 191.960 C 160.824 188.094 155.951 186.699 152.085 188.845 C 148.219 190.991 146.824 195.864 148.970 199.730 L 170.970 233.390 C 173.396 236.977 173.702 241.594 171.769 245.469 C 169.836 249.345 165.964 251.878 161.639 252.098 C 157.314 252.317 153.206 250.190 150.890 246.530 L 128.630 212.530 C 128.510 212.340 128.390 212.150 128.280 211.950 C 121.092 199.409 123.204 183.605 133.434 173.392 C 143.664 163.179 159.470 161.092 172.000 168.300 L 172.000 68.000 L 164.000 68.000 C 157.373 68.000 152.000 62.627 152.000 56.000 C 152.000 49.373 157.373 44.000 164.000 44.000 L 176.000 44.000 C 187.046 44.000 196.000 52.954 196.000 64.000 L 196.000 121.520 C 221.010 139.259 235.908 167.988 236.000 198.650 ZM 88.000 56.000 C 88.000 49.373 82.627 44.000 76.000 44.000 L 64.000 44.000 C 52.954 44.000 44.000 52.954 44.000 64.000 L 44.000 200.000 C 44.000 206.627 49.373 212.000 56.000 212.000 C 62.627 212.000 68.000 206.627 68.000 200.000 L 68.000 68.000 L 76.000 68.000 C 82.627 68.000 88.000 62.627 88.000 56.000 ZM 156.490 116.480 C 161.184 111.786 161.184 104.174 156.490 99.480 C 151.796 94.786 144.184 94.786 139.490 99.480 L 132.000 107.000 L 132.000 16.000 C 132.000 9.373 126.627 4.000 120.000 4.000 C 113.373 4.000 108.000 9.373 108.000 16.000 L 108.000 107.000 L 100.490 99.480 C 95.796 94.786 88.184 94.786 83.490 99.480 C 78.796 104.174 78.796 111.786 83.490 116.480 L 111.490 144.480 C 113.742 146.739 116.800 148.009 119.990 148.009 C 123.180 148.009 126.238 146.739 128.490 144.480 Z"),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
