package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorFillIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 80v43.47l36.12 21.67c3.789 2.275 5.015 7.191 2.74 10.98-2.275 3.789-7.191 5.015-10.98 2.74l-40-24C121.472 133.413 119.999 130.809 120 128v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM227.06 56.61c-2.989-1.24-6.431-.557-8.72 1.73L206 70.71c-3.23-3.51-6.56-7-10.1-10.59C158.667 22.883 98.388 22.589 60.793 59.461 23.199 96.333 22.324 156.607 58.831 194.555c36.508 37.948 96.77 39.405 135.069 3.265 3.214-3.038 3.358-8.106 .32-11.32-3.038-3.214-8.106-3.358-11.32-.32-31.912 30.112-82.123 28.901-112.547-2.714C39.929 151.851 40.646 101.63 71.961 70.897c31.315-30.733 81.54-30.509 112.579 .503 3.54 3.58 6.87 7.1 10.11 10.63L178.34 98.34c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h40c4.418 0 8-3.582 8-8v-40c-.001-3.236-1.95-6.152-4.94-7.39Z"),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
