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
                pathData = parseSvgPathData("M17 18.5c-1.587 .728-3.413 .728-5 0C10.34 17.927 8.513 18.11 7 19c1.093-.378 1.871-1.351 2-2.5v-7.5C9.011 7.199 10.224 5.628 11.963 5.161c1.739-.467 3.576 .286 4.487 1.839M13.9 13h-7"),
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
