package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorThinIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 52h-128C57.373 52 52 57.373 52 64v128c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM196 192c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4ZM236 56v144c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM28 56v144c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
