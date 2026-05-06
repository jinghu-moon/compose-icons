package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorThinIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 140h-128c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM232 84h-208c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h208c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 180h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM218.83 173.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L192 194.34 170.83 173.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L186.34 200l-21.17 21.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L192 205.66l21.17 21.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L197.66 200l21.17-21.17c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83Z"),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
