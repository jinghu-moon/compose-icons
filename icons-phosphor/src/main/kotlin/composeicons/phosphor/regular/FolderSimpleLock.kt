package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorRegularIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 88v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-85.33c-3.461-.009-6.826-1.131-9.6-3.2L93.33 64h-53.33v136h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72c-8.837 0-16-7.163-16-16v-136C24 55.163 31.163 48 40 48h53.33c3.461 .009 6.826 1.131 9.6 3.2L130.67 72h85.33c8.837 0 16 7.163 16 16ZM232 168v40c0 4.418-3.582 8-8 8h-72c-4.418 0-8-3.582-8-8v-40c0-4.418 3.582-8 8-8h8v-4c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v4h8c4.418 0 8 3.582 8 8ZM176 160h24v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12ZM216 176h-56v24h56Z"),
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
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
