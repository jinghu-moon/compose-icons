package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsRight: ImageVector
    get() {
        if (_squareChevronsRight != null) return _squareChevronsRight!!
        _squareChevronsRight = tablerFilledIcon(
            name = "SquareChevronsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 8.613 8.210 C 8.215 7.901 7.649 7.937 7.293 8.293 L 7.210 8.387 C 6.901 8.785 6.937 9.351 7.293 9.707 L 9.585 12.000 L 7.293 14.293 L 7.210 14.387 C 6.887 14.804 6.944 15.400 7.340 15.749 C 7.735 16.097 8.334 16.079 8.707 15.707 L 11.707 12.707 L 11.790 12.613 C 12.099 12.215 12.063 11.649 11.707 11.293 L 8.707 8.293 ZM 13.613 8.210 C 13.215 7.901 12.649 7.937 12.293 8.293 L 12.210 8.387 C 11.901 8.785 11.937 9.351 12.293 9.707 L 14.585 12.000 L 12.293 14.293 L 12.210 14.387 C 11.887 14.804 11.944 15.400 12.340 15.749 C 12.735 16.097 13.334 16.079 13.707 15.707 L 16.707 12.707 L 16.790 12.613 C 17.099 12.215 17.063 11.649 16.707 11.293 L 13.707 8.293 Z"),
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
        return _squareChevronsRight!!
    }

private var _squareChevronsRight: ImageVector? = null
