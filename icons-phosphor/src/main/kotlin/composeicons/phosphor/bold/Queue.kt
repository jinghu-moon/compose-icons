package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorBoldIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 64C28 57.373 33.373 52 40 52h176c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-176C33.373 76 28 70.627 28 64ZM132 116h-92c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h92c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM132 180h-92c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h92c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM252 160c.001 4.139-2.13 7.986-5.64 10.18l-64 40c-3.7 2.312-8.363 2.434-12.179 .319C166.365 208.383 163.999 204.363 164 200v-80c-.001-4.363 2.365-8.383 6.181-10.499 3.816-2.116 8.479-1.994 12.179 .319l64 40c3.51 2.194 5.641 6.041 5.64 10.18ZM217.36 160 188 141.65v36.7Z"),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
