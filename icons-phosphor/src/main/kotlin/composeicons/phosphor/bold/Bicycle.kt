package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bicycle: ImageVector
    get() {
        if (_bicycle != null) return _bicycle!!
        _bicycle = phosphorBoldIcon(
            name = "Bicycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 108c-5.127-.003-10.226 .756-15.13 2.25L168.89 76h23.11c2.209 0 4 1.791 4 4 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C220 64.536 207.464 52 192 52h-44c-4.283 .008-8.237 2.298-10.376 6.01-2.138 3.711-2.136 8.281 .006 11.99l8.14 14h-36.21L94.37 58C92.23 54.294 88.279 52.008 84 52h-32C45.373 52 40 57.373 40 64c0 6.627 5.373 12 12 12h25.11L88.18 95 74 112.89C50.032 101.643 21.44 110.133 7.493 132.638c-13.946 22.505-8.824 51.888 11.914 68.346 20.738 16.458 50.517 14.773 69.266-3.92 18.749-18.693 20.523-48.466 4.127-69.254l8.37-10.57L118 146.05c1.999 3.997 6.054 6.551 10.522 6.63 4.468 .078 8.61-2.333 10.748-6.257 2.138-3.924 1.919-8.711-.569-12.423L123.56 108h36.21l8.39 14.38c-18.034 17.209-21.319 44.796-7.83 65.759 13.489 20.963 39.957 29.404 63.092 20.122 23.135-9.282 36.428-33.677 31.688-58.15C250.369 125.637 228.928 107.972 204 108ZM80 160c.002 11.905-7.525 22.51-18.763 26.437-11.239 3.927-23.732 .318-31.145-8.997-7.413-9.315-8.126-22.3-1.776-32.37 6.35-10.07 18.374-15.024 29.975-12.35L42.59 152.55c-4.115 5.197-3.237 12.745 1.96 16.86 5.197 4.115 12.745 3.237 16.86-1.96L77.11 147.62c1.905 3.849 2.894 8.086 2.89 12.38ZM204 188c-10.38-.005-19.905-5.751-24.75-14.931-4.845-9.18-4.213-20.287 1.64-28.859l12.74 21.84c3.437 5.482 10.601 7.253 16.196 4.002 5.595-3.251 7.605-10.352 4.544-16.052L201.62 132.16c.79-.07 1.58-.11 2.38-.11 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
