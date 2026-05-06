package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorThinIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 76.2 179.8 23.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L23.51 162.83c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l52.69 52.66c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529L232.49 93.17c4.686-4.686 4.686-12.284 0-16.97ZM226.83 87.51 87.51 226.83c-1.561 1.558-4.089 1.558-5.65 0L29.17 174.14c-1.558-1.561-1.558-4.089 0-5.65L64 133.66l29.17 29.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L69.65 128 96 101.66l29.17 29.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L101.65 96 128 69.66l29.17 29.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L133.66 64 168.49 29.17c1.561-1.558 4.089-1.558 5.65 0l52.69 52.69c1.558 1.561 1.558 4.089 0 5.65Z"),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
