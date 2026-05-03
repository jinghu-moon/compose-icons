package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorBoldIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 128.000 L 116.000 48.000 C 116.000 41.373 121.373 36.000 128.000 36.000 C 134.627 36.000 140.000 41.373 140.000 48.000 L 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 ZM 182.550 46.000 C 177.009 42.588 169.758 44.214 166.205 49.666 C 162.652 55.118 164.091 62.408 169.450 66.100 C 191.410 80.370 204.000 103.000 204.000 128.000 C 204.000 169.974 169.974 204.000 128.000 204.000 C 86.026 204.000 52.000 169.974 52.000 128.000 C 52.000 103.000 64.590 80.370 86.550 66.050 C 91.613 62.255 92.860 55.181 89.399 49.884 C 85.938 44.587 78.959 42.887 73.450 46.000 C 44.560 64.780 28.000 94.690 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 228.000 94.690 211.440 64.780 182.550 46.000 Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
