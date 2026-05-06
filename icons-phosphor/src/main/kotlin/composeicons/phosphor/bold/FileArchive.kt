package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorBoldIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.51l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v176c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-128c.003-3.184-1.26-6.238-3.51-8.49ZM183 80h-23v-23ZM116 212v-20h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-8v-16h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-8v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v16h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v20h-32v-168h76v48c0 6.627 5.373 12 12 12h48v108Z"),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
