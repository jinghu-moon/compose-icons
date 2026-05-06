package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorRegularIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M71.59 61.47C70.502 58.202 67.444 55.998 64 55.998c-3.444 0-6.502 2.204-7.59 5.472l-40 120c-.813 2.44-.404 5.122 1.1 7.208 1.504 2.086 3.919 3.322 6.49 3.322h80c2.572 0 4.987-1.236 6.49-3.322 1.504-2.086 1.913-4.768 1.1-7.208ZM35.1 176 64 89.3 92.9 176ZM208 76C208 47.281 184.719 24 156 24c-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52 28.705-.033 51.967-23.295 52-52ZM120 76c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C136.118 112 120 95.882 120 76ZM224 144h-88c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8v-56c0-4.418-3.582-8-8-8ZM216 200h-72v-40h72Z"),
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
