package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DrinksLine: ImageVector
    get() {
        if (_drinksLine != null) return _drinksLine!!
        _drinksLine = remixIcon(
            name = "DrinksLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2h-7.795C5.609 2 5.096 2.421 4.979 3.005L4.18 7h-2.18v2h2.109L5.481 20.893C5.554 21.524 6.088 22 6.723 22h10.554c.635 0 1.169-.476 1.242-1.107L19.891 9h2.109v-2h-2.18L19.021 3.005C18.904 2.421 18.391 2 17.795 2h-1.795v-2h-2v2ZM17.78 7h-11.56L6.82 4h10.36l.6 3ZM6.122 9h11.756L16.609 20h-9.218L6.122 9Z"),
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
        return _drinksLine!!
    }

private var _drinksLine: ImageVector? = null
