package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorBoldIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 144.000 C 252.000 150.627 246.627 156.000 240.000 156.000 L 192.000 156.000 C 187.455 156.000 183.300 153.432 181.267 149.367 C 179.234 145.301 179.673 140.436 182.400 136.800 L 225.570 79.250 C 228.409 75.477 228.771 70.389 226.496 66.252 C 224.220 62.114 219.730 59.696 215.023 60.073 C 210.316 60.450 206.268 63.553 204.680 68.000 C 202.471 74.249 195.614 77.524 189.365 75.315 C 183.116 73.106 179.841 66.249 182.050 60.000 C 183.283 56.535 185.036 53.277 187.250 50.340 C 199.267 34.626 221.713 31.553 237.512 43.458 C 253.311 55.364 256.543 77.787 244.750 93.670 L 216.000 132.000 L 240.000 132.000 C 246.627 132.000 252.000 137.373 252.000 144.000 ZM 151.860 70.940 C 149.456 68.854 146.322 67.808 143.146 68.033 C 139.971 68.258 137.016 69.735 134.930 72.140 L 92.000 121.680 L 49.070 72.140 C 44.729 67.131 37.149 66.589 32.140 70.930 C 27.131 75.271 26.589 82.851 30.930 87.860 L 76.120 140.000 L 30.930 192.140 C 26.589 197.149 27.131 204.729 32.140 209.070 C 37.149 213.411 44.729 212.869 49.070 207.860 L 92.000 158.320 L 134.930 207.860 C 139.271 212.869 146.851 213.411 151.860 209.070 C 156.869 204.729 157.411 197.149 153.070 192.140 L 107.880 140.000 L 153.070 87.860 C 157.405 82.853 156.864 75.280 151.860 70.940 Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
