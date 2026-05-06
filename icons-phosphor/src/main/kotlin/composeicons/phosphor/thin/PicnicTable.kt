package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorThinIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 132h-49.53l-32-64h25.53c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-128c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h25.53l-32 64h-49.53c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h45.53L28.42 190.21c-.475 .949-.554 2.049-.218 3.056 .336 1.007 1.058 1.84 2.008 2.314 .557 .273 1.169 .417 1.79 .42 1.516 .001 2.902-.855 3.58-2.21L62.47 140h131.06l26.89 53.79c.678 1.355 2.064 2.211 3.58 2.21 .621-.003 1.233-.147 1.79-.42 .95-.474 1.672-1.307 2.008-2.314 .336-1.007 .257-2.107-.218-3.056L202.47 140h45.53c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM66.47 132l32-64h59.06l32 64Z"),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
