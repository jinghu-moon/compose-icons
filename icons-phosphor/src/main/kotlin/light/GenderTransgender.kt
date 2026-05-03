package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorLightIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 34.000 L 168.000 34.000 C 164.686 34.000 162.000 36.686 162.000 40.000 C 162.000 43.314 164.686 46.000 168.000 46.000 L 201.520 46.000 L 168.000 79.520 L 148.240 59.760 C 146.728 58.225 144.508 57.618 142.425 58.172 C 140.342 58.725 138.716 60.353 138.165 62.437 C 137.614 64.520 138.223 66.739 139.760 68.250 L 159.520 88.000 L 141.060 106.460 C 112.384 82.359 69.810 85.131 44.501 112.746 C 19.191 140.361 20.132 183.014 46.635 209.486 C 73.138 235.958 115.793 236.849 143.378 211.507 C 170.963 186.164 173.685 143.588 149.550 114.940 L 168.000 96.500 L 187.760 116.260 C 190.110 118.569 193.882 118.552 196.211 116.221 C 198.539 113.890 198.552 110.117 196.240 107.770 L 176.480 88.000 L 210.000 54.490 L 210.000 88.000 C 210.000 91.314 212.686 94.000 216.000 94.000 C 219.314 94.000 222.000 91.314 222.000 88.000 L 222.000 40.000 C 222.000 36.686 219.314 34.000 216.000 34.000 ZM 137.000 201.000 C 117.428 220.561 86.764 223.571 63.761 208.190 C 40.759 192.810 31.825 163.322 42.423 137.761 C 53.021 112.200 80.200 97.686 107.337 103.094 C 134.475 108.503 154.012 132.329 154.000 160.000 C 153.994 175.380 147.879 190.128 137.000 201.000 Z"),
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
