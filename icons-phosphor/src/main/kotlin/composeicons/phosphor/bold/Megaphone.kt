package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorBoldIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 120C251.967 91.295 228.705 68.033 200 68h-39.68C156.88 67.79 107.72 64 60.86 24.7 54.909 19.704 46.602 18.606 39.558 21.886 32.514 25.166 28.007 32.23 28 40v160c-.049 7.783 4.466 14.873 11.54 18.12 7.043 3.325 15.379 2.226 21.32-2.81C84.845 195.147 113.381 181.129 144 174.47v26.2c-.001 6.686 3.339 12.93 8.9 16.64 .444 .299 .908 .566 1.39 .8l14.44 7.06c5.412 3.24 12.034 3.737 17.869 1.341 5.835-2.396 10.197-7.403 11.771-13.511l11.09-41.82C234.115 166.59 251.995 145.078 252 120ZM52 191.63v-143.23c36.17 28.07 72.17 38.1 92 41.66v59.94c-19.83 3.52-55.83 13.55-92 41.63ZM176.39 202.2 168 198.1v-26.1h16.4ZM200 148h-32v-56h32c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
