package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorDuotoneIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 168v40h-72v-40ZM92.69 48h-52.69c-4.418 0-8 3.582-8 8v24h96L98.34 50.34C96.841 48.843 94.809 48.001 92.69 48Z"),
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
                pathData = parseSvgPathData("M224 160h-8v-4c0-15.464-12.536-28-28-28-15.464 0-28 12.536-28 28v4h-8c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM176 156c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h-24ZM216 200h-56v-24h56ZM216 72h-84.69L104 44.69C101.01 41.676 96.936 39.986 92.69 40h-52.69C31.163 40 24 47.163 24 56v144.62c.011 8.49 6.89 15.369 15.38 15.38h73.18c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-72.56v-112h176v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c0-8.837-7.163-16-16-16ZM92.69 56l16 16h-68.69v-16Z"),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
