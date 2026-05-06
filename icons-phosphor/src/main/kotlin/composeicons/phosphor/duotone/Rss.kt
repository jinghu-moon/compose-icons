package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorDuotoneIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 200h-160v-160c88.366 0 160 71.634 160 160Z"),
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
                pathData = parseSvgPathData("M106.91 149.09C120.457 162.562 128.051 180.894 128 200c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C112 169.072 86.928 144 56 144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 19.106-.051 37.438 7.543 50.91 21.09ZM56 80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 57.438 0 104 46.562 104 104 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C176 133.726 122.274 80 56 80ZM174.79 81.21C143.355 49.599 100.58 31.879 56 32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 40.335-.111 79.037 15.921 107.48 44.52C192.079 120.963 208.111 159.665 208 200c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .12-44.58-17.6-87.355-49.21-118.79ZM60 184c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
