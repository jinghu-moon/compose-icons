package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorBoldIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 215.110 40.890 C 197.928 23.711 170.072 23.711 152.890 40.890 L 128.890 64.890 C 127.131 66.639 125.963 68.894 125.550 71.340 C 118.400 113.000 55.310 183.700 31.550 207.480 L 31.550 207.480 C 26.856 212.174 26.856 219.786 31.550 224.480 C 36.244 229.174 43.856 229.174 48.550 224.480 L 48.550 224.480 C 72.300 200.750 143.040 137.600 184.730 130.480 C 187.173 130.060 189.427 128.893 191.180 127.140 L 215.180 103.140 C 232.359 85.958 232.359 58.102 215.180 40.920 ZM 198.110 86.140 L 176.690 107.570 C 161.840 110.880 144.290 118.980 124.220 131.750 C 136.990 111.680 145.090 94.130 148.400 79.280 L 169.830 57.860 C 174.851 52.661 182.288 50.576 189.280 52.406 C 196.273 54.236 201.734 59.697 203.564 66.690 C 205.394 73.682 203.309 81.119 198.110 86.140 Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
