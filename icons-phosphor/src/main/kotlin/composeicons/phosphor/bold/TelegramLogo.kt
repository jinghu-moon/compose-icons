package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorBoldIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.49 23.16c-3.65-3.148-8.742-4.017-13.23-2.26L15.6 100.21C8.044 103.153 3.342 110.735 4.065 118.812c.723 8.077 6.697 14.704 14.655 16.258L68 144.74v55.26c-0 8.156 4.953 15.496 12.516 18.548 7.564 3.052 16.223 1.205 21.884-4.668l22.67-23.51L162.35 223c5.29 4.652 12.638 6.178 19.343 4.017 6.705-2.161 11.779-7.691 13.357-14.557L235.67 35.91c1.077-4.696-.532-9.603-4.18-12.75ZM139.41 77.52 77.22 122.09 42.79 115.34ZM92 190.06v-28.71l15 13.15ZM173.16 200.58 99.28 135.81 205.59 59.63Z"),
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
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
