package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorDuotoneIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 72h-184v120c0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8v-112c0-4.418-3.582-8-8-8ZM160 168c-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M104 168c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM96 128h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96 96h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 80v112c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-120c.001-3.532 2.318-6.645 5.7-7.66L189.7 16.34c4.233-1.27 8.695 1.132 9.965 5.365 1.27 4.233-1.132 8.695-5.365 9.965L86.51 64h129.49c8.837 0 16 7.163 16 16ZM216 192v-112h-176v112h176ZM200 136c0 22.091-17.909 40-40 40-22.091 0-40-17.909-40-40 0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40ZM184 136c0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
