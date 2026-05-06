package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LassoPolygon: ImageVector
    get() {
        if (_lassoPolygon != null) return _lassoPolygon!!
        _lassoPolygon = tablerFilledIcon(
            name = "LassoPolygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.581 2.186l6.566 4.69L19.649 4.064c.27-.101 .571-.081 .825 .056 .254 .137 .437 .377 .501 .658l.019 .112 1 9c.052 .469-.231 .91-.678 1.059l-9 3c-.178 .06-.37 .068-.553 .023L7.329 16.89c-.339 .417-.783 .736-1.287 .923 .095 .986 .374 1.9 .826 2.69 .269 .479 .101 1.085-.375 1.358-.477 .273-1.084 .11-1.361-.365C4.508 20.406 4.142 19.161 4.034 17.84 2.818 17.426 2 16.284 2 15l.005-.176c.043-.727 .348-1.414 .86-1.932L2.047 10.302c-.06-.187-.063-.388-.009-.577l2-7c.089-.313 .325-.562 .632-.669 .307-.107 .647-.059 .911 .13M5.572 4.637 4.044 9.985l.642 2.031Q4.841 12 5 12c1.655-0 2.997 1.34 3 2.995l3.957 .965 7.96-2.654L19.148 6.387 12.351 8.937c-.271 .101-.573 .08-.827-.058l-.105-.065Z"),
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
        return _lassoPolygon!!
    }

private var _lassoPolygon: ImageVector? = null
