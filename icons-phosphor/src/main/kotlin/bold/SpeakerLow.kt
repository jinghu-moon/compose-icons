package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorBoldIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 157.270 21.220 C 153.152 19.207 148.247 19.715 144.630 22.530 L 75.880 76.000 L 32.000 76.000 C 20.954 76.000 12.000 84.954 12.000 96.000 L 12.000 160.000 C 12.000 171.046 20.954 180.000 32.000 180.000 L 75.880 180.000 L 144.630 233.470 C 148.247 236.285 153.153 236.794 157.271 234.780 C 161.389 232.767 164.000 228.584 164.000 224.000 L 164.000 32.000 C 164.000 27.416 161.388 23.233 157.270 21.220 ZM 36.000 100.000 L 68.000 100.000 L 68.000 156.000 L 36.000 156.000 ZM 140.000 199.460 L 92.000 162.130 L 92.000 93.870 L 140.000 56.540 ZM 212.000 128.000 C 212.002 138.719 208.090 149.071 201.000 157.110 C 196.615 162.081 189.031 162.555 184.060 158.170 C 179.089 153.785 178.615 146.201 183.000 141.230 C 189.656 133.673 189.656 122.347 183.000 114.790 C 178.914 109.791 179.516 102.456 184.361 98.190 C 189.206 93.923 196.558 94.255 201.000 98.940 C 208.084 106.964 211.995 117.297 212.000 128.000 Z"),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
