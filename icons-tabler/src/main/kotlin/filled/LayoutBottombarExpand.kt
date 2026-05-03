package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBottombarExpand: ImageVector
    get() {
        if (_layoutBottombarExpand != null) return _layoutBottombarExpand!!
        _layoutBottombarExpand = tablerFilledIcon(
            name = "LayoutBottombarExpand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 18.000 5.000 L 6.000 5.000 C 5.493 5.000 5.066 5.380 5.007 5.883 L 5.000 6.000 L 5.000 15.000 L 19.000 15.000 L 19.000 6.000 C 19.000 5.493 18.620 5.066 18.117 5.007 L 18.000 5.000 ZM 12.613 8.210 L 12.707 8.293 L 14.707 10.293 C 15.079 10.666 15.097 11.265 14.749 11.660 C 14.400 12.056 13.804 12.113 13.387 11.790 L 13.293 11.707 L 12.000 10.415 L 10.707 11.707 C 10.351 12.063 9.785 12.099 9.387 11.790 L 9.293 11.707 C 8.937 11.351 8.901 10.785 9.210 10.387 L 9.293 10.293 L 11.293 8.293 C 11.649 7.937 12.215 7.901 12.613 8.210 Z"),
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
        return _layoutBottombarExpand!!
    }

private var _layoutBottombarExpand: ImageVector? = null
