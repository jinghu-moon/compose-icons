package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MastodonFill: ImageVector
    get() {
        if (_mastodonFill != null) return _mastodonFill!!
        _mastodonFill = remixIcon(
            name = "MastodonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.260 13.990 C 20.985 15.401 18.803 16.945 16.297 17.244 C 14.991 17.400 13.704 17.543 12.332 17.480 C 10.089 17.377 8.318 16.945 8.318 16.945 C 8.318 17.163 8.332 17.371 8.358 17.566 C 8.650 19.780 10.554 19.912 12.358 19.974 C 14.178 20.037 15.799 19.525 15.799 19.525 L 15.873 21.171 C 15.873 21.171 14.600 21.855 12.332 21.980 C 11.081 22.049 9.528 21.949 7.720 21.470 C 3.797 20.432 3.122 16.250 3.019 12.007 C 2.987 10.748 3.007 9.560 3.007 8.566 C 3.007 4.228 5.850 2.956 5.850 2.956 C 7.283 2.298 9.742 2.021 12.299 2.000 L 12.362 2.000 C 14.919 2.021 17.380 2.298 18.813 2.956 C 18.813 2.956 21.656 4.228 21.656 8.566 C 21.656 8.566 21.692 11.767 21.260 13.990 ZM 18.303 8.903 C 18.303 7.829 18.029 6.976 17.480 6.345 C 16.914 5.714 16.173 5.390 15.252 5.390 C 14.187 5.390 13.380 5.799 12.847 6.618 L 12.329 7.487 L 11.810 6.618 C 11.277 5.799 10.471 5.390 9.406 5.390 C 8.485 5.390 7.743 5.714 7.177 6.345 C 6.628 6.976 6.355 7.829 6.355 8.903 L 6.355 14.156 L 8.436 14.156 L 8.436 9.057 C 8.436 7.982 8.888 7.437 9.793 7.437 C 10.793 7.437 11.294 8.084 11.294 9.364 L 11.294 12.155 L 13.363 12.155 L 13.363 9.364 C 13.363 8.084 13.865 7.437 14.865 7.437 C 15.769 7.437 16.222 7.982 16.222 9.057 L 16.222 14.156 L 18.303 14.156 L 18.303 8.903 Z"),
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
        return _mastodonFill!!
    }

private var _mastodonFill: ImageVector? = null
