package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) return _fileArrowUp!!
        _fileArrowUp = phosphorBoldIcon(
            name = "FileArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.52l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v176c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-128c-0-3.18-1.263-6.23-3.51-8.48ZM183 80h-23v-23ZM60 212v-168h76v48c0 6.627 5.373 12 12 12h48v108ZM160.49 139.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L140 153v31c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-31l-3.51 3.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l24-24c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529Z"),
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
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
