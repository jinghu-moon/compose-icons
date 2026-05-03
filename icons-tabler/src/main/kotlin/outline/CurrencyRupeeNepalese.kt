package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRupeeNepalese: ImageVector
    get() {
        if (_currencyRupeeNepalese != null) return _currencyRupeeNepalese!!
        _currencyRupeeNepalese = tablerOutlineIcon(
            name = "CurrencyRupeeNepalese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 5.000 L 4.000 5.000 L 7.000 5.000 C 9.209 5.000 11.000 6.791 11.000 9.000 C 11.000 11.209 9.209 13.000 7.000 13.000 L 4.000 13.000 L 10.000 19.000"),
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
                pathData = parseSvgPathData("M 21.000 17.000 L 16.414 12.586 C 15.629 11.828 14.382 11.839 13.610 12.610 C 12.839 13.382 12.828 14.629 13.586 15.414 L 14.293 16.121"),
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
        return _currencyRupeeNepalese!!
    }

private var _currencyRupeeNepalese: ImageVector? = null
