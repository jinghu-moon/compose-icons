package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingBagCheck: ImageVector
    get() {
        if (_shoppingBagCheck != null) return _shoppingBagCheck!!
        _shoppingBagCheck = tablerOutlineIcon(
            name = "ShoppingBagCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.500 21.000 L 8.574 21.000 C 7.093 21.000 5.834 19.920 5.609 18.456 L 4.354 10.304 C 4.265 9.727 4.433 9.140 4.813 8.698 C 5.193 8.255 5.747 8.000 6.331 8.000 L 17.670 8.000 C 18.254 8.000 18.808 8.255 19.188 8.698 C 19.568 9.140 19.736 9.727 19.647 10.304 L 19.147 13.552"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.000 11.000 L 9.000 6.000 C 9.000 4.343 10.343 3.000 12.000 3.000 C 13.657 3.000 15.000 4.343 15.000 6.000 L 15.000 11.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 15.000 19.000 L 17.000 21.000 L 21.000 17.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _shoppingBagCheck!!
    }

private var _shoppingBagCheck: ImageVector? = null
