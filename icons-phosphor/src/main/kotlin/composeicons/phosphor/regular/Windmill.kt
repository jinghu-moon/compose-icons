package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorRegularIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 224h-41.06l-6.3-44.12 3.24 1.91c3.657 2.154 8.02 2.767 12.13 1.704 4.109-1.063 7.627-3.716 9.78-7.374l12-20.34c2.154-3.657 2.767-8.02 1.704-12.13-1.063-4.109-3.716-7.627-7.374-9.78l-35-20.61L213.81 44.13c2.154-3.657 2.767-8.02 1.704-12.13-1.063-4.109-3.716-7.627-7.374-9.78L187.8 10.22C184.143 8.066 179.78 7.453 175.67 8.516c-4.109 1.063-7.627 3.716-9.78 7.374L145.28 50.89 76.12 10.22C72.463 8.066 68.1 7.453 63.99 8.516c-4.109 1.063-7.627 3.716-9.78 7.374l-12 20.33c-2.158 3.658-2.772 8.024-1.709 12.135 1.064 4.112 3.718 7.632 7.379 9.785L82.88 78.75 42.21 147.88c-2.154 3.657-2.767 8.02-1.704 12.13 1.063 4.109 3.716 7.627 7.374 9.78l20.34 12c3.177 1.904 6.928 2.613 10.58 2L73.06 224h-41.06c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM200 147.66 188 168 118.87 127.31l12-20.35ZM179.66 24 200 36l-40.69 69.14L139 93.17ZM56 44.35 68 24l69.14 40.7-12 20.35ZM76.34 168 56 156 96.69 86.86l20.36 12ZM89.22 224 98 162.8l12.77-21.7L159 169.5 166.79 224Z"),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
