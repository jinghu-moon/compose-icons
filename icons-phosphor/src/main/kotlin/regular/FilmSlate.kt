package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorRegularIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 104.000 L 102.090 104.000 L 210.000 75.510 C 212.063 74.966 213.824 73.621 214.890 71.773 C 215.957 69.926 216.241 67.728 215.680 65.670 L 207.520 35.670 C 205.183 27.271 196.528 22.311 188.100 24.540 L 35.810 64.740 C 31.714 65.803 28.218 68.470 26.110 72.140 C 23.990 75.765 23.431 80.095 24.560 84.140 L 32.000 111.560 C 32.000 111.700 32.000 111.850 32.000 112.000 L 32.000 200.000 C 32.000 208.837 39.163 216.000 48.000 216.000 L 208.000 216.000 C 216.837 216.000 224.000 208.837 224.000 200.000 L 224.000 112.000 C 224.000 107.582 220.418 104.000 216.000 104.000 ZM 192.160 40.000 L 198.160 62.070 L 175.540 68.070 L 147.420 51.830 ZM 125.470 57.600 L 153.590 73.840 L 116.650 83.590 L 88.530 67.370 ZM 46.070 102.220 L 40.070 80.140 L 66.570 73.140 L 94.690 89.400 ZM 208.000 200.000 L 48.000 200.000 L 48.000 120.000 L 208.000 120.000 L 208.000 200.000 Z"),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
