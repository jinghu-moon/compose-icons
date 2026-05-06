package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorThinIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 172c13 0 20-22.67 20-44 0-21.33-7-44-20-44-13 0-20 22.67-20 44 0 21.33 7 44 20 44ZM168 92c4.89 0 12 14 12 36 0 22-7.11 36-12 36-4.89 0-12-14-12-36 0-22 7.11-36 12-36ZM232 220h-45.77c6.72-5.11 12.85-12.59 18.06-22.21C214.42 179.08 220 154.3 220 128c0-26.3-5.58-51.08-15.71-69.79C193.73 38.73 179.43 28 164 28h-72C76.57 28 62.27 38.73 51.71 58.21 41.58 76.92 36 101.7 36 128c0 26.3 5.58 51.08 15.71 69.79C62.27 217.27 76.57 228 92 228h140c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM197.25 62C206.76 79.58 212 103 212 128c0 25-5.24 48.42-14.75 66-9.09 16.78-20.9 26-33.25 26-12.35 0-24.16-9.24-33.25-26C121.24 176.42 116 153 116 128c0-25 5.24-48.42 14.75-66C139.84 45.22 151.65 36 164 36c12.35 0 24.16 9.24 33.25 26ZM58.75 62C67.84 45.24 79.65 36 92 36h49.77c-6.72 5.11-12.85 12.59-18.06 22.21-7 12.93-11.83 28.77-14.14 46L82.33 84.75c-1.393-.998-3.267-.998-4.66 0L45.17 108C47.19 90.66 51.84 74.78 58.75 62ZM44.26 118.44 80 92.92l28.59 20.42c-.39 4.81-.59 9.71-.59 14.66-.062 14.465 1.726 28.878 5.32 42.89l-31-22.14c-1.393-.998-3.267-.998-4.66 0L49.13 169.13C45.66 155.697 43.936 141.873 44 128q0-4.81 .26-9.56ZM92 220C79.65 220 67.84 210.76 58.75 194c-2.87-5.368-5.276-10.972-7.19-16.75L80 156.92l37.32 26.65c1.795 4.883 3.93 9.635 6.39 14.22 5.21 9.62 11.34 17.1 18.06 22.21Z"),
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
        return _tire!!
    }

private var _tire: ImageVector? = null
