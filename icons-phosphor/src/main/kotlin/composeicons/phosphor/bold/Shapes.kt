package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorBoldIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M71.49 60.55C69.974 55.464 65.297 51.978 59.99 51.978c-5.307 0-9.984 3.486-11.5 8.572L12.49 180.55c-1.092 3.636-.398 7.575 1.87 10.619 2.268 3.045 5.843 4.836 9.64 4.831h72c3.793-.001 7.362-1.795 9.626-4.839 2.263-3.044 2.955-6.978 1.864-10.611ZM40.13 172 60 105.76 79.87 172ZM212 74C212 44.177 187.823 20 158 20c-29.823 0-54 24.177-54 54 0 29.823 24.177 54 54 54 29.81-.033 53.967-24.19 54-54ZM128 74c0-16.569 13.431-30 30-30 16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30C141.431 104 128 90.569 128 74ZM224 144h-88c-6.627 0-12 5.373-12 12v52c0 6.627 5.373 12 12 12h88c6.627 0 12-5.373 12-12v-52c0-6.627-5.373-12-12-12ZM212 196h-64v-28h64Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
