package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDinar: ImageVector
    get() {
        if (_currencyDinar != null) return _currencyDinar!!
        _currencyDinar = tablerOutlineIcon(
            name = "CurrencyDinar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 20.010 L 14.000 20.000"),
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
                pathData = parseSvgPathData("M 6.000 13.000 L 8.386 12.100 C 8.793 11.947 9.054 11.548 9.032 11.114 C 9.010 10.680 8.711 10.310 8.291 10.198 L 6.777 9.794 C 6.358 9.683 6.058 9.314 6.035 8.881 C 6.012 8.448 6.270 8.049 6.675 7.894 L 9.000 7.000"),
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
                pathData = parseSvgPathData("M 3.000 14.000 L 3.000 15.000 C 3.000 16.657 4.343 18.000 6.000 18.000 L 10.161 18.000 C 11.012 18.000 11.824 17.638 12.393 17.005 C 12.962 16.372 13.235 15.527 13.144 14.680 L 12.000 4.000"),
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
                pathData = parseSvgPathData("M 16.000 17.000 L 17.000 18.000 L 19.000 18.000 C 19.742 18.000 20.423 17.589 20.769 16.932 C 21.115 16.275 21.069 15.481 20.649 14.869 L 17.996 11.000"),
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
        return _currencyDinar!!
    }

private var _currencyDinar: ImageVector? = null
