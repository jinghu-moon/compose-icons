package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorFillIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M111.59 181.47c.813 2.44 .404 5.122-1.1 7.208-1.504 2.086-3.919 3.322-6.49 3.322h-80c-2.572 0-4.987-1.236-6.49-3.322-1.504-2.086-1.913-4.768-1.1-7.208l40-120C57.498 58.202 60.556 55.998 64 55.998c3.444 0 6.502 2.204 7.59 5.472ZM208 76C208 47.281 184.719 24 156 24c-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52 28.705-.033 51.967-23.295 52-52ZM224 144h-88c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8v-56c0-4.418-3.582-8-8-8Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
