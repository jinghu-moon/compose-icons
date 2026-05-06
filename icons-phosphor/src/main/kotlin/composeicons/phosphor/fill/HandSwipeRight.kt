package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandSwipeRight: ImageVector
    get() {
        if (_handSwipeRight != null) return _handSwipeRight!!
        _handSwipeRight = phosphorFillIcon(
            name = "HandSwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 128v50.93c0 25.59-8.48 39.93-8.84 40.65-1.357 2.711-4.129 4.422-7.16 4.42h-136c-2.838 0-5.463-1.503-6.9-3.95L26.15 160c-2.19-3.791-2.732-8.313-1.498-12.514 1.234-4.201 4.135-7.712 8.028-9.716 7.66-4 17.1-.84 21.4 6.62l21 36.44c1.194 2.145 3.56 3.364 6 3.09h.12c3.97-.683 6.853-4.152 6.8-8.18v-119.74c-.005-4.38 1.786-8.571 4.955-11.595 3.169-3.024 7.44-4.616 11.815-4.405 8.61 .4 15.23 7.82 15.23 16.43v71.57c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.516 3.791 2.294 6.003 2.147 4.268-.367 7.528-3.967 7.47-8.25v-15.75c-.005-4.38 1.786-8.571 4.955-11.595 3.169-3.024 7.44-4.616 11.815-4.405 8.61 .4 15.23 7.82 15.23 16.43v23.57c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.516 3.791 2.294 6.003 2.147 4.265-.371 7.523-3.969 7.47-8.25v-7.28c0-8.61 6.62-16 15.23-16.43 4.368-.21 8.632 1.376 11.8 4.391 3.168 3.015 4.964 7.195 4.97 11.569ZM253.66 50.34l-32-32c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L228.69 48h-52.69c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h52.69L210.34 82.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _handSwipeRight!!
    }

private var _handSwipeRight: ImageVector? = null
