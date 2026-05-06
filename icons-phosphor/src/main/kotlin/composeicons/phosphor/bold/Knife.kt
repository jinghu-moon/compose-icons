package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorBoldIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.7 29.3c-12.429-12.421-32.571-12.421-45 0L15.52 203.56c-3.091 3.083-4.264 7.602-3.062 11.799 1.202 4.197 4.588 7.411 8.842 8.391 12.172 2.819 24.626 4.245 37.12 4.25 33.71 0 67.41-10.42 99.1-30.87 32.32-20.86 51.16-44.7 51.94-45.7 3.734-4.787 3.305-11.609-1-15.89L191 118 234.7 74.29c12.398-12.434 12.398-32.556 0-44.99ZM143.87 177.36C113 197.12 81.28 206 49.28 203.74L146 107l19.5 19.51h0 0l18 18c-11.858 12.486-25.162 23.513-39.63 32.85ZM217.73 57.36 174 101 163 90 206.7 46.28c3.094-2.662 7.717-2.489 10.603 .397 2.886 2.886 3.059 7.509 .397 10.603Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
