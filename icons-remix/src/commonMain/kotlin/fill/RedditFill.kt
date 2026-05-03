package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RedditFill: ImageVector
    get() {
        if (_redditFill != null) return _redditFill!!
        _redditFill = remixIcon(
            name = "RedditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 ZM 18.671 12.000 C 18.650 11.425 18.293 10.916 17.760 10.700 C 17.226 10.484 16.616 10.602 16.201 11.000 C 15.063 10.227 13.726 9.800 12.351 9.770 L 13.001 6.650 L 15.141 7.100 C 15.193 7.589 15.593 7.966 16.084 7.992 C 16.574 8.017 17.011 7.682 17.113 7.201 C 17.216 6.721 16.954 6.237 16.496 6.060 C 16.037 5.883 15.518 6.065 15.271 6.490 L 12.821 6.000 C 12.740 5.982 12.655 5.998 12.586 6.043 C 12.516 6.088 12.468 6.159 12.451 6.240 L 11.711 9.710 C 10.319 9.731 8.963 10.158 7.811 10.940 C 7.390 10.544 6.774 10.433 6.241 10.659 C 5.709 10.884 5.359 11.403 5.351 11.981 C 5.342 12.559 5.675 13.089 6.201 13.330 C 6.190 13.476 6.190 13.623 6.201 13.770 C 6.201 16.010 8.811 17.830 12.031 17.830 C 15.251 17.830 17.861 16.010 17.861 13.770 C 17.872 13.623 17.872 13.476 17.861 13.330 C 18.365 13.080 18.680 12.562 18.671 12.000 ZM 8.671 13.000 C 8.671 12.448 9.119 12.000 9.671 12.000 C 10.223 12.000 10.671 12.448 10.671 13.000 C 10.671 13.552 10.223 14.000 9.671 14.000 C 9.406 14.000 9.151 13.895 8.964 13.707 C 8.776 13.520 8.671 13.265 8.671 13.000 ZM 14.481 15.750 C 13.771 16.285 12.899 16.557 12.011 16.520 C 11.123 16.557 10.250 16.285 9.541 15.750 C 9.453 15.643 9.461 15.486 9.559 15.388 C 9.657 15.290 9.814 15.282 9.921 15.370 C 10.522 15.811 11.256 16.033 12.001 16.000 C 12.747 16.041 13.484 15.825 14.091 15.390 C 14.162 15.320 14.266 15.294 14.362 15.321 C 14.458 15.348 14.532 15.424 14.557 15.521 C 14.581 15.618 14.552 15.720 14.481 15.790 L 14.481 15.750 ZM 14.301 14.040 C 13.749 14.040 13.301 13.592 13.301 13.040 C 13.301 12.488 13.749 12.040 14.301 12.040 C 14.853 12.040 15.301 12.488 15.301 13.040 C 15.312 13.314 15.210 13.580 15.019 13.777 C 14.828 13.973 14.565 14.083 14.291 14.080 L 14.301 14.040 Z"),
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
        return _redditFill!!
    }

private var _redditFill: ImageVector? = null
