package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyPoundOff: ImageVector
    get() {
        if (_currencyPoundOff != null) return _currencyPoundOff!!
        _currencyPoundOff = tablerOutlineIcon(
            name = "CurrencyPoundOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 18.500 C 15.413 19.228 13.587 19.228 12.000 18.500 C 10.340 17.927 8.513 18.110 7.000 19.000 C 8.093 18.622 8.871 17.649 9.000 16.500 L 9.000 9.000M 10.192 6.175 C 11.071 5.309 12.300 4.897 13.523 5.058 C 14.746 5.219 15.826 5.936 16.450 7.000M 13.000 13.000 L 7.000 13.000"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _currencyPoundOff!!
    }

private var _currencyPoundOff: ImageVector? = null
