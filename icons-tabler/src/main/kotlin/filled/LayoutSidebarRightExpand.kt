package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutSidebarRightExpand: ImageVector
    get() {
        if (_layoutSidebarRightExpand != null) return _layoutSidebarRightExpand!!
        _layoutSidebarRightExpand = tablerFilledIcon(
            name = "LayoutSidebarRightExpand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 15.000 5.000 L 6.000 5.000 C 5.493 5.000 5.066 5.380 5.007 5.883 L 5.000 6.000 L 5.000 18.000 C 5.000 18.507 5.380 18.934 5.883 18.993 L 6.000 19.000 L 15.000 19.000 L 15.000 5.000 ZM 11.707 9.293 C 12.063 9.649 12.099 10.215 11.790 10.613 L 11.707 10.707 L 10.415 12.000 L 11.707 13.293 C 12.063 13.649 12.099 14.215 11.790 14.613 L 11.707 14.707 C 11.351 15.063 10.785 15.099 10.387 14.790 L 10.293 14.707 L 8.293 12.707 C 7.937 12.351 7.901 11.785 8.210 11.387 L 8.293 11.293 L 10.293 9.293 C 10.684 8.903 11.316 8.903 11.707 9.293 Z"),
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
        return _layoutSidebarRightExpand!!
    }

private var _layoutSidebarRightExpand: ImageVector? = null
