package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Spinner: ImageVector
    get() {
        if (_spinner != null) return _spinner!!
        _spinner = phosphorBoldIcon(
            name = "Spinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 32v32c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-32c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM173.25 94.75c3.185-0 6.239-1.266 8.49-3.52L204.37 68.6c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L164.77 74.26c-3.435 3.431-4.464 8.593-2.607 13.079 1.856 4.486 6.233 7.411 11.087 7.411ZM224 116h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM181.74 164.77c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l22.63 22.63c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM128 180c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM74.26 164.77 51.63 187.4c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L91.26 181.77c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0ZM76 128c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12ZM68.6 51.63c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L74.26 91.23c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17Z"),
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
        return _spinner!!
    }

private var _spinner: ImageVector? = null
