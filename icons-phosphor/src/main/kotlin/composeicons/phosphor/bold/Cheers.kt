package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cheers: ImageVector
    get() {
        if (_cheers != null) return _cheers!!
        _cheers = phosphorBoldIcon(
            name = "Cheers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.89 210.08l-13.78 3.69-8.57-32c16.897-10.087 25.059-30.153 20-49.17C197.73 85 171.23 43.28 170.11 41.53c-2.777-4.332-8.006-6.412-13-5.17l-16.9 4.22c0-5.34-.18-8.63-.2-9.13-.244-5.297-3.936-9.805-9.08-11.09L98.93 12.36c-4.994-1.242-10.223 .838-13 5.17C84.77 19.28 58.27 61 45.51 108.6c-5.068 19.006 3.072 39.069 19.95 49.17l-8.57 32L43.11 186.08c-6.401-1.718-12.982 2.079-14.7 8.48-1.718 6.401 2.079 12.982 8.48 14.7l48 12.86c6.401 1.718 12.982-2.079 14.7-8.48 1.718-6.401-2.079-12.982-8.48-14.7l-11-3 8.57-32c13.646-.224 26.423-6.738 34.62-17.65q1 4.53 2.23 9c5.069 19.025 22.144 32.377 41.83 32.71l8.57 32-11 3c-6.401 1.718-10.198 8.299-8.48 14.7 1.718 6.401 8.299 10.198 14.7 8.48l48-12.86c6.401-1.718 10.198-8.299 8.48-14.7-1.718-6.401-8.299-10.198-14.7-8.48ZM162.59 77l-22.82 5.71c-.21-6.92-.19-12.83-.1-17.24l14.62-3.65c2.21 3.79 5.09 8.97 8.3 15.18ZM101.72 37.8l14.46 3.61c0 4 0 9.25-.24 15.34 0 .92-.11 2.2-.17 3.82L92.51 54.76C96.08 47.78 99.3 42 101.72 37.8ZM82.83 139.31C72.164 136.45 65.834 125.487 68.69 114.82 72.245 101.873 76.723 89.197 82.09 76.89l31.94 8c-1.333 13.603-3.582 27.1-6.73 40.4-2.913 10.607-13.846 16.871-24.47 14.02ZM148.67 149.17C145.083 135.335 142.621 121.232 141.31 107l31.82-8c5.708 12.872 10.448 26.152 14.18 39.73 2.858 10.67-3.475 21.637-14.145 24.495-10.67 2.858-21.637-3.475-24.495-14.145ZM184.67 39.79c-2.09-6.285 1.307-13.074 7.59-15.17l12-4c6.213-1.863 12.782 1.549 14.831 7.703 2.049 6.154-1.162 12.823-7.251 15.057l-12 4c-6.285 2.09-13.074-1.307-15.17-7.59ZM236 72c0 6.627-5.373 12-12 12h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12c6.627 0 12 5.373 12 12ZM28.62 20.21c2.096-6.283 8.885-9.68 15.17-7.59l12 4c4.189 1.256 7.364 4.692 8.285 8.967 .921 4.276-.557 8.714-3.858 11.583-3.301 2.87-7.901 3.716-12.007 2.209l-12-4C29.927 33.284 26.53 26.495 28.62 20.21ZM36 76h-12C17.373 76 12 70.627 12 64 12 57.373 17.373 52 24 52h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _cheers!!
    }

private var _cheers: ImageVector? = null
