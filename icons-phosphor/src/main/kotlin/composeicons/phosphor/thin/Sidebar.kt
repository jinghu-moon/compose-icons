package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sidebar: ImageVector
    get() {
        if (_sidebar != null) return _sidebar!!
        _sidebar = phosphorThinIcon(
            name = "Sidebar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM36 200v-52h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-24h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-24h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-20c0-2.209 1.791-4 4-4h44v152h-44c-2.209 0-4-1.791-4-4ZM220 200c0 2.209-1.791 4-4 4h-124v-152h124c2.209 0 4 1.791 4 4Z"),
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
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null
