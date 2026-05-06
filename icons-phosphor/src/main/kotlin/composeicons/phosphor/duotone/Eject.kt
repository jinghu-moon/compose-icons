package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorDuotoneIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 168v24c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8ZM48.23 128h159.54c7.16 0 10.89-8.27 6-13.37L140.03 37.13c-3.159-3.279-7.517-5.132-12.07-5.132-4.553 0-8.911 1.853-12.07 5.132L42.15 114.63C37.34 119.73 41.07 128 48.23 128Z"),
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
                pathData = parseSvgPathData("M208 152h-160c-8.837 0-16 7.163-16 16v24c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-24c0-8.837-7.163-16-16-16ZM208 192h-160v-24h160ZM48.24 136h159.52c6.482 .031 12.358-3.81 14.93-9.76 2.543-5.806 1.318-12.574-3.1-17.12L145.86 31.61C141.191 26.747 134.741 23.999 128 23.999c-6.741 0-13.191 2.749-17.86 7.611L36.41 109.12h0c-4.418 4.546-5.643 11.314-3.1 17.12 2.572 5.95 8.448 9.791 14.93 9.76ZM121.73 42.64c1.65-1.687 3.91-2.638 6.27-2.638 2.36 0 4.62 .951 6.27 2.638L207.85 120h-159.71Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
