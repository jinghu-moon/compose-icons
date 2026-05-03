package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterDollar: ImageVector
    get() {
        if (_filterDollar != null) return _filterDollar!!
        _filterDollar = tablerOutlineIcon(
            name = "FilterDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.250 19.583 L 9.000 21.000 L 9.000 12.500 L 4.520 7.572 C 4.185 7.204 4.000 6.724 4.000 6.227 L 4.000 4.000 L 20.000 4.000 L 20.000 6.172 C 20.000 6.702 19.789 7.211 19.414 7.586 L 15.000 12.000"),
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
                pathData = parseSvgPathData("M 21.000 15.000 L 18.500 15.000 C 17.672 15.000 17.000 15.672 17.000 16.500 C 17.000 17.328 17.672 18.000 18.500 18.000 L 19.500 18.000 C 20.328 18.000 21.000 18.672 21.000 19.500 C 21.000 20.328 20.328 21.000 19.500 21.000 L 17.000 21.000"),
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
                pathData = parseSvgPathData("M 19.000 21.000 L 19.000 22.000M 19.000 14.000 L 19.000 15.000"),
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
        return _filterDollar!!
    }

private var _filterDollar: ImageVector? = null
