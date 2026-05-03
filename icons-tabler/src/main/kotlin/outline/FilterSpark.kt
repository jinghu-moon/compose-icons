package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterSpark: ImageVector
    get() {
        if (_filterSpark != null) return _filterSpark!!
        _filterSpark = tablerOutlineIcon(
            name = "FilterSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 12.500 L 15.000 12.000 L 19.414 7.586 C 19.789 7.211 20.000 6.702 20.000 6.172 L 20.000 4.000 L 4.000 4.000 L 4.000 6.227 C 4.000 6.724 4.185 7.204 4.520 7.572 L 9.000 12.500 L 9.000 21.000 L 11.000 20.333"),
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
        pathData = parseSvgPathData("M 18.500 22.000 C 18.919 20.270 20.270 18.919 22.000 18.500 C 20.270 18.081 18.919 16.730 18.500 15.000 C 18.081 16.730 16.730 18.081 15.000 18.500 C 16.730 18.919 18.081 20.270 18.500 22.000"),
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
        return _filterSpark!!
    }

private var _filterSpark: ImageVector? = null
