package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Island: ImageVector
    get() {
        if (_island != null) return _island!!
        _island = phosphorRegularIcon(
            name = "Island",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.25 229c-1.325 1.658-3.256 2.722-5.366 2.957-2.11 .234-4.227-.379-5.884-1.707C226.63 229.95 188.18 200 128 200c-60.18 0-98.64 30-99 30.26-3.455 2.761-8.494 2.2-11.255-1.255C14.984 225.55 15.545 220.511 19 217.75c1.63-1.3 38.52-30.26 98.29-33.45C114.181 171.912 113.07 159.108 114 146.37c1.74-21.71 10.92-50.63 43-72.48C151.526 72.533 145.899 71.897 140.26 72c-19 .62-30.94 11.71-36.5 33.92-.882 3.569-4.084 6.077-7.76 6.08-.654 .003-1.306-.077-1.94-.24-4.285-1.072-6.891-5.414-5.82-9.7C97.49 65.11 121.35 56.64 139.74 56.06c7.304-.159 14.596 .665 21.68 2.45C157.59 52.18 151.99 45.58 144.21 42.26c-10-4.24-22.17-2.39-36.31 5.51C104.034 49.924 99.154 48.536 97 44.67c-2.154-3.866-.766-8.746 3.1-10.9 18.74-10.45 35.72-12.54 50.48-6.2 12.49 5.36 20.73 15.78 25.87 25 6.18-9.64 13.88-16.17 22.39-18.94 11.86-3.87 24.64-.72 38 9.37 3.364 2.711 3.967 7.604 1.363 11.051-2.604 3.447-7.475 4.204-11.003 1.709-8.91-6.73-16.77-9.06-23.35-6.93-7.29 2.35-12.87 10-16.37 16.61 7.196 1.459 14.119 4.033 20.52 7.63 14.61 8.35 32 26.05 32 62.94 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-23.46-8.07-40-24-49-1.856-1.054-3.776-1.989-5.75-2.8 5.037 10.24 6.804 21.782 5.06 33.06-1.257 8.344-4.278 16.324-8.86 23.41-2.553 3.58-7.516 4.429-11.114 1.901-3.597-2.528-4.48-7.486-1.976-11.101 .74-1.09 16.33-24.38-3.26-49.37-27 15.21-41.89 37.25-44.16 65.59-.884 12.278 .412 24.615 3.83 36.44 62.65 1.81 101.52 32.33 103.2 33.66 3.431 2.748 4.003 7.749 1.28 11.2ZM24 140c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C36.536 168 24 155.464 24 140ZM40 140c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12Z"),
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
        return _island!!
    }

private var _island: ImageVector? = null
