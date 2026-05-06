package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorLightIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.57 133.77l-32-80h0c-1.091-2.725-3.993-4.261-6.86-3.63L134 64.52v-24.52c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v27.19l-67.3 15c-1.936 .43-3.534 1.789-4.27 3.63h0 0l-32 80c-.276 .694-.421 1.433-.43 2.18 0 21.86 23.31 30 38 30 14.69 0 38-8.14 38-30-.002-.764-.148-1.52-.43-2.23L64.19 92.33 122 79.48v130.52h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-133.19L190.21 64.32l-27.78 69.45c-.282 .71-.428 1.466-.43 2.23 0 21.86 23.31 30 38 30 14.69 0 38-8.14 38-30-.002-.764-.148-1.52-.43-2.23ZM56 186c-6.115-.048-12.121-1.615-17.48-4.56-5.37-3.13-8.15-7.18-8.49-12.37L56.03 104.16l26 64.91C81.06 182.85 62.58 186 56 186ZM200 154c-6.115-.048-12.121-1.615-17.48-4.56-5.37-3.13-8.15-7.18-8.49-12.37l26-64.91 26 64.91C225.06 150.85 206.58 154 200 154Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
