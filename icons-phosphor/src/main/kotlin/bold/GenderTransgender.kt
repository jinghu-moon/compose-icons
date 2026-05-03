package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorBoldIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 28.000 L 172.000 28.000 C 165.373 28.000 160.000 33.373 160.000 40.000 C 160.000 46.627 165.373 52.000 172.000 52.000 L 187.000 52.000 L 168.000 71.000 L 152.490 55.520 C 147.796 50.826 140.184 50.826 135.490 55.520 C 130.796 60.214 130.796 67.826 135.490 72.520 L 151.000 88.000 L 140.580 98.460 C 108.473 75.219 63.897 80.555 38.182 110.716 C 12.467 140.878 14.250 185.737 42.276 213.764 C 70.303 241.790 115.162 243.573 145.324 217.858 C 175.485 192.143 180.821 147.567 157.580 115.460 L 168.000 105.000 L 183.510 120.520 C 188.204 125.214 195.816 125.214 200.510 120.520 C 205.204 115.826 205.204 108.214 200.510 103.520 L 185.000 88.000 L 204.000 69.000 L 204.000 84.000 C 204.000 90.627 209.373 96.000 216.000 96.000 C 222.627 96.000 228.000 90.627 228.000 84.000 L 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 ZM 132.770 196.800 C 115.230 214.340 87.744 217.050 67.117 203.272 C 46.490 189.494 38.467 163.066 47.952 140.146 C 57.438 117.226 81.791 104.197 106.122 109.026 C 130.452 113.854 147.985 135.195 148.000 160.000 C 148.003 173.801 142.525 187.037 132.770 196.800 Z"),
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
