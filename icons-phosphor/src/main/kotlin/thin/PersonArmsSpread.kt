package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorThinIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 68.000 C 143.464 68.000 156.000 55.464 156.000 40.000 C 156.000 24.536 143.464 12.000 128.000 12.000 C 112.536 12.000 100.000 24.536 100.000 40.000 C 100.000 55.464 112.536 68.000 128.000 68.000 ZM 128.000 20.000 C 139.046 20.000 148.000 28.954 148.000 40.000 C 148.000 51.046 139.046 60.000 128.000 60.000 C 116.954 60.000 108.000 51.046 108.000 40.000 C 108.000 28.954 116.954 20.000 128.000 20.000 ZM 227.600 88.570 C 226.096 81.176 219.545 75.897 212.000 76.000 L 44.000 76.000 C 36.493 76.010 30.003 81.237 28.393 88.569 C 26.783 95.901 30.488 103.367 37.300 106.520 L 37.360 106.520 L 91.250 130.250 L 69.330 213.550 C 65.851 221.509 69.357 230.790 77.230 234.460 C 79.345 235.468 81.657 235.994 84.000 236.000 C 90.150 235.999 95.756 232.474 98.420 226.930 L 128.000 176.000 L 157.580 227.000 C 161.406 234.783 170.735 238.101 178.616 234.481 C 186.497 230.862 190.060 221.624 186.650 213.650 L 164.730 130.350 L 218.730 106.590 C 225.648 103.511 229.379 95.930 227.600 88.570 ZM 215.390 99.230 L 158.390 124.340 C 156.588 125.131 155.629 127.116 156.130 129.020 L 179.000 215.940 C 179.061 216.170 179.141 216.394 179.240 216.610 C 181.106 220.614 179.374 225.373 175.370 227.240 C 171.366 229.106 166.607 227.374 164.740 223.370 C 164.693 223.264 164.639 223.160 164.580 223.060 L 131.460 166.000 C 130.744 164.766 129.426 164.007 128.000 164.007 C 126.574 164.007 125.256 164.766 124.540 166.000 L 91.420 223.060 C 91.361 223.160 91.307 223.264 91.260 223.370 C 90.078 226.002 87.571 227.794 84.698 228.060 C 81.824 228.325 79.031 227.023 77.387 224.652 C 75.743 222.280 75.504 219.207 76.760 216.610 C 76.859 216.394 76.939 216.170 77.000 215.940 L 99.870 129.000 C 100.371 127.096 99.412 125.111 97.610 124.320 L 40.610 99.230 C 37.234 97.631 35.414 93.908 36.225 90.262 C 37.037 86.615 40.264 84.016 44.000 84.000 L 212.000 84.000 C 215.739 84.007 218.975 86.603 219.792 90.252 C 220.609 93.901 218.789 97.629 215.410 99.230 Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
