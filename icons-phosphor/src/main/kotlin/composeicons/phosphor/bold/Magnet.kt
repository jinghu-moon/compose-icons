package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorBoldIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.84 47.44C192.664 29.91 169.162 20.022 144.62 20h-.35C119.827 19.935 96.375 29.658 79.15 47L17.76 109.17c-7.739 7.824-7.703 20.43 .08 28.21L46.5 166c3.745 3.764 8.84 5.874 14.15 5.86h.11c5.348-.006 10.468-2.17 14.2-6l60.87-62.39c4.645-4.551 12.06-4.604 16.77-.12 2.247 2.196 3.509 5.208 3.5 8.35 .034 3.401-1.282 6.677-3.66 9.11L90.19 181c-3.845 3.731-6.032 8.849-6.072 14.206-.039 5.357 2.072 10.507 5.862 14.294l28.66 28.66c7.774 7.717 20.299 7.779 28.15 .14l61.76-60.44 .09-.09c36.01-35.99 36.54-94.46 1.2-130.33ZM60.62 146.21l-23-23L55.81 104.8l22.88 22.88ZM132.82 218.39l-23-23 18.61-18 22.88 22.87ZM191.71 160.77l-23.23 22.73L145.7 160.73 169.21 138l.15-.14c6.954-7.005 10.821-16.499 10.74-26.37-.03-9.589-3.945-18.757-10.85-25.41C155.074 72.572 132.726 72.784 118.81 86.56l-.1 .11L95.46 110.49 72.68 87.72 96.18 63.92C108.905 51.122 126.223 43.949 144.27 44h.26c18.141 .023 35.512 7.334 48.21 20.29 26.11 26.49 25.64 69.76-1.03 96.48Z"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
