package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DrinksFill: ImageVector
    get() {
        if (_drinksFill != null) return _drinksFill!!
        _drinksFill = remixIcon(
            name = "DrinksFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2h-7.795C5.609 2 5.096 2.421 4.979 3.005L4.18 7h-2.18v2h2.109 15.782 2.109v-2h-2.18L19.021 3.005C18.904 2.421 18.391 2 17.795 2h-1.795v-2h-2v2ZM19.66 11h-15.321l1.142 9.893C5.554 21.524 6.088 22 6.723 22h10.554c.635 0 1.169-.476 1.242-1.107L19.66 11Z"),
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
        return _drinksFill!!
    }

private var _drinksFill: ImageVector? = null
