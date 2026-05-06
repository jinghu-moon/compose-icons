package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorRegularIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M149.26 159.26C155.09 173.82 163.5 176 168 176c4.5 0 12.91-2.18 18.74-16.74C190.13 150.78 192 139.68 192 128c0-11.68-1.87-22.78-5.26-31.26C180.91 82.18 172.5 80 168 80c-4.5 0-12.91 2.18-18.74 16.74C145.87 105.22 144 116.32 144 128c0 11.68 1.87 22.78 5.26 31.26ZM168 96.2c2.62 2.06 8 13 8 31.8 0 18.8-5.38 29.74-8 31.8-2.62-2.06-8-13-8-31.8 0-18.8 5.38-29.74 8-31.8ZM232 216h-35.59C213.12 197.73 224 165.47 224 128 224 69.68 197.65 24 164 24h-72C58.35 24 32 69.68 32 128c0 58.32 26.35 104 60 104h140c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM193.74 63.93C202.93 80.91 208 103.67 208 128c0 24.33-5.07 47.09-14.26 64.07C185.38 207.5 174.82 216 164 216c-10.82 0-21.38-8.5-29.74-23.93C125.07 175.09 120 152.33 120 128c0-24.33 5.07-47.09 14.26-64.07C142.62 48.5 153.18 40 164 40c10.82 0 21.38 8.5 29.74 23.93ZM48 128c0-2.5 .07-5 .17-7.44L80 97.83l24.43 17.45c-.28 4.16-.43 8.41-.43 12.72-.025 11.238 1.003 22.454 3.07 33.5l-22.42-16c-2.782-1.987-6.518-1.987-9.3 0l-23.74 17C49.168 151.164 47.957 139.596 48 128ZM62.26 63.93C70.62 48.5 81.18 40 92 40h39.59c-11.9 13-20.84 33.12-25 57.16L84.65 81.49c-2.782-1.987-6.518-1.987-9.3 0L50.49 99.25C52.85 86 56.83 74 62.26 63.93ZM62.26 192.07c-2.301-4.29-4.287-8.741-5.94-13.32L80 161.83l33.94 24.24c4.6 12 10.6 22.22 17.65 29.93h-39.59C81.18 216 70.62 207.5 62.26 192.07Z"),
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
