package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MastodonLine: ImageVector
    get() {
        if (_mastodonLine != null) return _mastodonLine!!
        _mastodonLine = remixIcon(
            name = "MastodonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.019 12.007 C 2.987 10.748 3.007 9.560 3.007 8.566 C 3.007 4.228 5.850 2.956 5.850 2.956 C 7.283 2.298 9.742 2.021 12.299 2.000 L 12.362 2.000 C 14.919 2.021 17.380 2.298 18.813 2.956 C 18.813 2.956 21.656 4.228 21.656 8.566 C 21.656 8.566 21.692 11.767 21.260 13.990 C 20.985 15.401 18.803 16.945 16.297 17.244 C 14.991 17.400 13.704 17.543 12.332 17.480 C 10.089 17.378 8.318 16.945 8.318 16.945 C 8.318 17.163 8.332 17.371 8.359 17.566 C 8.442 18.198 8.657 18.660 8.963 19.000 C 9.729 19.850 11.069 19.930 12.358 19.974 C 14.178 20.037 15.799 19.525 15.799 19.525 L 15.873 21.171 C 15.873 21.171 14.600 21.855 12.332 21.980 C 11.082 22.049 9.529 21.949 7.720 21.470 C 6.188 21.065 5.152 20.180 4.451 19.000 C 3.357 17.157 3.082 14.594 3.019 12.007 ZM 6.318 16.945 L 6.318 14.397 L 8.793 15.002 C 8.840 15.013 8.951 15.038 9.117 15.072 C 9.405 15.131 9.734 15.191 10.096 15.247 C 10.849 15.363 11.634 15.446 12.424 15.482 C 13.443 15.529 14.325 15.465 16.060 15.258 C 17.723 15.059 19.208 14.062 19.296 13.608 C 19.378 13.186 19.447 12.686 19.502 12.126 C 19.571 11.420 19.615 10.656 19.639 9.881 C 19.654 9.370 19.658 8.936 19.656 8.625 L 19.656 8.566 C 19.656 7.137 19.287 6.128 18.693 5.408 C 18.501 5.176 18.300 4.994 18.109 4.860 C 18.018 4.796 17.974 4.771 17.979 4.773 C 16.966 4.308 14.886 4.021 12.362 4.000 L 12.316 4.000 C 9.776 4.021 7.697 4.308 6.666 4.782 C 6.689 4.771 6.645 4.796 6.554 4.860 C 6.363 4.994 6.162 5.176 5.970 5.408 C 5.376 6.128 5.007 7.137 5.007 8.566 C 5.007 8.798 5.006 8.963 5.004 9.441 C 4.998 10.624 5.000 11.226 5.018 11.959 C 5.072 14.156 5.282 15.794 5.718 17.000 C 5.930 17.587 6.190 18.071 6.497 18.451 C 6.378 18.016 6.318 17.514 6.318 16.945 ZM 8.086 6.371 C 8.717 6.371 9.229 6.883 9.229 7.515 C 9.229 8.146 8.717 8.658 8.086 8.658 C 7.454 8.658 6.942 8.146 6.942 7.515 C 6.942 6.883 7.454 6.371 8.086 6.371 Z"),
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
        return _mastodonLine!!
    }

private var _mastodonLine: ImageVector? = null
