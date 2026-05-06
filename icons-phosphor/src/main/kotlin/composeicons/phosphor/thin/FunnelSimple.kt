package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorThinIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 136c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4ZM232 84h-208c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h208c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM152 180h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
