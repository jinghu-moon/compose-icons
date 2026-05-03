package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LightbulbAiLine: ImageVector
    get() {
        if (_lightbulbAiLine != null) return _lightbulbAiLine!!
        _lightbulbAiLine = remixIcon(
            name = "LightbulbAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.339 2.009 L 12.000 4.000 C 8.686 4.000 6.000 6.686 6.000 10.000 C 6.000 11.384 6.468 12.691 7.314 13.748 C 7.400 13.855 8.120 14.601 8.231 14.722 C 9.228 15.806 9.841 16.798 9.973 18.000 L 14.027 18.000 C 14.159 16.799 14.772 15.807 15.768 14.723 C 15.880 14.601 16.598 13.857 16.684 13.750 C 17.531 12.693 18.000 11.385 18.000 10.000 L 19.990 9.660 C 19.995 9.773 20.000 9.886 20.000 10.000 C 20.000 11.892 19.343 13.631 18.244 15.001 C 17.624 15.774 16.000 17.000 16.000 18.500 L 16.000 21.000 C 16.000 22.105 15.105 23.000 14.000 23.000 L 10.000 23.000 C 8.895 23.000 8.000 22.105 8.000 21.000 L 8.000 18.500 C 8.000 17.000 6.375 15.773 5.754 14.999 C 4.656 13.630 4.000 11.892 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 12.113 2.000 12.226 2.004 12.339 2.009 ZM 10.000 21.000 L 14.000 21.000 L 14.000 20.000 L 10.000 20.000 L 10.000 21.000 ZM 17.529 0.328 C 17.706 -0.097 18.294 -0.097 18.471 0.328 L 18.724 0.940 C 19.156 1.982 19.962 2.815 20.975 3.266 L 21.692 3.585 C 22.103 3.768 22.103 4.365 21.692 4.548 L 20.933 4.886 C 19.945 5.325 19.153 6.128 18.714 7.137 L 18.467 7.702 C 18.286 8.117 17.714 8.117 17.533 7.702 L 17.287 7.137 C 16.848 6.128 16.055 5.325 15.067 4.886 L 14.308 4.548 C 13.898 4.365 13.897 3.768 14.308 3.585 L 15.025 3.266 C 16.038 2.815 16.844 1.982 17.276 0.940 L 17.529 0.328 Z"),
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
        return _lightbulbAiLine!!
    }

private var _lightbulbAiLine: ImageVector? = null
