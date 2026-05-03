package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = tablerFilledIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.757 16.172 L 18.328 19.743 C 14.645 22.751 9.355 22.751 5.672 19.743 L 9.242 16.172 C 10.060 16.712 11.019 17.000 12.000 17.000 C 13.020 17.000 13.967 16.695 14.757 16.172M 4.257 5.672 L 7.828 9.242 C 7.288 10.060 7.000 11.019 7.000 12.000 C 7.000 13.020 7.305 13.967 7.828 14.757 L 4.258 18.329 C 2.798 16.543 2.000 14.307 2.000 12.000 L 2.005 11.676 C 2.076 9.481 2.867 7.371 4.257 5.671M 22.000 12.000 C 22.000 14.343 21.180 16.570 19.743 18.328 L 16.172 14.758 C 16.712 13.940 17.000 12.981 17.000 12.000 C 17.000 10.980 16.695 10.033 16.172 9.243 L 19.743 5.673 C 21.202 7.459 22.000 9.694 22.000 12.000M 17.000 3.340 Q 17.707 3.750 18.330 4.258 L 14.757 7.828 C 13.939 7.288 12.980 7.000 12.000 7.000 C 10.980 7.000 10.033 7.305 9.243 7.828 L 5.670 4.258 C 8.889 1.627 13.400 1.261 17.000 3.340"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
