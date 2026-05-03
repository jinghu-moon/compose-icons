package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorBoldIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 36.000 L 72.000 36.000 C 38.879 36.039 12.039 62.879 12.000 96.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 96.000 C 243.961 62.879 217.121 36.039 184.000 36.000 ZM 220.000 96.000 L 220.000 100.000 L 192.000 100.000 L 192.000 60.910 C 208.366 64.659 219.977 79.210 220.000 96.000 ZM 128.000 156.000 C 134.627 156.000 140.000 150.627 140.000 144.000 L 140.000 124.000 L 168.000 124.000 L 168.000 188.000 L 88.000 188.000 L 88.000 124.000 L 116.000 124.000 L 116.000 144.000 C 116.000 150.627 121.373 156.000 128.000 156.000 ZM 140.000 100.000 L 140.000 96.000 C 140.000 89.373 134.627 84.000 128.000 84.000 C 121.373 84.000 116.000 89.373 116.000 96.000 L 116.000 100.000 L 88.000 100.000 L 88.000 60.000 L 168.000 60.000 L 168.000 100.000 ZM 64.000 60.910 L 64.000 100.000 L 36.000 100.000 L 36.000 96.000 C 36.023 79.210 47.634 64.659 64.000 60.910 ZM 36.000 124.000 L 64.000 124.000 L 64.000 188.000 L 36.000 188.000 ZM 192.000 188.000 L 192.000 124.000 L 220.000 124.000 L 220.000 188.000 Z"),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
