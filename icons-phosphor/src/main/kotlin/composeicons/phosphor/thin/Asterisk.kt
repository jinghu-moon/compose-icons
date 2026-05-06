package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorThinIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.43 178.06c-.546 .91-1.431 1.566-2.461 1.822-1.03 .257-2.119 .094-3.029-.452L132 135.06v80.94c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80.94L50.06 179.43c-1.894 1.138-4.352 .524-5.49-1.37-1.138-1.894-.524-4.352 1.37-5.49L120.22 128 45.94 83.43C44.046 82.292 43.432 79.834 44.57 77.94c1.138-1.894 3.596-2.508 5.49-1.37L124 120.94v-80.94c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v80.94L205.94 76.57c1.894-1.138 4.352-.524 5.49 1.37 1.138 1.894 .524 4.352-1.37 5.49L135.78 128l74.28 44.57c.91 .546 1.566 1.431 1.822 2.461 .257 1.03 .094 2.119-.452 3.029Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
