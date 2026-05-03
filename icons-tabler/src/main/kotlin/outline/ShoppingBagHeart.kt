package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingBagHeart: ImageVector
    get() {
        if (_shoppingBagHeart != null) return _shoppingBagHeart!!
        _shoppingBagHeart = tablerOutlineIcon(
            name = "ShoppingBagHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.500 21.000 L 8.574 21.000 C 7.093 21.000 5.834 19.920 5.609 18.456 L 4.354 10.304 C 4.265 9.727 4.433 9.140 4.813 8.698 C 5.193 8.255 5.747 8.000 6.331 8.000 L 17.670 8.000 C 18.254 8.000 18.808 8.255 19.188 8.698 C 19.568 9.140 19.736 9.727 19.647 10.304 C 19.590 10.672 19.547 10.948 19.520 11.132"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 11.000 L 9.000 6.000 C 9.000 4.343 10.343 3.000 12.000 3.000 C 13.657 3.000 15.000 4.343 15.000 6.000 L 15.000 11.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 22.000 L 21.350 18.716 C 21.765 18.313 22.000 17.760 22.001 17.182 C 22.002 16.603 21.769 16.049 21.355 15.645 C 20.486 14.795 19.098 14.793 18.226 15.639 L 18.002 15.859 L 17.779 15.639 C 16.910 14.790 15.523 14.787 14.651 15.633 C 14.236 16.036 14.001 16.589 14.000 17.167 C 13.999 17.746 14.231 18.300 14.645 18.704 L 18.000 22.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _shoppingBagHeart!!
    }

private var _shoppingBagHeart: ImageVector? = null
