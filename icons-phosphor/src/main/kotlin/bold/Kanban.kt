package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorBoldIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 88.000 228.000 C 99.046 228.000 108.000 219.046 108.000 208.000 L 108.000 164.000 L 148.000 164.000 L 148.000 176.000 C 148.000 187.046 156.954 196.000 168.000 196.000 L 208.000 196.000 C 219.046 196.000 228.000 187.046 228.000 176.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 204.000 108.000 L 172.000 108.000 L 172.000 68.000 L 204.000 68.000 ZM 84.000 68.000 L 84.000 108.000 L 52.000 108.000 L 52.000 68.000 ZM 84.000 204.000 L 52.000 204.000 L 52.000 132.000 L 84.000 132.000 ZM 108.000 140.000 L 108.000 68.000 L 148.000 68.000 L 148.000 140.000 ZM 172.000 172.000 L 172.000 132.000 L 204.000 132.000 L 204.000 172.000 Z"),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
