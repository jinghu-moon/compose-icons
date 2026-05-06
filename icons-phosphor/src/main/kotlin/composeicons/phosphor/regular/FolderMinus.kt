package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) return _folderMinus!!
        _folderMinus = phosphorRegularIcon(
            name = "FolderMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 72h-84.69L104 44.69C101.01 41.676 96.936 39.986 92.69 40h-52.69C31.163 40 24 47.163 24 56v144.62c.011 8.49 6.89 15.369 15.38 15.38h177.51c8.34-.011 15.099-6.77 15.11-15.11v-112.89c0-8.837-7.163-16-16-16ZM92.69 56l16 16h-68.69v-16ZM216 200h-176v-112h176ZM104 136h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
