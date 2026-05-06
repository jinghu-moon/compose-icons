package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = tablerFilledIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 2c.507 0 .934 .38 .993 .883L7 3v1.068l13.071 .935c.534 .038 .943 .489 .929 1.024l-.01 .114-1 7c-.064 .451-.425 .802-.877 .853L19 14h-12v2h10c1.634 0 2.967 1.308 2.999 2.941 .032 1.634-1.249 2.992-2.882 3.056-1.633 .064-3.016-1.191-3.112-2.822L14 19l.005-.176c.017-.288 .074-.564 .166-.824h-5.342c.39 1.106 .1 2.337-.742 3.152-.842 .816-2.082 1.066-3.175 .641C3.82 21.369 3.075 20.346 3.005 19.176L3 19l.005-.176C3.076 17.619 3.862 16.573 5 16.17v-12.17h-1C3.493 4 3.066 3.62 3.007 3.117L3 3c0-.507 .38-.934 .883-.993L4 2h2ZM6 18c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C7 18.448 6.552 18 6 18M17 18c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
