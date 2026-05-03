package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencySom: ImageVector
    get() {
        if (_currencySom != null) return _currencySom!!
        _currencySom = tablerOutlineIcon(
            name = "CurrencySom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 18.000 L 10.000 6.000 L 5.000 6.000 L 5.000 16.000 C 5.000 17.105 4.105 18.000 3.000 18.000"),
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
        pathData = parseSvgPathData("M 14.000 6.000 L 14.000 18.000 L 18.000 18.000 C 19.657 18.000 21.000 16.657 21.000 15.000 C 21.000 13.343 19.657 12.000 18.000 12.000 L 14.000 12.000 L 18.000 12.000 C 19.657 12.000 21.000 10.657 21.000 9.000 C 21.000 7.343 19.657 6.000 18.000 6.000 L 14.000 6.000"),
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
        return _currencySom!!
    }

private var _currencySom: ImageVector? = null
