package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorThinIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 80c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4ZM40 84h108v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-108c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM216 172h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM88 148c-2.209 0-4 1.791-4 4v20h-44c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h44v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4Z"),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
