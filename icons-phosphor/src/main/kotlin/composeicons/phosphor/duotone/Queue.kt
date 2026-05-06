package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorDuotoneIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 160l-64 40v-80Z"),
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
                pathData = parseSvgPathData("M32 64c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8ZM136 120h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h96c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM136 184h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h96c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM248 160c-.001 2.757-1.422 5.319-3.76 6.78l-64 40c-2.466 1.541-5.573 1.623-8.116 .214C169.58 205.585 168.001 202.907 168 200v-80c.001-2.907 1.58-5.585 4.124-6.994 2.543-1.409 5.651-1.327 8.116 .214l64 40c2.338 1.461 3.759 4.023 3.76 6.78ZM224.91 160 184 134.43v51.14Z"),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
