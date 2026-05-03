package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsLeft: ImageVector
    get() {
        if (_squareChevronsLeft != null) return _squareChevronsLeft!!
        _squareChevronsLeft = tablerFilledIcon(
            name = "SquareChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 16.707 8.293 C 16.316 7.903 15.684 7.903 15.293 8.293 L 12.293 11.293 L 12.210 11.387 C 11.901 11.785 11.937 12.351 12.293 12.707 L 15.293 15.707 L 15.387 15.790 C 15.785 16.099 16.351 16.063 16.707 15.707 L 16.790 15.613 C 17.099 15.215 17.063 14.649 16.707 14.293 L 14.415 12.000 L 16.707 9.707 L 16.790 9.613 C 17.099 9.215 17.063 8.649 16.707 8.293 ZM 11.707 8.293 C 11.316 7.903 10.684 7.903 10.293 8.293 L 7.293 11.293 L 7.210 11.387 C 6.901 11.785 6.937 12.351 7.293 12.707 L 10.293 15.707 L 10.387 15.790 C 10.785 16.099 11.351 16.063 11.707 15.707 L 11.790 15.613 C 12.099 15.215 12.063 14.649 11.707 14.293 L 9.415 12.000 L 11.707 9.707 L 11.790 9.613 C 12.099 9.215 12.063 8.649 11.707 8.293 Z"),
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
        return _squareChevronsLeft!!
    }

private var _squareChevronsLeft: ImageVector? = null
