package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = tablerFilledIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 21.000 C 20.000 21.369 19.797 21.708 19.472 21.882 C 19.147 22.056 18.752 22.037 18.445 21.832 L 16.127 20.287 L 14.707 21.707 C 14.351 22.063 13.785 22.099 13.387 21.790 L 13.293 21.707 L 12.000 20.415 L 10.707 21.707 C 10.351 22.063 9.785 22.099 9.387 21.790 L 9.293 21.707 L 7.872 20.287 L 5.555 21.832 L 5.536 21.844 L 5.482 21.874 L 5.454 21.891 L 5.400 21.914 L 5.350 21.937 L 5.301 21.952 L 5.241 21.971 L 5.189 21.980 L 5.132 21.991 L 5.048 21.997 L 5.022 22.000 L 5.000 22.000 L 4.951 21.997 L 4.912 21.997 L 4.899 21.994 L 4.883 21.994 L 4.842 21.986 L 4.804 21.981 L 4.789 21.976 L 4.771 21.974 L 4.737 21.963 L 4.697 21.953 L 4.678 21.946 L 4.663 21.942 L 4.634 21.929 L 4.594 21.914 L 4.573 21.903 L 4.560 21.898 L 4.532 21.882 L 4.496 21.864 L 4.482 21.854 L 4.464 21.844 L 4.426 21.817 L 4.404 21.803 L 4.394 21.794 L 4.374 21.780 L 4.329 21.739 L 4.317 21.731 L 4.293 21.707 L 4.258 21.668 L 4.238 21.648 L 4.231 21.637 L 4.220 21.625 L 4.188 21.580 L 4.168 21.555 L 4.156 21.536 L 4.126 21.482 L 4.109 21.454 L 4.086 21.400 L 4.063 21.350 C 4.050 21.315 4.038 21.279 4.029 21.242 L 4.019 21.185 L 4.009 21.132 L 4.000 21.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 15.000 14.000 L 13.000 14.000 C 12.448 14.000 12.000 14.448 12.000 15.000 C 12.000 15.552 12.448 16.000 13.000 16.000 L 15.000 16.000 C 15.552 16.000 16.000 15.552 16.000 15.000 C 16.000 14.448 15.552 14.000 15.000 14.000M 15.000 10.000 L 9.000 10.000 C 8.448 10.000 8.000 10.448 8.000 11.000 C 8.000 11.552 8.448 12.000 9.000 12.000 L 15.000 12.000 C 15.552 12.000 16.000 11.552 16.000 11.000 C 16.000 10.448 15.552 10.000 15.000 10.000M 15.000 6.000 L 9.000 6.000 C 8.448 6.000 8.000 6.448 8.000 7.000 C 8.000 7.552 8.448 8.000 9.000 8.000 L 15.000 8.000 C 15.552 8.000 16.000 7.552 16.000 7.000 C 16.000 6.448 15.552 6.000 15.000 6.000"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
