package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorFillIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 170.490 91.590 C 188.523 112.727 188.331 143.889 170.040 164.802 C 151.749 185.716 120.890 190.057 97.540 175.000 ZM 128.000 72.000 C 106.149 72.023 86.307 84.753 77.178 104.606 C 68.050 124.459 71.303 147.808 85.510 164.410 L 158.510 81.040 C 149.436 75.122 138.833 71.981 128.000 72.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.408 24.072 231.928 70.592 232.000 128.000 ZM 200.000 128.000 C 200.015 110.020 193.273 92.691 181.110 79.450 L 186.000 73.270 C 188.091 71.158 188.838 68.061 187.941 65.227 C 187.044 62.394 184.650 60.291 181.725 59.767 C 178.800 59.243 175.825 60.384 174.000 62.730 L 169.090 68.910 C 138.991 48.173 98.130 53.278 74.059 80.784 C 49.988 108.289 50.345 149.466 74.890 176.550 L 70.000 182.730 C 67.401 186.071 67.855 190.859 71.035 193.653 C 74.216 196.446 79.022 196.278 82.000 193.270 L 86.910 187.090 C 108.908 202.421 137.605 204.249 161.370 191.832 C 185.135 179.415 200.023 154.813 200.000 128.000 Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
