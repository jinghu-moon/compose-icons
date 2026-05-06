package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorFillIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 72v43.06L172.42 96.84c3.954-1.977 8.763-.374 10.74 3.58 1.977 3.954 .374 8.763-3.58 10.74l-48 24c-2.481 1.241-5.428 1.109-7.787-.35C121.433 133.351 119.998 130.774 120 128v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C232 70.562 185.438 24 128 24 70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM214.62 198.62c9.156-9.15 11.898-22.916 6.946-34.876C216.614 151.784 204.945 143.985 192 143.985c-12.945 0-24.614 7.799-29.566 19.759-4.952 11.96-2.21 25.726 6.946 34.876-8.424 5.382-14.529 13.722-17.11 23.38-.618 2.393-.095 4.937 1.417 6.893 1.512 1.955 3.842 3.102 6.313 3.107h64c2.485-0 4.829-1.155 6.343-3.126 1.514-1.971 2.027-4.533 1.387-6.934-2.595-9.635-8.698-17.953-17.11-23.32Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
