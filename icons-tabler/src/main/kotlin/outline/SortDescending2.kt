package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortDescending2: ImageVector
    get() {
        if (_sortDescending2 != null) return _sortDescending2!!
        _sortDescending2 = tablerOutlineIcon(
            name = "SortDescending2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 5.500 C 5.000 5.224 5.224 5.000 5.500 5.000 L 9.500 5.000 C 9.776 5.000 10.000 5.224 10.000 5.500 L 10.000 9.500 C 10.000 9.776 9.776 10.000 9.500 10.000 L 5.500 10.000 C 5.224 10.000 5.000 9.776 5.000 9.500 L 5.000 5.500"),
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
        pathData = parseSvgPathData("M 5.000 14.500 C 5.000 14.224 5.224 14.000 5.500 14.000 L 9.500 14.000 C 9.776 14.000 10.000 14.224 10.000 14.500 L 10.000 18.500 C 10.000 18.776 9.776 19.000 9.500 19.000 L 5.500 19.000 C 5.224 19.000 5.000 18.776 5.000 18.500 L 5.000 14.500"),
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
        pathData = parseSvgPathData("M 14.000 15.000 L 17.000 18.000 L 20.000 15.000"),
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
        pathData = parseSvgPathData("M 17.000 18.000 L 17.000 6.000"),
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
        return _sortDescending2!!
    }

private var _sortDescending2: ImageVector? = null
