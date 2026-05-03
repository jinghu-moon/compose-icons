package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Monitor: ImageVector
    get() {
        if (_monitor != null) return _monitor!!
        _monitor = phosphorThinIcon(
            name = "Monitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 44.000 L 48.000 44.000 C 36.954 44.000 28.000 52.954 28.000 64.000 L 28.000 176.000 C 28.000 187.046 36.954 196.000 48.000 196.000 L 208.000 196.000 C 219.046 196.000 228.000 187.046 228.000 176.000 L 228.000 64.000 C 228.000 52.954 219.046 44.000 208.000 44.000 ZM 220.000 176.000 C 220.000 182.627 214.627 188.000 208.000 188.000 L 48.000 188.000 C 41.373 188.000 36.000 182.627 36.000 176.000 L 36.000 64.000 C 36.000 57.373 41.373 52.000 48.000 52.000 L 208.000 52.000 C 214.627 52.000 220.000 57.373 220.000 64.000 ZM 164.000 224.000 C 164.000 226.209 162.209 228.000 160.000 228.000 L 96.000 228.000 C 93.791 228.000 92.000 226.209 92.000 224.000 C 92.000 221.791 93.791 220.000 96.000 220.000 L 160.000 220.000 C 162.209 220.000 164.000 221.791 164.000 224.000 Z"),
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
        return _monitor!!
    }

private var _monitor: ImageVector? = null
