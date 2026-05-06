package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArrowDown: ImageVector
    get() {
        if (_fileArrowDown != null) return _fileArrowDown!!
        _fileArrowDown = phosphorBoldIcon(
            name = "FileArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.52l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v176c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-128c-0-3.18-1.263-6.23-3.51-8.48ZM160 57l23 23h-23ZM60 212v-168h76v48c0 6.627 5.373 12 12 12h48v108ZM160.49 151.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-24 24c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-24-24c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L116 155v-31c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v31l3.51-3.52c2.255-2.249 5.311-3.51 8.496-3.504 3.185 .006 6.237 1.277 8.484 3.534Z"),
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
        return _fileArrowDown!!
    }

private var _fileArrowDown: ImageVector? = null
