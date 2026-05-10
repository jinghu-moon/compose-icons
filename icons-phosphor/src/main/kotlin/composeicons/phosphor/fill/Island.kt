package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Island: ImageVector
    get() {
        if (_island != null) return _island!!
        _island = phosphorFillIcon(
            name = "Island",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.55 226.65c-1.125 3.206-4.153 5.351-7.55 5.35h-208c-3.4 .003-6.43-2.143-7.555-5.351-1.126-3.208-.101-6.777 2.555-8.899 1.63-1.3 38.53-30.26 98.29-33.45C114.182 171.912 113.071 159.108 114 146.37c1.73-21.71 10.91-50.63 42.95-72.48-4.912-1.193-9.945-1.821-15-1.87h-1.67c-19 .62-30.94 11.71-36.5 33.92-.892 3.568-4.102 6.069-7.78 6.06-.674 .008-1.347-.072-2-.24-4.285-1.072-6.891-5.414-5.82-9.7C97.43 65.11 121.29 56.64 139.68 56.06c7.304-.16 14.596 .665 21.68 2.45C157.54 52.18 151.94 45.58 144.15 42.26c-10-4.24-22.17-2.39-36.31 5.51-3.866 2.154-8.746 .766-10.9-3.1-2.154-3.866-.766-8.746 3.1-10.9 18.74-10.45 35.72-12.54 50.48-6.2 12.49 5.36 20.73 15.78 25.88 25 6.17-9.64 13.87-16.17 22.38-18.94 11.86-3.87 24.64-.72 38 9.37 3.364 2.711 3.967 7.604 1.363 11.051-2.604 3.447-7.475 4.204-11.003 1.709-8.91-6.73-16.77-9.06-23.34-6.93-7.3 2.35-12.87 10-16.38 16.61 7.216 1.453 14.161 4.027 20.58 7.63 14.61 8.35 32 26.05 32 62.94 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-23.46-8.06-40-24-49-1.856-1.054-3.776-1.989-5.75-2.8 5.037 10.24 6.804 21.782 5.06 33.06-1.257 8.344-4.278 16.324-8.86 23.41-2.553 3.58-7.516 4.429-11.114 1.901-3.597-2.528-4.48-7.486-1.976-11.101 .75-1.09 16.33-24.38-3.26-49.37-27 15.21-41.89 37.25-44.16 65.59-.884 12.278 .412 24.615 3.83 36.44 62.65 1.81 101.52 32.33 103.2 33.66 2.644 2.108 3.677 5.651 2.58 8.85ZM52 168c15.464 0 28-12.536 28-28C80 124.536 67.464 112 52 112c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28Z"),
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
