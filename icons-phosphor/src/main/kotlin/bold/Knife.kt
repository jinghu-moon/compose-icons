package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorBoldIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.700 29.300 C 222.271 16.879 202.129 16.879 189.700 29.300 L 15.520 203.560 C 12.429 206.643 11.256 211.162 12.458 215.359 C 13.659 219.556 17.046 222.770 21.300 223.750 C 33.472 226.569 45.926 227.995 58.420 228.000 C 92.130 228.000 125.830 217.580 157.520 197.130 C 189.840 176.270 208.680 152.430 209.460 151.430 C 213.194 146.643 212.765 139.821 208.460 135.540 L 191.000 118.000 L 234.700 74.290 C 247.098 61.856 247.098 41.734 234.700 29.300 ZM 143.870 177.360 C 113.000 197.120 81.280 206.000 49.280 203.740 L 146.000 107.000 L 165.500 126.510 L 165.500 126.510 L 165.500 126.510 L 183.500 144.510 C 171.642 156.996 158.338 168.023 143.870 177.360 ZM 217.730 57.360 L 174.000 101.000 L 163.000 90.000 L 206.700 46.280 C 209.794 43.618 214.417 43.791 217.303 46.677 C 220.189 49.563 220.362 54.186 217.700 57.280 Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
