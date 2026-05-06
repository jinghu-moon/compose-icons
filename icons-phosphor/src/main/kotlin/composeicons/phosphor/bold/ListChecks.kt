package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorBoldIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c0 6.627-5.373 12-12 12h-88c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h88c6.627 0 12 5.373 12 12ZM128 76h88c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-88c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM216 180h-88c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h88c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM79.51 39.51 56 63 48.49 55.48c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l16 16c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l32-32c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0ZM79.51 103.51 56 127l-7.51-7.52c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l16 16c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l32-32c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0ZM79.51 167.51 56 191l-7.51-7.52c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l16 16c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l32-32c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0Z"),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
