package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutNavbarCollapse: ImageVector
    get() {
        if (_layoutNavbarCollapse != null) return _layoutNavbarCollapse!!
        _layoutNavbarCollapse = tablerFilledIcon(
            name = "LayoutNavbarCollapse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 19.000 9.000 L 5.000 9.000 L 5.000 18.000 C 5.000 18.507 5.380 18.934 5.883 18.993 L 6.000 19.000 L 18.000 19.000 C 18.507 19.000 18.934 18.620 18.993 18.117 L 19.000 18.000 L 19.000 9.000 ZM 12.613 12.210 L 12.707 12.293 L 14.707 14.293 C 15.079 14.666 15.097 15.265 14.749 15.660 C 14.400 16.056 13.804 16.113 13.387 15.790 L 13.293 15.707 L 12.000 14.415 L 10.707 15.707 C 10.351 16.063 9.785 16.099 9.387 15.790 L 9.293 15.707 C 8.937 15.351 8.901 14.785 9.210 14.387 L 9.293 14.293 L 11.293 12.293 C 11.649 11.937 12.215 11.901 12.613 12.210 Z"),
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
        return _layoutNavbarCollapse!!
    }

private var _layoutNavbarCollapse: ImageVector? = null
