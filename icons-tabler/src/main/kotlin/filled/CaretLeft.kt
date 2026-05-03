package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = tablerFilledIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.883 5.007 L 13.941 5.002 L 14.059 5.002 L 14.117 5.007 L 14.177 5.016 L 14.229 5.026 L 14.337 5.058 L 14.404 5.085 L 14.536 5.155 L 14.626 5.220 L 14.707 5.293 L 14.790 5.387 L 14.844 5.464 L 14.898 5.560 L 14.915 5.596 L 14.942 5.663 L 14.974 5.771 L 14.984 5.824 L 14.994 5.884 L 14.998 5.941 L 15.000 6.000 L 15.000 18.000 C 15.000 18.852 14.014 19.297 13.377 18.783 L 13.293 18.707 L 7.293 12.707 C 6.937 12.351 6.901 11.785 7.210 11.387 L 7.293 11.293 L 13.293 5.293 L 13.387 5.210 L 13.464 5.156 L 13.560 5.102 L 13.596 5.085 L 13.663 5.058 L 13.771 5.026 L 13.824 5.016 L 13.884 5.006 Z"),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
