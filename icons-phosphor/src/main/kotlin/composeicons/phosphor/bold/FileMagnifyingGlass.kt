package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileMagnifyingGlass: ImageVector
    get() {
        if (_fileMagnifyingGlass != null) return _fileMagnifyingGlass!!
        _fileMagnifyingGlass = phosphorBoldIcon(
            name = "FileMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.52l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v176c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-128c-0-3.18-1.263-6.23-3.51-8.48ZM183 80h-23v-23ZM60 212v-168h76v48c0 6.627 5.373 12 12 12h48v108ZM156.48 163.51c7.545-15.822 2.596-34.779-11.719-44.895-14.316-10.116-33.836-8.451-46.231 3.944-12.395 12.395-14.06 31.916-3.944 46.231 10.116 14.316 29.073 19.264 44.895 11.719l12 12c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM112 148c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _fileMagnifyingGlass!!
    }

private var _fileMagnifyingGlass: ImageVector? = null
