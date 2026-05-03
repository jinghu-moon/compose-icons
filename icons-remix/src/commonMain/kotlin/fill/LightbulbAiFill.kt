package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LightbulbAiFill: ImageVector
    get() {
        if (_lightbulbAiFill != null) return _lightbulbAiFill!!
        _lightbulbAiFill = remixIcon(
            name = "LightbulbAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 21.000 C 16.000 22.105 15.105 23.000 14.000 23.000 L 10.000 23.000 C 8.895 23.000 8.000 22.105 8.000 21.000 L 8.000 20.000 L 16.000 20.000 L 16.000 21.000 ZM 12.339 2.009 C 12.120 2.632 12.000 3.302 12.000 4.000 C 12.000 7.314 14.686 10.000 18.000 10.000 C 18.698 10.000 19.367 9.879 19.990 9.660 C 19.995 9.773 20.000 9.886 20.000 10.000 C 20.000 11.892 19.343 13.631 18.244 15.001 C 17.694 15.687 16.355 16.728 16.059 18.000 L 7.941 18.000 C 7.644 16.727 6.304 15.686 5.754 14.999 C 4.656 13.630 4.000 11.891 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 12.113 2.000 12.226 2.004 12.339 2.009 ZM 17.529 0.328 C 17.706 -0.097 18.294 -0.097 18.471 0.328 L 18.724 0.940 C 19.156 1.982 19.962 2.815 20.975 3.266 L 21.692 3.585 C 22.103 3.768 22.103 4.365 21.692 4.548 L 20.933 4.886 C 19.945 5.325 19.153 6.128 18.714 7.137 L 18.467 7.702 C 18.286 8.116 17.714 8.116 17.533 7.702 L 17.287 7.137 C 16.848 6.128 16.055 5.325 15.067 4.886 L 14.308 4.548 C 13.897 4.365 13.897 3.768 14.308 3.585 L 15.025 3.266 C 16.038 2.815 16.844 1.982 17.276 0.940 L 17.529 0.328 Z"),
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
        return _lightbulbAiFill!!
    }

private var _lightbulbAiFill: ImageVector? = null
