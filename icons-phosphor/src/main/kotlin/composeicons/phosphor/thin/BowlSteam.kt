package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BowlSteam: ImageVector
    get() {
        if (_bowlSteam != null) return _bowlSteam!!
        _bowlSteam = phosphorThinIcon(
            name = "BowlSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 116h-192c-2.209 0-4 1.791-4 4 .068 38.153 21.772 72.965 56 89.82v6.18c0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-6.18C206.228 192.965 227.932 158.153 228 120c0-2.209-1.791-4-4-4ZM166.33 203.66c-1.422 .653-2.332 2.075-2.33 3.64v8.7c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4v-8.7c.002-1.565-.908-2.987-2.33-3.64C58.321 189.213 37.651 158.483 36.09 124h183.82c-1.561 34.483-22.231 65.213-53.58 79.66ZM164.88 57.5c5.56-6.92 8-12.89 6.83-16.81-1-3.54-4.9-4.87-4.94-4.88-2.107-.668-3.273-2.918-2.605-5.025 .668-2.107 2.918-3.273 5.025-2.605 .32 .1 7.84 2.52 10.16 10.11 2.05 6.72-.72 14.87-8.23 24.22-5.56 6.91-8 12.88-6.83 16.8 1 3.54 4.9 4.87 4.94 4.88 1.88 .601 3.04 2.483 2.733 4.432-.307 1.949-1.99 3.384-3.963 3.378-.403-.001-.804-.062-1.19-.18-.32-.1-7.84-2.52-10.16-10.11-2.05-6.71 .72-14.87 8.23-24.21ZM124.88 57.5c5.56-6.92 8-12.89 6.83-16.81-1-3.54-4.9-4.87-4.94-4.88-2.107-.668-3.273-2.918-2.605-5.025 .668-2.107 2.918-3.273 5.025-2.605 .32 .1 7.84 2.52 10.16 10.11 2.05 6.72-.72 14.87-8.23 24.22-5.56 6.91-8 12.88-6.83 16.8 1 3.54 4.9 4.87 4.94 4.88 1.88 .601 3.04 2.483 2.733 4.432-.307 1.949-1.99 3.384-3.963 3.378-.403-.001-.804-.062-1.19-.18-.32-.1-7.84-2.52-10.16-10.11-2.05-6.71 .72-14.87 8.23-24.21ZM84.88 57.5c5.56-6.92 8-12.89 6.83-16.81-1-3.54-4.9-4.87-4.94-4.88-2.107-.668-3.273-2.918-2.605-5.025 .668-2.107 2.918-3.273 5.025-2.605 .32 .1 7.84 2.52 10.16 10.11 2.05 6.72-.72 14.87-8.23 24.22-5.56 6.91-8 12.88-6.83 16.8 1 3.54 4.9 4.87 4.94 4.88 1.88 .601 3.04 2.483 2.733 4.432C91.656 90.572 89.973 92.006 88 92c-.403-.001-.804-.062-1.19-.18C86.49 91.72 78.97 89.3 76.65 81.71 74.6 75 77.37 66.84 84.88 57.5Z"),
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
        return _bowlSteam!!
    }

private var _bowlSteam: ImageVector? = null
