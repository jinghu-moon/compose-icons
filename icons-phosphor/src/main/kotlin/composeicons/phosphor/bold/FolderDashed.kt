package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorBoldIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 208c0 6.627-5.373 12-12 12h-48.62C28.684 219.983 20.017 211.316 20 200.62v-8.62c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h44c6.627 0 12 5.373 12 12ZM160 196h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM224 140c-6.627 0-12 5.373-12 12v44h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16.89c10.55-.011 19.099-8.56 19.11-19.11v-48.89c0-6.627-5.373-12-12-12ZM216 68h-48c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h44v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24C236 76.954 227.046 68 216 68ZM32 164c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12ZM20 80v-28C20 40.954 28.954 32 40 32h52.41c5.709 .002 11.146 2.443 14.94 6.71h0L137 72c3.162 3.535 3.945 8.6 1.999 12.925C137.053 89.249 132.742 92.022 128 92h-96C25.373 92 20 86.627 20 80ZM44 68h57.28L90.61 56h-46.61Z"),
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
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
