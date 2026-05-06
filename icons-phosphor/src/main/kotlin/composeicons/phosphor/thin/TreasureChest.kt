package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorThinIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 44h-112C43.295 44.033 20.033 67.295 20 96v96c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-96C235.967 67.295 212.705 44.033 184 44ZM228 96v12h-40v-55.81c22.64 2.095 39.968 21.073 40 43.81ZM140 140h-24v-40h24ZM112 148h32c2.209 0 4-1.791 4-4v-28h32v80h-104v-80h32v28c0 2.209 1.791 4 4 4ZM148 108v-12c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4v12h-32v-56h104v56ZM68 52.19v55.81h-40v-12C28.032 73.263 45.36 54.285 68 52.19ZM28 192v-76h40v80h-36c-2.209 0-4-1.791-4-4ZM224 196h-36v-80h40v76c0 2.209-1.791 4-4 4Z"),
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
