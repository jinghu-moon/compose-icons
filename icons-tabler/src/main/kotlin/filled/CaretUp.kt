package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = tablerFilledIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.293 7.293 C 11.649 6.937 12.215 6.901 12.613 7.210 L 12.707 7.293 L 18.707 13.293 L 18.790 13.387 L 18.844 13.464 L 18.898 13.560 L 18.915 13.596 L 18.942 13.663 L 18.974 13.771 L 18.984 13.824 L 18.994 13.884 L 18.998 13.941 L 19.000 14.000 L 18.998 14.059 L 18.993 14.117 L 18.984 14.177 L 18.974 14.229 L 18.942 14.337 L 18.915 14.404 L 18.845 14.536 L 18.780 14.626 L 18.707 14.707 L 18.613 14.790 L 18.536 14.844 L 18.440 14.898 L 18.404 14.915 L 18.337 14.942 L 18.229 14.974 L 18.176 14.984 L 18.116 14.994 L 18.059 14.998 L 18.000 15.000 L 6.000 15.000 C 5.148 15.000 4.703 14.014 5.217 13.377 L 5.293 13.293 L 11.293 7.293 Z"),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
