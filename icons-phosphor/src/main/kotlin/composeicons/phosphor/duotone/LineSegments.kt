package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorDuotoneIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M57 183c9.349 9.381 9.331 24.562-.039 33.921-9.37 9.359-24.551 9.359-33.921 0C13.669 207.562 13.651 192.381 23 183c4.503-4.519 10.62-7.059 17-7.059 6.38 0 12.497 2.54 17 7.059ZM79 79c-9.349 9.381-9.331 24.562 .039 33.921 9.37 9.359 24.551 9.359 33.921 0C122.331 103.562 122.349 88.381 113 79 108.497 74.481 102.38 71.941 96 71.941c-6.38 0-12.497 2.54-17 7.059ZM143 143c-9.349 9.381-9.331 24.562 .039 33.921 9.37 9.359 24.551 9.359 33.921 0 9.37-9.359 9.388-24.54 .039-33.921-4.503-4.519-10.62-7.059-17-7.059-6.38 0-12.497 2.54-17 7.059ZM233 39c-9.381-9.349-24.562-9.331-33.921 .039-9.359 9.37-9.359 24.551 0 33.921 9.359 9.37 24.54 9.388 33.921 .039 4.519-4.503 7.059-10.62 7.059-17 0-6.38-2.54-12.497-7.059-17Z"),
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
                pathData = parseSvgPathData("M238.64 33.36c-6.001-6.003-14.142-9.375-22.63-9.375-8.488 0-16.629 3.372-22.63 9.375h0c-6.003 6.001-9.375 14.142-9.375 22.63 0 8.488 3.372 16.629 9.375 22.63 .29 .29 .6 .57 .9 .85l-26.63 49.46c-8.119-1.98-16.69-.725-23.9 3.5L123.57 112.25c8.215-13.884 4.81-31.712-7.943-41.592C102.874 60.779 84.761 61.937 73.37 73.36h0c-6.003 6.001-9.375 14.142-9.375 22.63 0 8.488 3.372 16.629 9.375 22.63 .29 .29 .59 .57 .89 .85L47.63 168.94c-10.872-2.676-22.351 .525-30.27 8.44h0c-12.495 12.498-12.493 32.757 .003 45.253 12.497 12.496 32.757 12.496 45.253 0 12.497-12.496 12.498-32.756 .003-45.253-.29-.29-.6-.57-.9-.85L88.35 127.07c2.504 .613 5.072 .925 7.65 .93 5.713 .007 11.324-1.516 16.25-4.41l20.18 20.18c-8.441 14.326-4.504 32.73 9.06 42.348 13.564 9.618 32.234 7.245 42.961-5.46 10.727-12.705 9.935-31.509-1.821-43.268-.29-.29-.59-.57-.89-.85L208.37 87.08c2.498 .609 5.059 .918 7.63 .92 12.94-.002 24.605-7.797 29.558-19.752 4.953-11.955 2.219-25.716-6.928-34.868ZM51.3 211.33c-6.252 6.249-16.386 6.247-22.635-.005-6.249-6.252-6.247-16.386 .005-22.635h0c6.252-6.249 16.386-6.247 22.635 .005 6.249 6.252 6.247 16.386-.005 22.635ZM84.68 107.33c-3.001-3.001-4.688-7.071-4.688-11.315 0-4.244 1.686-8.314 4.688-11.315h0c6.249-6.247 16.379-6.247 22.627 .002 6.248 6.248 6.248 16.378 0 22.627-6.248 6.248-16.378 6.249-22.627 .002ZM171.32 171.33c-6.249 6.249-16.381 6.249-22.63 0-6.249-6.249-6.249-16.381 0-22.63h0c6.249-6.249 16.381-6.249 22.63 0 6.249 6.249 6.249 16.381 0 22.63ZM227.32 67.33c-6.257 6.246-16.394 6.237-22.64-.02-6.246-6.257-6.237-16.394 .02-22.64h0c6.252-6.249 16.386-6.247 22.635 .005 6.249 6.252 6.247 16.386-.005 22.635Z"),
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
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
