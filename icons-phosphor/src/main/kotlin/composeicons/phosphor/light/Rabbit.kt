package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = phosphorLightIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M110 164c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM156 154c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM214 188c.001 20.391-12.381 38.739-31.291 46.369-18.91 7.63-40.558 3.012-54.709-11.669-12.691 13.198-31.58 18.403-49.24 13.569C61.1 231.436 47.494 217.336 43.294 199.515c-4.201-17.821 1.675-36.513 15.316-48.725 1.002-7.576 3.239-14.937 6.62-21.79C55.757 110.241 48.842 90.297 44.67 69.7c-3-15.62-5-36.91 2.69-49.62C50.955 13.713 57.76 9.84 65.07 10 89.91 10 105.23 52.92 114 91.43c9.237-1.901 18.763-1.901 28 0C150.77 52.92 166.09 10 190.93 10c7.316-.154 14.123 3.732 17.71 10.11 7.68 12.71 5.7 34 2.69 49.62C207.155 90.316 200.24 110.25 190.77 129c3.378 6.844 5.614 14.194 6.62 21.76 10.599 9.473 16.643 23.025 16.61 37.24ZM153.56 94.83c7.977 3.132 15.312 7.701 21.64 13.48 2.921 2.677 5.614 5.594 8.05 8.72C199.87 81.2 207 40.54 198.37 26.32 196.941 23.556 194.039 21.87 190.93 22c-12.83 0-27.32 28.4-37.37 72.83ZM72.75 117c2.42-3.124 5.096-6.04 8-8.72 6.328-5.779 13.663-10.348 21.64-13.48C92.39 50.4 77.9 22 65.07 22c-3.109-.13-6.011 1.556-7.44 4.32C49 40.54 56.13 81.2 72.75 117ZM202 188c.019-11.462-5.154-22.316-14.07-29.52-1.248-1.016-2.04-2.488-2.2-4.09-2.927-29.684-27.892-52.308-57.72-52.308-29.828 0-54.793 22.624-57.72 52.308-.155 1.598-.943 3.068-2.19 4.08-11.073 8.903-16.255 23.239-13.432 37.164 2.822 13.925 13.177 25.112 26.843 29.001 13.666 3.888 28.359-.171 38.09-10.524l-11.42-9.5c-1.731-1.344-2.591-3.525-2.244-5.689 .347-2.164 1.847-3.967 3.911-4.702 2.065-.735 4.366-.286 6.003 1.171L128 205.5l12.16-10.11c1.637-1.458 3.938-1.907 6.003-1.171 2.065 .735 3.564 2.538 3.911 4.702 .347 2.164-.513 4.345-2.244 5.689l-11.42 9.5c10.695 11.293 27.193 14.928 41.644 9.175C192.505 217.533 201.992 203.554 202 188Z"),
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
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
