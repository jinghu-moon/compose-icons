package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorBoldIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 160.000 28.000 C 148.954 28.000 140.000 36.954 140.000 48.000 L 140.000 208.000 C 140.000 219.046 148.954 228.000 160.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 164.000 204.000 L 164.000 180.000 L 180.000 180.000 C 186.627 180.000 192.000 174.627 192.000 168.000 C 192.000 161.373 186.627 156.000 180.000 156.000 L 164.000 156.000 L 164.000 140.000 L 180.000 140.000 C 186.627 140.000 192.000 134.627 192.000 128.000 C 192.000 121.373 186.627 116.000 180.000 116.000 L 164.000 116.000 L 164.000 100.000 L 180.000 100.000 C 186.627 100.000 192.000 94.627 192.000 88.000 C 192.000 81.373 186.627 76.000 180.000 76.000 L 164.000 76.000 L 164.000 52.000 L 204.000 52.000 ZM 80.490 23.510 C 78.238 21.251 75.180 19.981 71.990 19.981 C 68.800 19.981 65.742 21.251 63.490 23.510 L 31.490 55.510 C 29.247 57.766 27.992 60.819 28.000 64.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 96.000 228.000 C 107.046 228.000 116.000 219.046 116.000 208.000 L 116.000 64.000 C 116.003 60.816 114.740 57.762 112.490 55.510 ZM 52.000 92.000 L 92.000 92.000 L 92.000 164.000 L 52.000 164.000 ZM 72.000 49.000 L 91.000 68.000 L 53.000 68.000 ZM 52.000 204.000 L 52.000 188.000 L 92.000 188.000 L 92.000 204.000 Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
