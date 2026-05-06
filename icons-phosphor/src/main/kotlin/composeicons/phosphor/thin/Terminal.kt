package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorThinIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 128c.004 1.146-.484 2.238-1.34 3L42.66 195c-1.657 1.469-4.191 1.317-5.66-.34-1.469-1.657-1.317-4.191 .34-5.66L106 128 37.34 67C35.683 65.531 35.531 62.997 37 61.34c1.469-1.657 4.003-1.809 5.66-.34l72 64c.856 .762 1.344 1.854 1.34 3ZM216 188h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
