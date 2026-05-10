package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorFillIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 124v68c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-68c0-2.209 1.791-4 4-4h36v64c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.516 3.791 2.294 6.003 2.147 4.275-.367 7.538-3.979 7.47-8.27v-63.73h40v20c0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4v-20h40v64c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.516 3.791 2.294 6.003 2.147 4.268-.367 7.528-3.967 7.47-8.25v-63.75h36c2.209 0 4 1.791 4 4ZM184 40h-112C41.072 40 16 65.072 16 96v4c0 2.209 1.791 4 4 4h36v-39.73C55.932 59.979 59.195 56.367 63.47 56c2.212-.147 4.386 .631 6.003 2.147C71.09 59.664 72.005 61.783 72 64v40h40v-12c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4v12h40v-39.73c-.068-4.291 3.195-7.903 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v40h36c2.209 0 4-1.791 4-4v-4C240 65.072 214.928 40 184 40Z"),
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
