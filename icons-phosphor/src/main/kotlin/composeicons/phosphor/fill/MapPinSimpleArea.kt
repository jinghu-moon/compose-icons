package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorFillIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 64C87.999 42.95 104.313 25.501 125.316 24.088c21.003-1.412 39.506 13.695 42.324 34.556C170.458 79.505 156.625 98.98 136 103.19v72.81c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72.81C101.388 99.371 88.02 83 88 64ZM218 146.59c-12.26-6.94-29.12-12.27-48.77-15.42-4.371-.69-8.475 2.294-9.165 6.665-.69 4.371 2.294 8.475 6.665 9.165 17.54 2.82 33 7.63 43.42 13.55C219 165.5 224 171.14 224 176c0 13.36-36.52 32-96 32C68.52 208 32 189.36 32 176c0-4.86 5-10.5 13.85-15.49 10.46-5.92 25.88-10.73 43.42-13.55 2.89-.378 5.346-2.297 6.411-5.01 1.065-2.713 .57-5.791-1.292-8.033-1.862-2.242-4.796-3.295-7.659-2.747-19.65 3.15-36.51 8.48-48.77 15.42C19.81 156.87 16 168.26 16 176c0 31.18 57.71 48 112 48 54.29 0 112-16.82 112-48 0-7.74-3.81-19.13-22-29.41Z"),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
