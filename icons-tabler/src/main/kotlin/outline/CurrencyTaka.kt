package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyTaka: ImageVector
    get() {
        if (_currencyTaka != null) return _currencyTaka!!
        _currencyTaka = tablerOutlineIcon(
            name = "CurrencyTaka",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.500 15.500 C 15.500 16.052 15.948 16.500 16.500 16.500 C 17.052 16.500 17.500 16.052 17.500 15.500 C 17.500 14.948 17.052 14.500 16.500 14.500 C 15.948 14.500 15.500 14.948 15.500 15.500"),
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
                pathData = parseSvgPathData("M 7.000 7.000 C 7.000 5.895 7.895 5.000 9.000 5.000 C 10.105 5.000 11.000 5.895 11.000 7.000 L 11.000 16.000 C 11.000 17.657 12.343 19.000 14.000 19.000 C 15.657 19.000 17.000 17.657 17.000 16.000 L 17.000 15.500"),
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
                pathData = parseSvgPathData("M 8.000 11.000 L 14.000 11.000"),
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
        return _currencyTaka!!
    }

private var _currencyTaka: ImageVector? = null
