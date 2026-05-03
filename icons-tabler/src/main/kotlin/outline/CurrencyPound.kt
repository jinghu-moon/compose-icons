package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyPound: ImageVector
    get() {
        if (_currencyPound != null) return _currencyPound!!
        _currencyPound = tablerOutlineIcon(
            name = "CurrencyPound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 18.500 C 15.413 19.228 13.587 19.228 12.000 18.500 C 10.340 17.927 8.513 18.110 7.000 19.000 C 8.093 18.622 8.871 17.649 9.000 16.500 L 9.000 9.000 C 9.011 7.199 10.224 5.628 11.963 5.161 C 13.702 4.694 15.539 5.447 16.450 7.000M 13.900 13.000 L 6.900 13.000"),
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
        return _currencyPound!!
    }

private var _currencyPound: ImageVector? = null
