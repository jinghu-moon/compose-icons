package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorDuotoneIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M67.41 142.56C35.71 129.52 45.41 32.07 78 32c33.82 .05 14 58.26-10.59 110.56Z"),
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
                pathData = parseSvgPathData("M232 168h-168.14c2.66-5.24 5.33-10.63 8-16.11 14.94 1.65 32.58-8.78 52.66-31.14 5 13.46 14.45 30.93 30.58 31.25 9.09 .18 18.11-5.2 27.42-16.37C189.31 143.75 203.3 152 232 152c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-30.43 0-39.43-10.45-40-16.11 .186-3.533-2.07-6.735-5.46-7.75-3.518-1.057-7.307 .373-9.25 3.49C165.23 134.17 158 136.06 155.38 136c-8.26-.16-16.66-19.52-19.54-33.42-.627-3.039-2.956-5.441-5.974-6.163-3.018-.722-6.181 .367-8.116 2.793C101.54 124.55 88 133.08 79.57 135.29 88.06 116.42 94.4 99.85 98.46 85.9c6.82-23.44 7.32-39.83 1.51-50.1C96.97 30.42 90.63 24 77.91 24 61.85 24 49.18 39.18 43.14 65.65c-3.59 15.71-4.18 33.21-1.62 48 2.56 14.79 7.87 25.55 15.59 31.94C53.38 153.31 49.58 160.85 45.88 168h-21.88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h13.41C26.09 205 17.29 219.64 17.15 219.88c-1.553 2.452-1.655 5.553-.268 8.103 1.387 2.55 4.046 4.148 6.949 4.176 2.902 .029 5.592-1.517 7.029-4.039 .15-.26 11.27-18.79 24.7-44.12h176.44c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM58.74 69.21C62.72 51.74 70.43 40 77.91 40c5.33 0 7.1 1.86 8.13 3.67 3 5.33 6.52 24.19-21.66 86.39C56.12 118.78 53.31 93 58.74 69.21Z"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
