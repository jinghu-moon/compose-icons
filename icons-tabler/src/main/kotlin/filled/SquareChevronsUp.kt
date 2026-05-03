package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsUp: ImageVector
    get() {
        if (_squareChevronsUp != null) return _squareChevronsUp!!
        _squareChevronsUp = tablerFilledIcon(
            name = "SquareChevronsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.613 12.210 C 12.215 11.901 11.649 11.937 11.293 12.293 L 8.293 15.293 L 8.210 15.387 C 7.901 15.785 7.937 16.351 8.293 16.707 L 8.387 16.790 C 8.785 17.099 9.351 17.063 9.707 16.707 L 12.000 14.415 L 14.293 16.707 L 14.387 16.790 C 14.804 17.113 15.400 17.056 15.749 16.660 C 16.097 16.265 16.079 15.666 15.707 15.293 L 12.707 12.293 ZM 12.613 7.210 C 12.215 6.901 11.649 6.937 11.293 7.293 L 8.293 10.293 L 8.210 10.387 C 7.901 10.785 7.937 11.351 8.293 11.707 L 8.387 11.790 C 8.785 12.099 9.351 12.063 9.707 11.707 L 12.000 9.415 L 14.293 11.707 L 14.387 11.790 C 14.804 12.113 15.400 12.056 15.749 11.660 C 16.097 11.265 16.079 10.666 15.707 10.293 L 12.707 7.293 Z"),
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
        return _squareChevronsUp!!
    }

private var _squareChevronsUp: ImageVector? = null
