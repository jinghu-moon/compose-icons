package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorBoldIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 157.270 21.220 C 153.152 19.207 148.247 19.715 144.630 22.530 L 75.880 76.000 L 32.000 76.000 C 20.954 76.000 12.000 84.954 12.000 96.000 L 12.000 160.000 C 12.000 171.046 20.954 180.000 32.000 180.000 L 75.880 180.000 L 144.630 233.470 C 148.247 236.285 153.153 236.794 157.271 234.780 C 161.389 232.767 164.000 228.584 164.000 224.000 L 164.000 32.000 C 164.000 27.416 161.388 23.233 157.270 21.220 ZM 36.000 100.000 L 68.000 100.000 L 68.000 156.000 L 36.000 156.000 ZM 140.000 199.460 L 92.000 162.130 L 92.000 93.870 L 140.000 56.540 ZM 212.000 128.000 C 212.002 138.719 208.090 149.071 201.000 157.110 C 196.615 162.081 189.031 162.555 184.060 158.170 C 179.089 153.785 178.615 146.201 183.000 141.230 C 189.651 133.675 189.651 122.355 183.000 114.800 C 178.845 109.807 179.418 102.415 184.291 98.121 C 189.165 93.827 196.570 94.190 201.000 98.940 C 208.084 106.964 211.995 117.297 212.000 128.000 ZM 252.000 128.000 C 252.012 148.664 244.395 168.606 230.610 184.000 C 226.192 188.940 218.605 189.363 213.665 184.945 C 208.725 180.527 208.302 172.940 212.720 168.000 C 233.092 145.224 233.092 110.776 212.720 88.000 C 209.743 84.824 208.720 80.285 210.046 76.138 C 211.372 71.992 214.840 68.889 219.107 68.030 C 223.375 67.171 227.773 68.690 230.600 72.000 C 244.389 87.393 252.010 107.334 252.000 128.000 Z"),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
