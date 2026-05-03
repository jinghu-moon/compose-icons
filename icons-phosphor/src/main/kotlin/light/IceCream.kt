package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorLightIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 98.830 L 206.000 96.000 C 206.000 52.922 171.078 18.000 128.000 18.000 C 84.922 18.000 50.000 52.922 50.000 96.000 L 50.000 98.830 C 39.429 101.819 32.683 112.148 34.195 123.029 C 35.708 133.909 45.015 142.007 56.000 142.000 L 60.450 142.000 L 115.840 239.000 C 118.331 243.367 122.973 246.062 128.000 246.062 C 133.027 246.062 137.669 243.367 140.160 239.000 L 195.550 142.000 L 200.000 142.000 C 210.985 142.007 220.292 133.909 221.805 123.029 C 223.317 112.148 216.571 101.819 206.000 98.830 ZM 129.740 233.000 C 129.385 233.627 128.720 234.014 128.000 234.014 C 127.280 234.014 126.615 233.627 126.260 233.000 L 74.260 142.000 L 98.260 142.000 L 140.000 215.060 ZM 136.000 142.000 L 158.890 182.060 L 146.890 202.970 L 112.050 141.970 ZM 165.800 170.000 L 149.800 142.000 L 181.800 142.000 ZM 200.000 130.000 L 56.000 130.000 C 50.477 130.000 46.000 125.523 46.000 120.000 C 46.000 114.477 50.477 110.000 56.000 110.000 C 59.314 110.000 62.000 107.314 62.000 104.000 L 62.000 96.000 C 62.000 59.549 91.549 30.000 128.000 30.000 C 164.451 30.000 194.000 59.549 194.000 96.000 L 194.000 104.000 C 194.000 107.314 196.686 110.000 200.000 110.000 C 205.523 110.000 210.000 114.477 210.000 120.000 C 210.000 125.523 205.523 130.000 200.000 130.000 Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
