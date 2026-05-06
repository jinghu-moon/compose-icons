package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = phosphorBoldIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.52l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v176c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-128c-0-3.18-1.263-6.23-3.51-8.48ZM183 80h-23v-23ZM60 212v-168h76v48c0 6.627 5.373 12 12 12h48v108ZM160.49 136.49 145 152l15.52 15.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L128 169l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L111 152 95.51 136.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 135l15.51-15.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
