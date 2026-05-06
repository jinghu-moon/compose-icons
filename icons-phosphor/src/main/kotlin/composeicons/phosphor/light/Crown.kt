package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = phosphorLightIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 80c.01-11.356-7.351-21.405-18.181-24.82-10.83-3.415-22.624 .594-29.129 9.902-6.506 9.308-6.218 21.761 .711 30.758l-29.83 36.72-26-59.76c8.963-6.709 12.625-18.402 9.09-29.025C149.124 33.152 139.186 25.985 127.99 25.985c-11.196 0-21.134 7.167-24.67 17.79-3.535 10.623 .127 22.316 9.09 29.025l-26 59.76L56.6 95.84c7.27-9.452 7.178-22.637-.222-31.987C48.977 54.503 36.165 51.386 25.296 56.29 14.428 61.195 8.288 72.864 10.403 84.599c2.114 11.735 11.94 20.528 23.837 21.331L49 194.3c1.123 6.74 6.947 11.685 13.78 11.7h130.44c6.833-.015 12.657-4.96 13.78-11.7l14.73-88.37C235.383 105.02 245.993 93.683 246 80ZM128 38c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14ZM22 80C22 72.268 28.268 66 36 66c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14C28.268 94 22 87.732 22 80ZM195.2 192.33c-.163 .974-1.012 1.684-2 1.67h-130.42c-.988 .014-1.837-.696-2-1.67L46.08 104l1.22-.55 36 44.36c1.154 1.404 2.882 2.21 4.7 2.19 .271-0 .542-.02 .81-.06 2.076-.283 3.854-1.629 4.69-3.55L123.42 77.59c3.029 .547 6.131 .547 9.16 0l29.92 68.8c.836 1.921 2.614 3.267 4.69 3.55 .268 .04 .539 .06 .81 .06 1.809 0 3.521-.816 4.66-2.22l36-44.36 1.22 .55ZM220 94c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14Z"),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
