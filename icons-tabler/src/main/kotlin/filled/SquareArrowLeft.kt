package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowLeft: ImageVector
    get() {
        if (_squareArrowLeft != null) return _squareArrowLeft!!
        _squareArrowLeft = tablerFilledIcon(
            name = "SquareArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.707 7.293 C 12.316 6.903 11.684 6.903 11.293 7.293 L 7.293 11.293 L 7.210 11.387 L 7.146 11.479 L 7.094 11.577 L 7.050 11.687 L 7.020 11.799 L 7.003 11.925 L 7.000 12.000 L 7.004 12.090 L 7.011 12.148 L 7.036 12.266 L 7.071 12.371 L 7.125 12.484 L 7.196 12.595 C 7.226 12.635 7.257 12.672 7.293 12.707 L 11.293 16.707 L 11.387 16.790 C 11.785 17.099 12.351 17.063 12.707 16.707 L 12.790 16.613 C 13.099 16.215 13.063 15.649 12.707 15.293 L 10.415 13.000 L 16.000 13.000 L 16.117 12.993 C 16.642 12.931 17.028 12.470 16.997 11.941 C 16.966 11.413 16.529 11.001 16.000 11.000 L 10.415 11.000 L 12.707 8.707 L 12.790 8.613 C 13.099 8.215 13.063 7.649 12.707 7.293 Z"),
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
        return _squareArrowLeft!!
    }

private var _squareArrowLeft: ImageVector? = null
