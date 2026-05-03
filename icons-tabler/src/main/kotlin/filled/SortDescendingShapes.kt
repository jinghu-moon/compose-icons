package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SortDescendingShapes: ImageVector
    get() {
        if (_sortDescendingShapes != null) return _sortDescendingShapes!!
        _sortDescendingShapes = tablerFilledIcon(
            name = "SortDescendingShapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 5.000 C 7.552 5.000 8.000 5.448 8.000 6.000 L 8.000 15.584 L 9.293 14.293 C 9.649 13.937 10.215 13.901 10.613 14.210 L 10.707 14.293 C 11.097 14.684 11.097 15.316 10.707 15.707 L 7.707 18.707 C 7.672 18.742 7.635 18.774 7.595 18.804 L 7.485 18.875 L 7.371 18.929 L 7.266 18.964 L 7.117 18.994 L 7.000 19.000 L 6.925 18.997 L 6.799 18.980 L 6.688 18.950 L 6.577 18.906 L 6.479 18.854 L 6.383 18.787 L 6.293 18.707 L 3.293 15.707 C 2.914 15.315 2.919 14.691 3.305 14.305 C 3.691 13.919 4.315 13.914 4.707 14.293 L 6.000 15.586 L 6.000 6.000 C 6.000 5.448 6.448 5.000 7.000 5.000M 19.000 13.000 C 20.105 13.000 21.000 13.895 21.000 15.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 15.000 21.000 C 13.895 21.000 13.000 20.105 13.000 19.000 L 13.000 15.000 C 13.000 13.895 13.895 13.000 15.000 13.000 ZM 17.864 3.496 L 21.364 9.496 C 21.545 9.805 21.546 10.188 21.367 10.498 C 21.189 10.809 20.858 11.000 20.500 11.000 L 13.500 11.000 C 13.142 11.000 12.811 10.809 12.633 10.498 C 12.454 10.188 12.455 9.805 12.636 9.496 L 16.136 3.496 C 16.315 3.189 16.644 2.999 17.000 2.999 C 17.356 2.999 17.685 3.189 17.864 3.496"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _sortDescendingShapes!!
    }

private var _sortDescendingShapes: ImageVector? = null
