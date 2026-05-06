package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorThinIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 84h-88c-.865 0-1.708-.281-2.4-.8L95.73 60.8C95.038 60.281 94.195 60 93.33 60h-53.33c-2.209 0-4 1.791-4 4v136c0 2.209 1.791 4 4 4h80c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-80c-6.627 0-12-5.373-12-12v-136C28 57.373 33.373 52 40 52h53.33c2.596 .004 5.121 .845 7.2 2.4L129.33 76h86.67c6.627 0 12 5.373 12 12v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32c0-2.209-1.791-4-4-4ZM234.55 164.7l-24.46 20.19L217.55 215c.388 1.563-.199 3.207-1.49 4.17-.693 .511-1.53 .787-2.39 .79-.703-.004-1.393-.194-2-.55L184 203.18l-27.64 16.27c-1.388 .816-3.129 .72-4.42-.242-1.29-.963-1.878-2.605-1.49-4.168l7.46-30.15L133.45 164.7c-1.263-1.037-1.768-2.739-1.275-4.298 .493-1.559 1.885-2.66 3.515-2.782l32.24-2.49 12.4-28.72c.634-1.463 2.076-2.409 3.67-2.409 1.594 0 3.036 .946 3.67 2.409l12.4 28.72 32.24 2.49c1.63 .122 3.022 1.224 3.515 2.782 .493 1.559-.012 3.26-1.275 4.298ZM221.81 164.84 197 162.92c-1.478-.115-2.771-1.039-3.36-2.4L184 138.1l-9.68 22.42c-.589 1.361-1.882 2.285-3.36 2.4l-24.77 1.92L165 180.32c1.186 .982 1.703 2.557 1.33 4.05l-5.78 23.36L182 195.09c1.253-.738 2.807-.738 4.06 0l21.47 12.64-5.78-23.36c-.373-1.493 .144-3.068 1.33-4.05Z"),
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
        return _folderSimpleStar!!
    }

private var _folderSimpleStar: ImageVector? = null
