package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorBoldIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 216c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12ZM80 180c3.184 .003 6.238-1.26 8.49-3.51L180 85v67c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-96c0-6.627-5.373-12-12-12h-96C89.373 44 84 49.373 84 56c0 6.627 5.373 12 12 12h67L71.51 159.51c-3.436 3.432-4.464 8.597-2.605 13.083 1.859 4.487 6.239 7.41 11.095 7.407Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
