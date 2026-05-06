package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorThinIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 64c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4ZM136 124h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM136 188h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM244 160c-.001 1.378-.711 2.659-1.88 3.39l-64 40c-.636 .398-1.37 .609-2.12 .61-.678-.002-1.345-.174-1.94-.5-1.272-.705-2.061-2.046-2.06-3.5v-80c.001-1.454 .79-2.793 2.062-3.497 1.272-.704 2.825-.663 4.058 .107l64 40c1.169 .731 1.879 2.012 1.88 3.39ZM232.45 160 180 127.22v65.56Z"),
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
