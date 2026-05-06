package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorDuotoneIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 176C75.3 176 76.3 118.13 84.2 72h71.6c7.9 46.13 8.9 104-35.8 104Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M149.91 13.53C148.84 10.232 145.767 8 142.3 8h-44.59c-3.467-0-6.54 2.232-7.61 5.53C84.013 33.084 79.266 53.03 75.89 73.23c-7.26 44.25-4.35 75.76 8.65 93.66 6.449 9.097 16.403 15.088 27.46 16.53v48.58h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-48.58c11.06-1.435 21.016-7.428 27.46-16.53 13-17.9 15.92-49.41 8.66-93.66C160.744 53.03 155.997 33.084 149.91 13.53ZM103.59 24h32.83c3.06 10.19 6.77 24.42 9.8 40h-52.42c3.03-15.58 6.73-29.81 9.79-40ZM142.52 157.48C137.38 164.56 130 168 120 168c-10 0-17.37-3.44-22.51-10.51C85.9 141.54 86.55 110 91 80h58c4.47 30 5.12 61.52-6.48 77.48ZM232 52c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM184 20c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM208 100c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null
