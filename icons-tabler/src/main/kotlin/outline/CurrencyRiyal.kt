package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRiyal: ImageVector
    get() {
        if (_currencyRiyal != null) return _currencyRiyal!!
        _currencyRiyal = tablerOutlineIcon(
            name = "CurrencyRiyal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 9.000 L 15.000 11.000 C 15.000 12.105 14.105 13.000 13.000 13.000 C 11.895 13.000 11.000 12.105 11.000 11.000 L 11.000 10.000 L 11.000 11.000 C 11.000 12.105 10.105 13.000 9.000 13.000 C 7.895 13.000 7.000 12.105 7.000 11.000 L 7.000 10.000 L 7.000 14.000 C 7.000 15.105 6.105 16.000 5.000 16.000 C 3.895 16.000 3.000 15.105 3.000 14.000 L 3.000 12.000"),
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
        pathData = parseSvgPathData("M 18.000 12.010 L 18.000 12.000"),
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
        pathData = parseSvgPathData("M 22.000 10.000 L 22.000 11.000 C 22.000 13.761 19.761 16.000 17.000 16.000"),
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
        return _currencyRiyal!!
    }

private var _currencyRiyal: ImageVector? = null
