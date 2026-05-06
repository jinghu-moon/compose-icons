package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorBoldIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 88v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12h-81.33c-4.326-.009-8.534-1.411-12-4L92 68h-48v128h60c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64C28.954 220 20 211.046 20 200v-136C20 52.954 28.954 44 40 44h53.33c4.326 .009 8.534 1.411 12 4L132 68h84c11.046 0 20 8.954 20 20ZM236 164v44c0 6.627-5.373 12-12 12h-72c-6.627 0-12-5.373-12-12v-44c0-6.627 5.373-12 12-12h4v-4c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32v4h4c6.627 0 12 5.373 12 12ZM180 152h16v-4c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8ZM212 176h-48v20h48Z"),
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
