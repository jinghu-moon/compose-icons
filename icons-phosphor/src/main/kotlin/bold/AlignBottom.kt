package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = phosphorBoldIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 216.000 C 228.000 222.627 222.627 228.000 216.000 228.000 L 40.000 228.000 C 33.373 228.000 28.000 222.627 28.000 216.000 C 28.000 209.373 33.373 204.000 40.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 209.373 228.000 216.000 ZM 136.000 168.000 L 136.000 80.000 C 136.000 68.954 144.954 60.000 156.000 60.000 L 192.000 60.000 C 203.046 60.000 212.000 68.954 212.000 80.000 L 212.000 168.000 C 212.000 179.046 203.046 188.000 192.000 188.000 L 156.000 188.000 C 144.954 188.000 136.000 179.046 136.000 168.000 ZM 160.000 164.000 L 188.000 164.000 L 188.000 84.000 L 160.000 84.000 ZM 44.000 168.000 L 44.000 40.000 C 44.000 28.954 52.954 20.000 64.000 20.000 L 100.000 20.000 C 111.046 20.000 120.000 28.954 120.000 40.000 L 120.000 168.000 C 120.000 179.046 111.046 188.000 100.000 188.000 L 64.000 188.000 C 52.954 188.000 44.000 179.046 44.000 168.000 ZM 68.000 164.000 L 96.000 164.000 L 96.000 44.000 L 68.000 44.000 Z"),
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
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
