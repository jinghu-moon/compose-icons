package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorBoldIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 64v104c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-75L72.49 200.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L163 76h-75C81.373 76 76 70.627 76 64 76 57.373 81.373 52 88 52h104c6.627 0 12 5.373 12 12Z"),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
