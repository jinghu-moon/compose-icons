package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorFillIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.92 49.69c-1.942-1.513-4.472-2.048-6.86-1.45L160.93 63.52 99.58 32.84c-1.709-.853-3.667-1.065-5.52-.6l-64 16C26.499 49.13 24.001 52.329 24 56v144c0 2.463 1.135 4.789 3.077 6.305 1.942 1.516 4.473 2.053 6.863 1.455L95.07 192.48l61.35 30.68c1.114 .549 2.338 .836 3.58 .84 .654-0 1.306-.081 1.94-.24l64-16c3.561-.89 6.059-4.089 6.06-7.76v-144c.001-2.466-1.136-4.794-3.08-6.31ZM96 176c-.654 0-1.306 .081-1.94 .24L40 189.75v-127.5L95.07 48.48l.93 .46ZM216 193.75l-55.07 13.77-.93-.46v-127.06c.654 .003 1.305-.074 1.94-.23L216 66.25Z"),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
