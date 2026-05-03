package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSimpleLow: ImageVector
    get() {
        if (_speakerSimpleLow != null) return _speakerSimpleLow!!
        _speakerSimpleLow = phosphorBoldIcon(
            name = "SpeakerSimpleLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 165.270 21.220 C 161.152 19.207 156.247 19.715 152.630 22.530 L 83.880 76.000 L 40.000 76.000 C 28.954 76.000 20.000 84.954 20.000 96.000 L 20.000 160.000 C 20.000 171.046 28.954 180.000 40.000 180.000 L 83.880 180.000 L 152.630 233.470 C 156.247 236.285 161.153 236.794 165.271 234.780 C 169.389 232.767 172.000 228.584 172.000 224.000 L 172.000 32.000 C 172.000 27.416 169.388 23.233 165.270 21.220 ZM 148.000 199.460 L 95.370 158.530 C 93.263 156.890 90.670 156.000 88.000 156.000 L 44.000 156.000 L 44.000 100.000 L 88.000 100.000 C 90.670 100.000 93.263 99.110 95.370 97.470 L 148.000 56.540 ZM 212.000 104.000 L 212.000 152.000 C 212.000 158.627 206.627 164.000 200.000 164.000 C 193.373 164.000 188.000 158.627 188.000 152.000 L 188.000 104.000 C 188.000 97.373 193.373 92.000 200.000 92.000 C 206.627 92.000 212.000 97.373 212.000 104.000 Z"),
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
        return _speakerSimpleLow!!
    }

private var _speakerSimpleLow: ImageVector? = null
