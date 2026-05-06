package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorThinIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v124c0 2.209-1.791 4-4 4h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c6.627 0 12-5.373 12-12v-128c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34ZM153.94 148.5c-1.273-.704-2.827-.662-4.06 .11L124 164.78v-4.78c0-6.627-5.373-12-12-12h-64c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-4.78l25.88 16.17c.636 .398 1.37 .609 2.12 .61 .678-.002 1.345-.174 1.94-.5 1.272-.705 2.061-2.046 2.06-3.5v-64c.001-1.454-.788-2.795-2.06-3.5ZM116 208c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM148 208.78l-24-15v-19.56l24-15Z"),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
