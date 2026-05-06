package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorBoldIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.94 163.06 204.32 148.75C189.376 141.335 179.946 126.072 180 109.39v-29.39c0-6.627-5.373-12-12-12C143.711 67.972 124.028 48.289 124 24c-.001-4.556-2.582-8.719-6.662-10.745-4.081-2.027-8.957-1.567-12.588 1.185l-77 58.41-.3 .23c-4.407 3.566-7.094 8.836-7.391 14.498-.297 5.662 1.822 11.184 5.831 15.192L139.57 216.49c2.252 2.25 5.306 3.512 8.49 3.51h75.94c11.046 0 20-8.954 20-20v-19.06c.024-7.581-4.266-14.516-11.06-17.88ZM220 196h-67L46.08 89.05 58.94 79.29l41.2 41.2c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L78.25 64.65 103.49 45.51c7.915 23.582 28.035 40.989 52.51 45.43v18.45c-.089 25.782 14.49 49.37 37.59 60.82L220 183.42ZM55.49 184h-23.49c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h23.49c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM103.49 208c0 6.627-5.373 12-12 12h-43.49c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h43.49c6.627 0 12 5.373 12 12Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
