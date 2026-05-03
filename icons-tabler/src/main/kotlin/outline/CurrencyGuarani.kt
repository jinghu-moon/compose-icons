package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyGuarani: ImageVector
    get() {
        if (_currencyGuarani != null) return _currencyGuarani!!
        _currencyGuarani = tablerOutlineIcon(
            name = "CurrencyGuarani",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.007 7.540 C 14.908 6.547 13.480 5.998 11.999 6.000 C 8.688 6.004 6.007 8.689 6.007 12.000 C 6.007 15.314 8.689 18.000 11.999 18.000 C 13.477 18.001 14.902 17.454 15.999 16.464 C 16.731 15.804 17.063 14.316 16.999 12.000 L 11.999 12.000"),
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
                pathData = parseSvgPathData("M 12.000 20.000 L 12.000 4.000"),
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
        return _currencyGuarani!!
    }

private var _currencyGuarani: ImageVector? = null
