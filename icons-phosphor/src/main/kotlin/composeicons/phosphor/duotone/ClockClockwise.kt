package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorDuotoneIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 128c0 48.601-39.399 88-88 88C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88Z"),
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
                pathData = parseSvgPathData("M136 80v43.47l36.12 21.67c3.789 2.275 5.015 7.191 2.74 10.98-2.275 3.789-7.191 5.015-10.98 2.74l-40-24C121.472 133.413 119.999 130.809 120 128v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM224 56c-4.418 0-8 3.582-8 8v18C209.65 74.64 203.17 67.55 195.88 60.17 158.647 22.933 98.368 22.639 60.773 59.511 23.179 96.383 22.304 156.657 58.811 194.605c36.508 37.948 96.77 39.405 135.069 3.265 3.214-3.038 3.358-8.106 .32-11.32-3.038-3.214-8.106-3.358-11.32-.32-31.924 30.086-82.122 28.852-112.529-2.766C39.944 151.846 40.67 101.638 71.978 70.912c31.309-30.726 81.521-30.508 112.562 .488C192.68 79.64 199.81 87.58 207 96h-23c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8Z"),
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
