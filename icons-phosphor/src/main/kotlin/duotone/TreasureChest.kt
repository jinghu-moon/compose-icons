package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorDuotoneIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 112.000 L 232.000 192.000 C 232.000 196.418 228.418 200.000 224.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 196.418 24.000 192.000 L 24.000 112.000 L 112.000 112.000 L 112.000 144.000 L 144.000 144.000 L 144.000 112.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 184.000 40.000 L 72.000 40.000 C 41.086 40.033 16.033 65.086 16.000 96.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 96.000 C 239.967 65.086 214.914 40.033 184.000 40.000 ZM 224.000 96.000 L 224.000 104.000 L 192.000 104.000 L 192.000 56.800 C 210.612 60.627 223.977 76.999 224.000 96.000 ZM 136.000 136.000 L 120.000 136.000 L 120.000 104.000 L 136.000 104.000 ZM 112.000 152.000 L 144.000 152.000 C 148.418 152.000 152.000 148.418 152.000 144.000 L 152.000 120.000 L 176.000 120.000 L 176.000 192.000 L 80.000 192.000 L 80.000 120.000 L 104.000 120.000 L 104.000 144.000 C 104.000 148.418 107.582 152.000 112.000 152.000 ZM 152.000 104.000 L 152.000 96.000 C 152.000 91.582 148.418 88.000 144.000 88.000 L 112.000 88.000 C 107.582 88.000 104.000 91.582 104.000 96.000 L 104.000 104.000 L 80.000 104.000 L 80.000 56.000 L 176.000 56.000 L 176.000 104.000 ZM 64.000 56.800 L 64.000 104.000 L 32.000 104.000 L 32.000 96.000 C 32.023 76.999 45.388 60.627 64.000 56.800 ZM 32.000 120.000 L 64.000 120.000 L 64.000 192.000 L 32.000 192.000 ZM 224.000 192.000 L 192.000 192.000 L 192.000 120.000 L 224.000 120.000 L 224.000 192.000 Z"),
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
