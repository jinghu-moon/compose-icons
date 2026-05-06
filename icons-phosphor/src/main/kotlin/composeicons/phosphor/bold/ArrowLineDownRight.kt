package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorBoldIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 40c0 6.627-5.373 12-12 12h-176C33.373 52 28 46.627 28 40 28 33.373 33.373 28 40 28h176c6.627 0 12 5.373 12 12ZM192 92c-6.627 0-12 5.373-12 12v67L88.49 79.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L163 188h-67c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12v-96c0-6.627-5.373-12-12-12Z"),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
