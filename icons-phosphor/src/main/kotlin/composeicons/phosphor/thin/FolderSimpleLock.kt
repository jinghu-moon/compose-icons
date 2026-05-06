package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorThinIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 88v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209-1.791-4-4-4h-85.33c-2.596-.004-5.121-.845-7.2-2.4L95.73 60.8C95.038 60.281 94.195 60 93.33 60h-53.33c-2.209 0-4 1.791-4 4v136c0 2.209 1.791 4 4 4h72c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-72c-6.627 0-12-5.373-12-12v-136C28 57.373 33.373 52 40 52h53.33c2.596 .004 5.121 .845 7.2 2.4l27.74 20.8c.692 .519 1.535 .8 2.4 .8h85.33c6.627 0 12 5.373 12 12ZM228 168v40c0 2.209-1.791 4-4 4h-72c-2.209 0-4-1.791-4-4v-40c0-2.209 1.791-4 4-4h12v-8c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24v8h12c2.209 0 4 1.791 4 4ZM172 164h32v-8c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16ZM220 172h-64v32h64Z"),
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
