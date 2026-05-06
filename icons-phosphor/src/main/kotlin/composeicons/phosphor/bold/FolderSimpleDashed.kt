package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) return _folderSimpleDashed!!
        _folderSimpleDashed = phosphorBoldIcon(
            name = "FolderSimpleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 80v-16C20 52.954 28.954 44 40 44h53.33c4.326 .009 8.534 1.411 12 4l29.87 22.4c5.302 3.976 6.376 11.498 2.4 16.8-3.976 5.302-11.498 6.376-16.8 2.4L92 68h-48v12c0 6.627-5.373 12-12 12C25.373 92 20 86.627 20 80ZM88 196h-44v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v8.62c.017 10.696 8.684 19.363 19.38 19.38h48.62c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM160 196h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM224 140c-6.627 0-12 5.373-12 12v44h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16.89c10.55-.011 19.099-8.56 19.11-19.11v-48.89c0-6.627-5.373-12-12-12ZM216 68h-48c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h44v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24C236 76.954 227.046 68 216 68ZM32 164c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12Z"),
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
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
