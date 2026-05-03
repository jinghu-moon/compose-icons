package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SortAscendingShapes: ImageVector
    get() {
        if (_sortAscendingShapes != null) return _sortAscendingShapes!!
        _sortAscendingShapes = tablerFilledIcon(
            name = "SortAscendingShapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 5.000 C 7.552 5.000 8.000 5.448 8.000 6.000 L 8.000 15.584 L 9.293 14.293 C 9.649 13.937 10.215 13.901 10.613 14.210 L 10.707 14.293 C 11.097 14.684 11.097 15.316 10.707 15.707 L 7.707 18.707 C 7.672 18.742 7.635 18.774 7.595 18.804 L 7.485 18.875 L 7.371 18.929 L 7.266 18.964 L 7.117 18.994 L 7.000 19.000 L 6.925 18.997 L 6.799 18.980 L 6.688 18.950 L 6.577 18.906 L 6.479 18.854 L 6.383 18.787 L 6.293 18.707 L 3.293 15.707 C 2.914 15.315 2.919 14.691 3.305 14.305 C 3.691 13.919 4.315 13.914 4.707 14.293 L 6.000 15.586 L 6.000 6.000 C 6.000 5.448 6.448 5.000 7.000 5.000M 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 9.000 C 21.000 10.105 20.105 11.000 19.000 11.000 L 15.000 11.000 C 13.895 11.000 13.000 10.105 13.000 9.000 L 13.000 5.000 C 13.000 3.895 13.895 3.000 15.000 3.000 ZM 17.864 13.496 L 21.364 19.496 C 21.545 19.805 21.546 20.188 21.367 20.498 C 21.189 20.809 20.858 21.000 20.500 21.000 L 13.500 21.000 C 13.142 21.000 12.811 20.809 12.633 20.498 C 12.454 20.188 12.455 19.805 12.636 19.496 L 16.136 13.496 C 16.315 13.189 16.644 12.999 17.000 12.999 C 17.356 12.999 17.685 13.189 17.864 13.496"),
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
        return _sortAscendingShapes!!
    }

private var _sortAscendingShapes: ImageVector? = null
