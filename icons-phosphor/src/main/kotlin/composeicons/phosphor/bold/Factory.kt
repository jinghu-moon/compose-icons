package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorBoldIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 176c0 6.627-5.373 12-12 12h-28c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h28c6.627 0 12 5.373 12 12ZM176 164h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM244 216c0 6.627-5.373 12-12 12h-208c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4v-116c0-4.545 2.568-8.7 6.633-10.733 4.065-2.033 8.93-1.594 12.567 1.133L92 112v-24c0-4.545 2.568-8.7 6.633-10.733 4.065-2.033 8.93-1.594 12.567 1.133l33.33 25L155.14 29.17C156.588 19.339 165.003 12.042 174.94 12h18.12c9.937 .042 18.352 7.339 19.8 17.17l15 105.13c0 .1 .12 1.34 .12 1.7v68h4c3.186-.005 6.243 1.257 8.498 3.508 2.255 2.251 3.522 5.306 3.522 8.492ZM166.43 119.83 172 124h30.16L189.59 36h-11.18ZM52 204h152v-56h-36c-2.596 0-5.123-.842-7.2-2.4L146.42 134.82h-.06L116 112v24c0 4.545-2.568 8.7-6.633 10.733-4.065 2.033-8.93 1.594-12.567-1.133L52 112Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
