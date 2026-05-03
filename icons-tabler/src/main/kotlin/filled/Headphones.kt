package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = tablerFilledIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 17.000 21.000 C 15.411 21.000 14.098 19.762 14.005 18.176 L 14.000 18.000 L 14.000 15.000 C 14.000 13.411 15.238 12.098 16.824 12.005 L 17.000 12.000 L 18.000 12.000 C 18.351 12.000 18.688 12.060 19.000 12.171 L 19.000 12.000 C 19.002 8.179 15.940 5.063 12.120 4.998 C 8.300 4.932 5.133 7.942 5.004 11.760 L 5.000 12.000 L 5.000 12.170 C 5.250 12.082 5.516 12.026 5.791 12.007 L 6.000 12.000 L 7.000 12.000 C 8.589 12.000 9.902 13.238 9.995 14.824 L 10.000 15.000 L 10.000 18.000 C 10.000 19.589 8.762 20.902 7.176 20.995 L 7.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 12.000 C 3.002 7.082 6.950 3.077 11.867 3.004 C 16.785 2.932 20.849 6.820 20.996 11.735 L 21.000 12.000 L 21.000 18.000 Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
