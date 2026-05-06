package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Tokens: ImageVector
    get() {
        if (_tokens != null) return _tokens!!
        _tokens = radixIcon(
            name = "Tokens",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.5 8C5.881 8 7 9.119 7 10.5 7 11.881 5.881 13 4.5 13 3.119 13 2 11.881 2 10.5 2 9.119 3.119 8 4.5 8ZM10.5 8C11.881 8 13 9.119 13 10.5 13 11.881 11.881 13 10.5 13 9.119 13 8 11.881 8 10.5 8 9.119 9.119 8 10.5 8ZM4.5 9C3.672 9 3 9.672 3 10.5 3 11.328 3.672 12 4.5 12 5.328 12 6 11.328 6 10.5 6 9.672 5.328 9 4.5 9ZM10.5 9C9.672 9 9 9.672 9 10.5 9 11.328 9.672 12 10.5 12 11.328 12 12 11.328 12 10.5 12 9.672 11.328 9 10.5 9ZM4.5 2C5.881 2 7 3.119 7 4.5 7 5.881 5.881 7 4.5 7 3.119 7 2 5.881 2 4.5 2 3.119 3.119 2 4.5 2ZM10.5 2C11.881 2 13 3.119 13 4.5 13 5.881 11.881 7 10.5 7 9.119 7 8 5.881 8 4.5 8 3.119 9.119 2 10.5 2ZM4.5 3C3.672 3 3 3.672 3 4.5 3 5.328 3.672 6 4.5 6 5.328 6 6 5.328 6 4.5 6 3.672 5.328 3 4.5 3ZM10.5 3C9.672 3 9 3.672 9 4.5 9 5.328 9.672 6 10.5 6 11.328 6 12 5.328 12 4.5 12 3.672 11.328 3 10.5 3Z"),
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
        return _tokens!!
    }

private var _tokens: ImageVector? = null
