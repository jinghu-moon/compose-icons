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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 2.000 C 6.507 2.000 6.934 2.380 6.993 2.883 L 7.000 3.000 L 7.000 4.068 L 20.071 5.003 C 20.605 5.041 21.014 5.492 21.000 6.027 L 20.990 6.141 L 19.990 13.141 C 19.926 13.592 19.565 13.943 19.113 13.994 L 19.000 14.000 L 7.000 14.000 L 7.000 16.000 L 17.000 16.000 C 18.634 16.000 19.967 17.308 19.999 18.941 C 20.031 20.575 18.750 21.934 17.117 21.998 C 15.484 22.062 14.101 20.807 14.005 19.176 L 14.000 19.000 L 14.005 18.824 C 14.022 18.536 14.079 18.260 14.171 18.000 L 8.829 18.000 C 9.219 19.106 8.929 20.337 8.087 21.152 C 7.245 21.968 6.005 22.218 4.912 21.793 C 3.820 21.369 3.075 20.346 3.005 19.176 L 3.000 19.000 L 3.005 18.824 C 3.076 17.619 3.862 16.573 5.000 16.170 L 5.000 4.000 L 4.000 4.000 C 3.493 4.000 3.066 3.620 3.007 3.117 L 3.000 3.000 C 3.000 2.493 3.380 2.066 3.883 2.007 L 4.000 2.000 L 6.000 2.000 ZM 6.000 18.000 C 5.448 18.000 5.000 18.448 5.000 19.000 C 5.000 19.552 5.448 20.000 6.000 20.000 C 6.552 20.000 7.000 19.552 7.000 19.000 C 7.000 18.448 6.552 18.000 6.000 18.000M 17.000 18.000 C 16.448 18.000 16.000 18.448 16.000 19.000 C 16.000 19.552 16.448 20.000 17.000 20.000 C 17.552 20.000 18.000 19.552 18.000 19.000 C 18.000 18.448 17.552 18.000 17.000 18.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
