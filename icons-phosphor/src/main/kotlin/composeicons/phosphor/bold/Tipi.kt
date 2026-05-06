package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorBoldIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.11 209.53l-99.86-156L162.11 22.53c3.59-5.584 1.974-13.02-3.61-16.61C152.916 2.33 145.48 3.946 141.89 9.53L128 31.24 114.11 9.53C110.537 3.946 103.114 2.317 97.53 5.89 91.946 9.463 90.317 16.886 93.89 22.47l19.86 31-99.86 156c-2.398 3.697-2.577 8.41-.466 12.277 2.11 3.868 6.17 6.268 10.576 6.253h208c4.386 .001 8.424-2.391 10.53-6.238 2.106-3.848 1.945-8.538-.42-12.232ZM96.17 204 128 154.26 159.83 204ZM188.33 204 138.11 125.53c-2.205-3.449-6.016-5.536-10.11-5.536-4.094 0-7.905 2.087-10.11 5.536L67.67 204h-21.74L128 75.76 210.07 204Z"),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
