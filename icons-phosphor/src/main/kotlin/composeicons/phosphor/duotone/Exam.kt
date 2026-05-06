package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorDuotoneIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 56v160L192 200l-32 16L128 200 96 216 64 200 32 216v-160c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v160c-.002 2.774 1.433 5.351 3.793 6.81 2.359 1.459 5.306 1.591 7.787 .35L64 208.94l28.42 14.22c2.253 1.128 4.907 1.128 7.16 0L128 208.94l28.42 14.22c2.253 1.128 4.907 1.128 7.16 0L192 208.94l28.42 14.22c2.481 1.241 5.428 1.109 7.787-.35 2.359-1.459 3.795-4.036 3.793-6.81v-160c0-8.837-7.163-16-16-16ZM216 203.06 195.58 192.84c-2.253-1.128-4.907-1.128-7.16 0L160 207.06 131.58 192.84c-2.253-1.128-4.907-1.128-7.16 0L96 207.06 67.58 192.84c-2.253-1.128-4.907-1.128-7.16 0L40 203.06v-147.06h176ZM60.42 167.16c1.899 .951 4.098 1.108 6.112 .436 2.015-.672 3.679-2.116 4.628-4.016L76.94 152h38.12l5.78 11.58c1.977 3.954 6.786 5.557 10.74 3.58 3.954-1.977 5.557-6.786 3.58-10.74l-32-64C101.807 89.705 99.034 87.989 96 87.989c-3.034 0-5.807 1.716-7.16 4.431l-32 64c-.951 1.899-1.108 4.098-.436 6.112 .672 2.015 2.116 3.679 4.016 4.628ZM96 113.89 107.06 136h-22.12ZM136 128c0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8Z"),
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
        return _exam!!
    }

private var _exam: ImageVector? = null
