package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TwitterFill: ImageVector
    get() {
        if (_twitterFill != null) return _twitterFill!!
        _twitterFill = remixIcon(
            name = "TwitterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.212 5.656 C 21.449 5.994 20.639 6.216 19.811 6.314 C 20.684 5.791 21.337 4.969 21.649 4.000 C 20.829 4.488 19.931 4.831 18.994 5.015 C 18.203 4.171 17.098 3.693 15.942 3.694 C 13.633 3.694 11.760 5.567 11.760 7.877 C 11.760 8.205 11.797 8.522 11.868 8.829 C 8.390 8.654 5.310 6.990 3.247 4.459 C 2.875 5.098 2.680 5.823 2.681 6.562 C 2.681 8.013 3.420 9.293 4.541 10.043 C 3.877 10.022 3.228 9.843 2.647 9.520 C 2.647 9.537 2.647 9.555 2.647 9.571 C 2.647 11.598 4.088 13.289 6.002 13.673 C 5.643 13.770 5.272 13.819 4.900 13.819 C 4.630 13.819 4.368 13.794 4.113 13.745 C 4.645 15.406 6.189 16.616 8.020 16.649 C 6.538 17.812 4.709 18.443 2.825 18.440 C 2.492 18.440 2.159 18.420 1.828 18.381 C 3.740 19.610 5.966 20.263 8.238 20.260 C 15.932 20.260 20.138 13.887 20.138 8.361 C 20.138 8.180 20.134 7.999 20.126 7.820 C 20.944 7.228 21.651 6.496 22.212 5.656 Z"),
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
        return _twitterFill!!
    }

private var _twitterFill: ImageVector? = null
