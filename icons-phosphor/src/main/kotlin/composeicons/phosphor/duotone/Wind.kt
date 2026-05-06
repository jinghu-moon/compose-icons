package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorDuotoneIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 96C106.745 96 96 85.255 96 72 96 58.745 106.745 48 120 48c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM208 80c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24C232 90.745 221.255 80 208 80ZM152 160c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24Z"),
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
                pathData = parseSvgPathData("M184 184c0 17.673-14.327 32-32 32-13.7 0-26.95-8.93-31.5-21.22-1.44-4.116 .681-8.628 4.771-10.143 4.089-1.516 8.639 .523 10.229 4.583C137.74 195.27 145 200 152 200c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16h-112c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h112c17.673 0 32 14.327 32 32ZM120 104c17.673 0 32-14.327 32-32C152 54.327 137.673 40 120 40 106.3 40 93.05 48.93 88.5 61.22c-1.44 4.116 .681 8.628 4.771 10.143 4.089 1.516 8.639-.523 10.229-4.583C105.74 60.73 113 56 120 56c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM208 72c-13.7 0-26.95 8.93-31.5 21.22-1.44 4.116 .681 8.628 4.771 10.143 4.089 1.516 8.639-.523 10.229-4.583C193.74 92.73 201 88 208 88c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c17.673 0 32-14.327 32-32C240 86.327 225.673 72 208 72Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
