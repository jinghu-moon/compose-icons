package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorBoldIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 116.000 140.000 C 109.373 140.000 104.000 134.627 104.000 128.000 C 104.000 121.373 109.373 116.000 116.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 ZM 116.000 76.000 L 216.000 76.000 C 222.627 76.000 228.000 70.627 228.000 64.000 C 228.000 57.373 222.627 52.000 216.000 52.000 L 116.000 52.000 C 109.373 52.000 104.000 57.373 104.000 64.000 C 104.000 70.627 109.373 76.000 116.000 76.000 ZM 216.000 180.000 L 116.000 180.000 C 109.373 180.000 104.000 185.373 104.000 192.000 C 104.000 198.627 109.373 204.000 116.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 C 228.000 185.373 222.627 180.000 216.000 180.000 ZM 44.000 59.310 L 44.000 104.000 C 44.000 110.627 49.373 116.000 56.000 116.000 C 62.627 116.000 68.000 110.627 68.000 104.000 L 68.000 40.000 C 67.998 35.844 65.845 31.984 62.309 29.799 C 58.774 27.614 54.359 27.413 50.640 29.270 L 34.640 37.270 C 29.150 40.196 26.806 46.833 29.242 52.558 C 31.678 58.283 38.084 61.197 44.000 59.270 ZM 83.730 156.170 C 82.691 148.693 78.646 141.965 72.530 137.540 C 59.993 128.440 42.510 130.849 32.900 143.000 C 31.125 145.281 29.718 147.825 28.730 150.540 C 26.562 156.740 29.780 163.530 35.952 165.777 C 42.123 168.024 48.955 164.892 51.280 158.750 C 51.424 158.390 51.619 158.053 51.860 157.750 C 53.469 155.801 56.317 155.442 58.360 156.930 C 59.235 157.535 59.819 158.477 59.970 159.530 C 60.106 160.520 59.827 161.522 59.200 162.300 L 59.070 162.470 L 30.390 200.820 C 27.674 204.458 27.243 209.317 29.276 213.376 C 31.310 217.434 35.460 219.998 40.000 220.000 L 72.000 220.000 C 78.627 220.000 84.000 214.627 84.000 208.000 C 84.000 201.373 78.627 196.000 72.000 196.000 L 64.000 196.000 L 78.280 176.890 C 82.825 171.005 84.791 163.530 83.730 156.170 Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
