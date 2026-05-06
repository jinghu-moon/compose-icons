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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 112v80c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-80h88v32h32v-32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M184 40h-112C41.086 40.033 16.033 65.086 16 96v96c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-96C239.967 65.086 214.914 40.033 184 40ZM224 96v8h-32v-47.2c18.612 3.827 31.977 20.199 32 39.2ZM136 136h-16v-32h16ZM112 152h32c4.418 0 8-3.582 8-8v-24h24v72h-96v-72h24v24c0 4.418 3.582 8 8 8ZM152 104v-8c0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8v8h-24v-48h96v48ZM64 56.8v47.2h-32v-8C32.023 76.999 45.388 60.627 64 56.8ZM32 120h32v72h-32ZM224 192h-32v-72h32v72Z"),
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
