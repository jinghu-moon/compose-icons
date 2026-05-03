package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortDescendingSmallBig: ImageVector
    get() {
        if (_sortDescendingSmallBig != null) return _sortDescendingSmallBig!!
        _sortDescendingSmallBig = tablerOutlineIcon(
            name = "SortDescendingSmallBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 15.000 L 7.000 18.000 L 4.000 15.000"),
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
                pathData = parseSvgPathData("M 7.000 6.000 L 7.000 18.000"),
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
                pathData = parseSvgPathData("M 14.000 18.333 C 14.000 18.702 14.298 19.000 14.667 19.000 L 17.333 19.000 C 17.701 19.000 18.000 18.701 18.000 18.333 L 18.000 15.667 C 18.000 15.299 17.701 15.000 17.333 15.000 L 14.667 15.000 C 14.299 15.000 14.000 15.299 14.000 15.667 L 14.000 18.333"),
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
                pathData = parseSvgPathData("M 14.000 10.833 C 14.000 11.478 14.522 12.000 15.167 12.000 L 19.833 12.000 C 20.478 12.000 21.000 11.478 21.000 10.833 L 21.000 6.167 C 21.000 5.522 20.478 5.000 19.833 5.000 L 15.167 5.000 C 14.522 5.000 14.000 5.522 14.000 6.167 L 14.000 10.833"),
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
        return _sortDescendingSmallBig!!
    }

private var _sortDescendingSmallBig: ImageVector? = null
