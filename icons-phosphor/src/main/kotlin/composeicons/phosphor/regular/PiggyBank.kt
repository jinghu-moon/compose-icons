package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorRegularIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 116c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM152 64h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM248 112v32c0 13.255-10.745 24-24 24h-2.36l-16.21 45.38c-2.274 6.369-8.307 10.621-15.07 10.62h-12.72c-6.763 .001-12.796-4.251-15.07-10.62L160.65 208h-57.3l-1.92 5.38C99.156 219.749 93.123 224.001 86.36 224h-12.72c-6.763 .001-12.796-4.251-15.07-10.62L46 178.22C34.042 164.686 26.554 147.79 24.56 129.84 19.298 132.604 16.002 138.056 16 144c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C.025 129.321 10.034 116.541 24.28 113 27.986 67.286 66.136 32.058 112 32h104c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-21.39c13.276 9.315 23.718 22.12 30.17 37 .43 1 .85 2 1.25 3 12.456 1.057 22.015 11.499 21.97 24ZM232 112c0-4.418-3.582-8-8-8h-3.66c-3.497 .004-6.591-2.264-7.64-5.6C203.293 68.379 175.46 47.961 144 48h-32C83.449 47.999 57.595 64.867 46.095 90.999c-11.5 26.132-6.473 56.59 12.815 77.641 .722 .785 1.279 1.706 1.64 2.71L73.64 208h12.72l3.82-10.69c1.136-3.183 4.15-5.308 7.53-5.31h68.58c3.38 .002 6.394 2.127 7.53 5.31L177.64 208h12.72l18.11-50.69c1.136-3.183 4.15-5.308 7.53-5.31h8c4.418 0 8-3.582 8-8Z"),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
