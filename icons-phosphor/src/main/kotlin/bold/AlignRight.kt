package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorBoldIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 40.000 L 228.000 216.000 C 228.000 222.627 222.627 228.000 216.000 228.000 C 209.373 228.000 204.000 222.627 204.000 216.000 L 204.000 40.000 C 204.000 33.373 209.373 28.000 216.000 28.000 C 222.627 28.000 228.000 33.373 228.000 40.000 ZM 188.000 64.000 L 188.000 100.000 C 188.000 111.046 179.046 120.000 168.000 120.000 L 80.000 120.000 C 68.954 120.000 60.000 111.046 60.000 100.000 L 60.000 64.000 C 60.000 52.954 68.954 44.000 80.000 44.000 L 168.000 44.000 C 179.046 44.000 188.000 52.954 188.000 64.000 ZM 164.000 68.000 L 84.000 68.000 L 84.000 96.000 L 164.000 96.000 ZM 188.000 156.000 L 188.000 192.000 C 188.000 203.046 179.046 212.000 168.000 212.000 L 40.000 212.000 C 28.954 212.000 20.000 203.046 20.000 192.000 L 20.000 156.000 C 20.000 144.954 28.954 136.000 40.000 136.000 L 168.000 136.000 C 179.046 136.000 188.000 144.954 188.000 156.000 ZM 164.000 160.000 L 44.000 160.000 L 44.000 188.000 L 164.000 188.000 Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
