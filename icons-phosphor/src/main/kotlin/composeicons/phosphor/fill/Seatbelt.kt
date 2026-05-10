package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorFillIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 112C103.699 112 84 92.301 84 68 84 43.699 103.699 24 128 24c24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44ZM200 216h-122.84L197.29 110c.405-.359 .774-.758 1.1-1.19 1.096-1.462 1.664-3.253 1.61-5.08-.104-3.095-1.984-5.853-4.828-7.079-2.844-1.226-6.14-.701-8.462 1.349l-24.54 21.65c-22.74-10.749-49.211-10.178-71.467 1.543C68.448 132.913 53.001 154.418 49 179.25c-.058 .364-.091 .732-.1 1.1L48 223.83c-.046 2.151 .777 4.23 2.282 5.767 1.505 1.537 3.566 2.403 5.718 2.403h144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM188.12 143c-2.265-.274-4.539 .432-6.25 1.94L119.47 200h80.53c4.418 0 8-3.582 8-8 .029-16.309-4.952-32.234-14.27-45.62-1.302-1.876-3.343-3.106-5.61-3.38Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
