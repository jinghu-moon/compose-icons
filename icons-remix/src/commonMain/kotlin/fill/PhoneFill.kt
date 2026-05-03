package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PhoneFill: ImageVector
    get() {
        if (_phoneFill != null) return _phoneFill!!
        _phoneFill = remixIcon(
            name = "PhoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 16.420 L 21.000 19.956 C 21.000 20.481 20.594 20.917 20.070 20.954 C 19.633 20.985 19.276 21.000 19.000 21.000 C 10.163 21.000 3.000 13.837 3.000 5.000 C 3.000 4.724 3.015 4.367 3.046 3.930 C 3.083 3.406 3.519 3.000 4.044 3.000 L 7.580 3.000 C 7.837 3.000 8.052 3.194 8.078 3.450 C 8.101 3.679 8.122 3.863 8.142 4.002 C 8.344 5.415 8.758 6.759 9.349 8.003 C 9.444 8.203 9.382 8.442 9.202 8.570 L 7.044 10.112 C 8.358 13.181 10.819 15.642 13.888 16.956 L 15.427 14.802 C 15.557 14.620 15.799 14.557 16.001 14.653 C 17.245 15.244 18.589 15.657 20.002 15.858 C 20.140 15.878 20.323 15.899 20.550 15.922 C 20.806 15.948 21.000 16.163 21.000 16.420 Z"),
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
        return _phoneFill!!
    }

private var _phoneFill: ImageVector? = null
