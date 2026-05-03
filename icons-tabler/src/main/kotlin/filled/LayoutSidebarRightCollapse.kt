package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutSidebarRightCollapse: ImageVector
    get() {
        if (_layoutSidebarRightCollapse != null) return _layoutSidebarRightCollapse!!
        _layoutSidebarRightCollapse = tablerFilledIcon(
            name = "LayoutSidebarRightCollapse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 15.000 5.000 L 6.000 5.000 C 5.493 5.000 5.066 5.380 5.007 5.883 L 5.000 6.000 L 5.000 18.000 C 5.000 18.507 5.380 18.934 5.883 18.993 L 6.000 19.000 L 15.000 19.000 L 15.000 5.000 ZM 9.613 9.210 L 9.707 9.293 L 11.707 11.293 C 12.063 11.649 12.099 12.215 11.790 12.613 L 11.707 12.707 L 9.707 14.707 C 9.334 15.079 8.735 15.097 8.340 14.749 C 7.944 14.400 7.887 13.804 8.210 13.387 L 8.293 13.293 L 9.585 12.000 L 8.293 10.707 C 7.937 10.351 7.901 9.785 8.210 9.387 L 8.293 9.293 C 8.649 8.937 9.215 8.901 9.613 9.210 Z"),
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
        return _layoutSidebarRightCollapse!!
    }

private var _layoutSidebarRightCollapse: ImageVector? = null
