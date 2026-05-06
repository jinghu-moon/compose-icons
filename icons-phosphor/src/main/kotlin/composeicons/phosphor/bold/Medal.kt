package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorBoldIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 96C220.024 53.498 190.93 16.511 149.618 6.524 108.306-3.464 65.529 16.149 46.136 53.969 26.742 91.789 35.78 137.971 68 165.69v74.31c0 4.159 2.155 8.022 5.693 10.208 3.539 2.186 7.957 2.384 11.677 .522L128 229.42l42.64 21.31c3.719 1.857 8.134 1.656 11.669-.529 3.536-2.185 5.689-6.045 5.691-10.201v-74.31C208.317 148.236 220.003 122.784 220 96ZM60 96C60 58.445 90.445 28 128 28c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68C90.461 163.961 60.039 133.539 60 96ZM164 220.59 133.36 205.27c-3.38-1.691-7.36-1.691-10.74 0L92 220.58v-39.92c23.003 9.781 48.997 9.781 72 0ZM128 148c28.719 0 52-23.281 52-52C180 67.281 156.719 44 128 44 99.281 44 76 67.281 76 96c.033 28.705 23.295 51.967 52 52ZM128 68c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
