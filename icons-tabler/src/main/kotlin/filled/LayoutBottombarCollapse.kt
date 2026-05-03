package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBottombarCollapse: ImageVector
    get() {
        if (_layoutBottombarCollapse != null) return _layoutBottombarCollapse!!
        _layoutBottombarCollapse = tablerFilledIcon(
            name = "LayoutBottombarCollapse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 18.000 5.000 L 6.000 5.000 C 5.493 5.000 5.066 5.380 5.007 5.883 L 5.000 6.000 L 5.000 15.000 L 19.000 15.000 L 19.000 6.000 C 19.000 5.493 18.620 5.066 18.117 5.007 L 18.000 5.000 ZM 10.613 8.210 L 10.707 8.293 L 12.000 9.585 L 13.293 8.293 C 13.649 7.937 14.215 7.901 14.613 8.210 L 14.707 8.293 C 15.063 8.649 15.099 9.215 14.790 9.613 L 14.707 9.707 L 12.707 11.707 C 12.351 12.063 11.785 12.099 11.387 11.790 L 11.293 11.707 L 9.293 9.707 C 8.921 9.334 8.903 8.735 9.251 8.340 C 9.600 7.944 10.196 7.887 10.613 8.210 Z"),
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
        return _layoutBottombarCollapse!!
    }

private var _layoutBottombarCollapse: ImageVector? = null
