package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = tablerFilledIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.292 2.610 C 11.688 2.928 11.942 3.390 11.995 3.896 L 12.000 4.000 L 12.000 8.000 C 12.000 8.455 11.693 8.853 11.252 8.968 C 9.790 9.348 8.815 10.726 8.943 12.231 C 9.071 13.736 10.264 14.929 11.769 15.057 C 13.274 15.185 14.652 14.210 15.032 12.748 C 15.147 12.307 15.545 12.000 16.000 12.000 L 19.800 12.000 C 20.905 12.000 21.800 12.895 21.800 14.000 C 21.800 14.076 21.791 14.152 21.774 14.226 C 20.659 19.037 16.198 22.313 11.274 21.939 C 6.349 21.564 2.436 17.651 2.061 12.726 C 1.687 7.802 4.963 3.341 9.774 2.226 L 9.831 2.216 L 9.883 2.206 C 10.388 2.147 10.895 2.292 11.292 2.610M 14.995 2.500 L 15.040 2.502 L 15.107 2.506 L 15.188 2.520 L 15.220 2.524 L 15.292 2.546 L 15.332 2.556 C 18.087 3.526 20.279 5.651 21.335 8.374 L 21.443 8.668 C 21.551 8.974 21.503 9.313 21.316 9.578 C 21.128 9.843 20.824 10.000 20.500 10.000 L 16.000 10.000 C 15.708 10.000 15.430 9.872 15.240 9.650 C 14.967 9.330 14.670 9.033 14.350 8.760 C 14.128 8.570 14.000 8.292 14.000 8.000 L 14.000 3.500 Q 14.001 3.381 14.026 3.270 L 14.056 3.168 C 14.094 3.059 14.151 2.958 14.224 2.869 L 14.254 2.836 L 14.293 2.793 C 14.321 2.765 14.351 2.738 14.382 2.713 L 14.433 2.679 L 14.463 2.656 L 14.508 2.631 L 14.560 2.601 C 14.696 2.535 14.844 2.500 14.995 2.500"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
