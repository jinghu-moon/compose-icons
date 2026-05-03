package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorBoldIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 40.000 C 212.000 46.627 206.627 52.000 200.000 52.000 L 170.710 52.000 C 161.033 51.984 152.732 58.899 151.000 68.420 L 142.380 116.000 L 184.000 116.000 C 190.627 116.000 196.000 121.373 196.000 128.000 C 196.000 134.627 190.627 140.000 184.000 140.000 L 138.000 140.000 L 128.560 191.870 C 124.758 212.784 106.547 227.990 85.290 228.000 L 56.000 228.000 C 49.373 228.000 44.000 222.627 44.000 216.000 C 44.000 209.373 49.373 204.000 56.000 204.000 L 85.290 204.000 C 94.967 204.016 103.268 197.101 105.000 187.580 L 113.620 140.000 L 72.000 140.000 C 65.373 140.000 60.000 134.627 60.000 128.000 C 60.000 121.373 65.373 116.000 72.000 116.000 L 118.000 116.000 L 127.440 64.130 C 131.242 43.216 149.453 28.010 170.710 28.000 L 200.000 28.000 C 206.627 28.000 212.000 33.373 212.000 40.000 Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
