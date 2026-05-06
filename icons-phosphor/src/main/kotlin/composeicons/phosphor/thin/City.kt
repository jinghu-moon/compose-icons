package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.City: ImageVector
    get() {
        if (_city != null) return _city!!
        _city = phosphorThinIcon(
            name = "City",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 212h-12v-124c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4v44h-56v-92c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4v172h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM164 92h56v120h-56ZM156 140v72h-56v-72ZM36 44h56v168h-56ZM68 72v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM68 120v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM68 168v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM124 184v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM188 184v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM188 136v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4Z"),
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
        return _city!!
    }

private var _city: ImageVector? = null
