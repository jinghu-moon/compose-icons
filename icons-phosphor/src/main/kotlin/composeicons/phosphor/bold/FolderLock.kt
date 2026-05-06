package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorBoldIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 152h-4v-4c0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32v4h-4c-6.627 0-12 5.373-12 12v44c0 6.627 5.373 12 12 12h72c6.627 0 12-5.373 12-12v-44c0-6.627-5.373-12-12-12ZM180 148c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v4h-16ZM212 196h-48v-20h48ZM216 68h-82.61l-26-29.29C103.582 34.428 98.12 31.984 92.39 32h-52.39C28.954 32 20 40.954 20 52v148.62c.017 10.696 8.684 19.363 19.38 19.38h65.18c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-60.56v-104h168c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4C236 76.954 227.046 68 216 68ZM44 68v-12h46.61l10.67 12Z"),
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
