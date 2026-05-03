package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorBoldIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 84.000 C 147.882 84.000 164.000 67.882 164.000 48.000 C 164.000 28.118 147.882 12.000 128.000 12.000 C 108.118 12.000 92.000 28.118 92.000 48.000 C 92.000 67.882 108.118 84.000 128.000 84.000 ZM 128.000 36.000 C 134.627 36.000 140.000 41.373 140.000 48.000 C 140.000 54.627 134.627 60.000 128.000 60.000 C 121.373 60.000 116.000 54.627 116.000 48.000 C 116.000 41.373 121.373 36.000 128.000 36.000 ZM 234.290 138.170 C 232.653 140.901 229.998 142.870 226.909 143.643 C 223.820 144.416 220.550 143.929 217.820 142.290 C 217.500 142.100 185.450 123.370 140.000 120.410 L 140.000 147.410 L 201.000 216.000 C 205.418 220.971 204.971 228.582 200.000 233.000 C 195.029 237.418 187.418 236.971 183.000 232.000 L 128.000 170.090 L 73.000 232.000 C 68.582 236.971 60.971 237.418 56.000 233.000 C 51.029 228.582 50.582 220.971 55.000 216.000 L 116.000 147.410 L 116.000 120.410 C 70.280 123.360 38.520 142.090 38.180 142.300 C 32.497 145.710 25.125 143.868 21.715 138.185 C 18.305 132.502 20.147 125.130 25.830 121.720 C 27.580 120.660 69.350 96.000 128.000 96.000 C 186.650 96.000 228.420 120.660 230.170 121.710 C 235.852 125.118 237.696 132.487 234.290 138.170 Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
