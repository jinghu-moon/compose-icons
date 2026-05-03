package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorThinIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 168.000 36.000 C 165.791 36.000 164.000 37.791 164.000 40.000 C 164.000 42.209 165.791 44.000 168.000 44.000 L 206.340 44.000 L 168.000 82.350 L 146.830 61.180 C 145.830 60.125 144.336 59.696 142.929 60.059 C 141.521 60.422 140.422 61.520 140.056 62.927 C 139.691 64.334 140.117 65.828 141.170 66.830 L 162.340 88.000 L 141.170 109.180 C 113.640 84.662 71.605 86.477 46.290 113.276 C 20.976 140.074 21.556 182.144 47.600 208.235 C 73.644 234.325 115.713 234.980 142.557 209.712 C 169.400 184.445 171.289 142.413 146.820 114.840 L 168.000 93.670 L 189.170 114.840 C 190.733 116.403 193.267 116.403 194.830 114.840 C 196.393 113.277 196.393 110.743 194.830 109.180 L 173.660 88.000 L 212.000 49.660 L 212.000 88.000 C 212.000 90.209 213.791 92.000 216.000 92.000 C 218.209 92.000 220.000 90.209 220.000 88.000 L 220.000 40.000 C 220.000 37.791 218.209 36.000 216.000 36.000 ZM 138.430 202.450 C 118.193 222.691 86.476 225.819 62.675 209.921 C 38.873 194.024 29.615 163.528 40.561 137.081 C 51.507 110.634 79.610 95.602 107.684 101.176 C 135.759 106.750 155.987 131.378 156.000 160.000 C 156.000 175.919 149.680 191.187 138.430 202.450 Z"),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
