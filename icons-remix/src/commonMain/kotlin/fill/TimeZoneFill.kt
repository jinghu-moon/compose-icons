package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TimeZoneFill: ImageVector
    get() {
        if (_timeZoneFill != null) return _timeZoneFill!!
        _timeZoneFill = remixIcon(
            name = "TimeZoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.078 2.000 21.272 5.785 21.915 10.687 C 20.559 9.630 18.853 9.000 17.000 9.000 C 12.582 9.000 9.000 12.582 9.000 17.000 C 9.000 18.853 9.630 20.559 10.687 21.915 C 5.785 21.272 2.000 17.078 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 3.833 C 9.683 3.833 7.591 4.799 6.104 6.349 C 6.281 6.472 6.435 6.645 6.541 6.883 C 6.745 7.340 6.745 7.811 6.745 8.228 C 6.745 8.556 6.744 8.867 6.850 9.093 C 6.994 9.401 7.616 9.532 8.165 9.647 L 8.185 9.651 C 8.375 9.691 8.570 9.733 8.748 9.782 C 9.254 9.922 9.646 10.377 9.959 10.741 C 10.090 10.893 10.282 11.116 10.378 11.172 C 10.429 11.136 10.590 10.961 10.670 10.674 C 10.731 10.455 10.713 10.260 10.624 10.154 C 10.065 9.494 10.095 8.223 10.268 7.755 C 10.540 7.016 11.391 7.071 12.012 7.111 L 12.018 7.111 C 12.247 7.126 12.464 7.140 12.626 7.120 C 13.097 7.061 13.321 6.504 13.461 6.156 C 13.506 6.045 13.542 5.955 13.575 5.910 C 13.867 5.510 14.761 4.907 15.316 4.535 C 14.302 4.084 13.181 3.833 12.000 3.833 ZM 23.000 17.000 C 23.000 20.314 20.314 23.000 17.000 23.000 C 13.686 23.000 11.000 20.314 11.000 17.000 C 11.000 13.686 13.686 11.000 17.000 11.000 C 20.314 11.000 23.000 13.686 23.000 17.000 ZM 16.000 18.000 L 20.000 18.000 L 20.000 16.000 L 18.000 16.000 L 18.000 14.000 L 16.000 14.000 L 16.000 18.000 Z"),
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
        return _timeZoneFill!!
    }

private var _timeZoneFill: ImageVector? = null
