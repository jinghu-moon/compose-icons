package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorBoldIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c0 6.627-5.373 12-12 12h-100c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h100c6.627 0 12 5.373 12 12ZM116 76h100c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-100c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM216 180h-100c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h100c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 59.31v44.69c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-64C67.998 35.844 65.845 31.984 62.309 29.799 58.774 27.614 54.359 27.413 50.64 29.27l-16 8c-5.49 2.926-7.834 9.563-5.398 15.288 2.436 5.725 8.843 8.639 14.758 6.712ZM83.73 156.17C82.691 148.693 78.646 141.965 72.53 137.54 59.993 128.44 42.51 130.849 32.9 143c-1.775 2.281-3.182 4.825-4.17 7.54-2.168 6.2 1.05 12.99 7.222 15.237 6.172 2.247 13.003-.885 15.328-7.027 .144-.36 .339-.697 .58-1 1.609-1.949 4.457-2.308 6.5-.82 .875 .605 1.459 1.547 1.61 2.6 .136 .99-.143 1.992-.77 2.77l-.13 .17L30.39 200.82c-2.716 3.638-3.147 8.497-1.114 12.556 2.034 4.059 6.184 6.623 10.724 6.624h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-8L78.28 176.89c4.545-5.885 6.511-13.36 5.45-20.72Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
