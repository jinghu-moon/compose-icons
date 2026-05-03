package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAscendingSmallBig: ImageVector
    get() {
        if (_sortAscendingSmallBig != null) return _sortAscendingSmallBig!!
        _sortAscendingSmallBig = tablerOutlineIcon(
            name = "SortAscendingSmallBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 15.000 L 7.000 18.000 L 10.000 15.000"),
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
        pathData = parseSvgPathData("M 7.000 6.000 L 7.000 18.000"),
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
        pathData = parseSvgPathData("M 14.000 5.667 C 14.000 5.298 14.298 5.000 14.667 5.000 L 17.333 5.000 C 17.702 5.000 18.000 5.298 18.000 5.667 L 18.000 8.333 C 18.000 8.701 17.701 9.000 17.333 9.000 L 14.667 9.000 C 14.299 9.000 14.000 8.701 14.000 8.333 L 14.000 5.667"),
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
        pathData = parseSvgPathData("M 14.000 13.167 C 14.000 12.522 14.522 12.000 15.167 12.000 L 19.833 12.000 C 20.478 12.000 21.000 12.522 21.000 13.167 L 21.000 17.833 C 21.000 18.478 20.478 19.000 19.833 19.000 L 15.167 19.000 C 14.522 19.000 14.000 18.478 14.000 17.833 L 14.000 13.167"),
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
        return _sortAscendingSmallBig!!
    }

private var _sortAscendingSmallBig: ImageVector? = null
