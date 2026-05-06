package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorFillIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48h-64c-17.673 0-32 14.327-32 32v87.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-87.98C120 62.327 105.673 48 88 48h-64c-4.418 0-8 3.582-8 8v144c0 4.418 3.582 8 8 8h72c13.231-0 23.967 10.709 24 23.94-.066 3.347 1.986 6.372 5.12 7.55 2.465 .951 5.24 .624 7.416-.874 2.176-1.498 3.472-3.974 3.464-6.616 0-13.255 10.745-24 24-24h72c4.418 0 8-3.582 8-8v-144c0-4.418-3.582-8-8-8ZM208 168h-39.73c-4.283 .058-7.883-3.202-8.25-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527h39.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527ZM208 136h-39.73c-4.283 .058-7.883-3.202-8.25-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527h39.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527ZM208 104h-39.73c-4.291 .068-7.903-3.195-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C163.664 88.91 165.783 87.995 168 88h39.73c4.291-.068 7.903 3.195 8.27 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
