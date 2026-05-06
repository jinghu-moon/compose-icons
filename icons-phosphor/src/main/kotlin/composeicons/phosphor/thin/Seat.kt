package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorThinIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 232c0 2.209-1.791 4-4 4h-104c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h104c2.209 0 4 1.791 4 4ZM220 160v32c0 6.627-5.373 12-12 12h-93.89c-4.551 .017-8.716-2.554-10.74-6.63L45.26 81.37c-1.68-3.383-1.68-7.357 0-10.74L67.38 26.63c2.943-5.891 10.083-8.309 16-5.42l33.78 14.27 .23 .11c2.847 1.423 5.013 3.918 6.02 6.938 1.007 3.019 .773 6.315-.65 9.162l-.06 .1L108.4 78.26c-.547 1.113-.547 2.417 0 3.53l31.78 64c.679 1.348 2.06 2.199 3.57 2.2h64.25c3.184 0 6.238 1.266 8.489 3.518 2.251 2.253 3.514 5.307 3.511 8.492ZM212 160c0-2.209-1.791-4-4-4h-64.23c-4.562 .029-8.741-2.544-10.77-6.63L101.22 85.37c-1.685-3.375-1.685-7.345 0-10.72l.06-.11L115.55 48.07c.936-1.931 .181-4.256-1.71-5.27L80.13 28.53l-.24-.11c-.552-.279-1.162-.423-1.78-.42-1.516-.001-2.902 .855-3.58 2.21l-22.12 44c-.56 1.124-.56 2.446 0 3.57l58.11 116c.678 1.355 2.064 2.211 3.58 2.21h93.9c2.209 0 4-1.791 4-4Z"),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
