package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorThinIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185.85 35.7C167.74 28.29 146.17 26.14 125.09 29.64 102.5 33.4 83 43.1 68.62 57.7 58 68.5 45.11 89.65 44.06 129c-.69 25.95 4.29 54.29 13.3 75.79C65.8 224.92 76.51 236 87.52 236c20.5 0 29.78-18.13 39.61-37.32 7.19-14.05 14.63-28.57 26.86-36.87 6.25-4.23 14.39-7.37 23-10.7 22.72-8.76 51-19.67 51-57.94C228 67.6 212.64 46.66 185.85 35.7ZM174.13 143.64c-9.06 3.5-17.63 6.8-24.63 11.55-13.93 9.45-22.2 25.6-29.49 39.84-9.06 17.69-16.88 33-32.49 33-7.36 0-15.88-9.83-22.78-26.3C56.14 181.22 51.4 154.12 52.06 129.24c1-36.75 12.64-56.12 22.26-65.9C93.18 44.15 119.85 36.11 144.65 36.11c13.88 0 27.18 2.52 38.17 7C215.17 56.34 220 80.15 220 93.17 220 126 196.68 135 174.13 143.64Z"),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
