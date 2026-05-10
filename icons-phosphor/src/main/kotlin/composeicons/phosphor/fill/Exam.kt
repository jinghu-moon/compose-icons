package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorFillIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 113.89 107.06 136h-22.12ZM232 56v160c.002 2.774-1.433 5.351-3.793 6.81-2.359 1.459-5.306 1.591-7.787 .35L192 208.94l-28.42 14.22c-2.253 1.128-4.907 1.128-7.16 0L128 208.94 99.58 223.16c-2.253 1.128-4.907 1.128-7.16 0L64 208.94 35.58 223.16c-2.481 1.241-5.428 1.109-7.787-.35C25.433 221.351 23.998 218.774 24 216v-160C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM135.16 156.42l-32-64C101.807 89.705 99.034 87.989 96 87.989c-3.034 0-5.807 1.716-7.16 4.431l-32 64c-1.977 3.954-.374 8.763 3.58 10.74 3.954 1.977 8.763 .374 10.74-3.58L76.94 152h38.12l5.78 11.58c1.977 3.954 6.786 5.557 10.74 3.58 3.954-1.977 5.557-6.786 3.58-10.74ZM208 128c0-4.418-3.582-8-8-8h-16v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16c4.418 0 8-3.582 8-8Z"),
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
