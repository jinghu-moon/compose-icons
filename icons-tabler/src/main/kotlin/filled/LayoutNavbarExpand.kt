package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutNavbarExpand: ImageVector
    get() {
        if (_layoutNavbarExpand != null) return _layoutNavbarExpand!!
        _layoutNavbarExpand = tablerFilledIcon(
            name = "LayoutNavbarExpand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 19.000 9.000 L 5.000 9.000 L 5.000 18.000 C 5.000 18.507 5.380 18.934 5.883 18.993 L 6.000 19.000 L 18.000 19.000 C 18.507 19.000 18.934 18.620 18.993 18.117 L 19.000 18.000 L 19.000 9.000 ZM 10.613 12.210 L 10.707 12.293 L 12.000 13.585 L 13.293 12.293 C 13.649 11.937 14.215 11.901 14.613 12.210 L 14.707 12.293 C 15.063 12.649 15.099 13.215 14.790 13.613 L 14.707 13.707 L 12.707 15.707 C 12.351 16.063 11.785 16.099 11.387 15.790 L 11.293 15.707 L 9.293 13.707 C 8.921 13.334 8.903 12.735 9.251 12.340 C 9.600 11.944 10.196 11.887 10.613 12.210 Z"),
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
        return _layoutNavbarExpand!!
    }

private var _layoutNavbarExpand: ImageVector? = null
