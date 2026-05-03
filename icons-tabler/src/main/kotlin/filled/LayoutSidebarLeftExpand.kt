package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutSidebarLeftExpand: ImageVector
    get() {
        if (_layoutSidebarLeftExpand != null) return _layoutSidebarLeftExpand!!
        _layoutSidebarLeftExpand = tablerFilledIcon(
            name = "LayoutSidebarLeftExpand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 18.000 5.000 L 9.000 5.000 L 9.000 19.000 L 18.000 19.000 C 18.507 19.000 18.934 18.620 18.993 18.117 L 19.000 18.000 L 19.000 6.000 C 19.000 5.493 18.620 5.066 18.117 5.007 L 18.000 5.000 ZM 13.613 9.210 L 13.707 9.293 L 15.707 11.293 C 16.063 11.649 16.099 12.215 15.790 12.613 L 15.707 12.707 L 13.707 14.707 C 13.334 15.079 12.735 15.097 12.340 14.749 C 11.944 14.400 11.887 13.804 12.210 13.387 L 12.293 13.293 L 13.585 12.000 L 12.293 10.707 C 11.937 10.351 11.901 9.785 12.210 9.387 L 12.293 9.293 C 12.649 8.937 13.215 8.901 13.613 9.210 Z"),
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
        return _layoutSidebarLeftExpand!!
    }

private var _layoutSidebarLeftExpand: ImageVector? = null
