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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 36h-112C38.879 36.039 12.039 62.879 12 96v96c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-96C243.961 62.879 217.121 36.039 184 36ZM220 96v4h-28v-39.09c16.366 3.749 27.977 18.3 28 35.09ZM128 156c6.627 0 12-5.373 12-12v-20h28v64h-80v-64h28v20c0 6.627 5.373 12 12 12ZM140 100v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-28v-40h80v40ZM64 60.91v39.09h-28v-4C36.023 79.21 47.634 64.659 64 60.91ZM36 124h28v64h-28ZM192 188v-64h28v64Z"),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
