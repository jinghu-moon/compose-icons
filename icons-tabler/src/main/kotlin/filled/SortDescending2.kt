package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SortDescending2: ImageVector
    get() {
        if (_sortDescending2 != null) return _sortDescending2!!
        _sortDescending2 = tablerFilledIcon(
            name = "SortDescending2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.500 4.000 C 10.328 4.000 11.000 4.672 11.000 5.500 L 11.000 9.500 C 11.000 10.328 10.328 11.000 9.500 11.000 L 5.500 11.000 C 4.672 11.000 4.000 10.328 4.000 9.500 L 4.000 5.500 C 4.000 4.672 4.672 4.000 5.500 4.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 9.500 13.000 C 10.328 13.000 11.000 13.672 11.000 14.500 L 11.000 18.500 C 11.000 19.328 10.328 20.000 9.500 20.000 L 5.500 20.000 C 4.672 20.000 4.000 19.328 4.000 18.500 L 4.000 14.500 C 4.000 13.672 4.672 13.000 5.500 13.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 17.000 5.000 C 17.552 5.000 18.000 5.448 18.000 6.000 L 18.000 15.584 L 19.293 14.293 C 19.649 13.937 20.215 13.901 20.613 14.210 L 20.707 14.293 C 21.097 14.684 21.097 15.316 20.707 15.707 L 17.707 18.707 C 17.672 18.742 17.635 18.774 17.595 18.804 L 17.485 18.875 L 17.371 18.929 L 17.266 18.964 L 17.117 18.994 L 17.000 19.000 L 16.925 18.997 L 16.799 18.980 L 16.688 18.950 L 16.577 18.906 L 16.479 18.854 L 16.383 18.787 L 16.293 18.707 L 13.293 15.707 C 12.914 15.315 12.919 14.691 13.305 14.305 C 13.691 13.919 14.315 13.914 14.707 14.293 L 16.000 15.586 L 16.000 6.000 C 16.000 5.448 16.448 5.000 17.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _sortDescending2!!
    }

private var _sortDescending2: ImageVector? = null
