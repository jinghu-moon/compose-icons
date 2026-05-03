package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MovieAiFill: ImageVector
    get() {
        if (_movieAiFill != null) return _movieAiFill!!
        _movieAiFill = remixIcon(
            name = "MovieAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.713 8.128 L 20.467 8.694 C 20.286 9.108 19.714 9.108 19.533 8.694 L 19.287 8.128 C 18.847 7.119 18.056 6.316 17.068 5.877 L 16.308 5.539 C 15.897 5.357 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.807 18.844 2.974 19.276 1.931 L 19.529 1.320 C 19.706 0.893 20.294 0.893 20.471 1.320 L 20.724 1.931 C 21.156 2.974 21.962 3.807 22.975 4.257 L 23.692 4.576 C 24.103 4.759 24.103 5.357 23.692 5.539 L 22.932 5.877 C 21.944 6.316 21.153 7.119 20.713 8.128 ZM 20.000 11.000 C 20.701 11.000 21.374 10.880 22.000 10.659 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 14.341 3.000 C 14.120 3.626 14.000 4.299 14.000 5.000 C 14.000 8.314 16.686 11.000 20.000 11.000 ZM 10.622 8.415 C 10.556 8.371 10.479 8.347 10.400 8.347 C 10.179 8.347 10.000 8.526 10.000 8.747 L 10.000 15.253 C 10.000 15.332 10.023 15.409 10.067 15.474 C 10.190 15.658 10.438 15.708 10.622 15.585 L 15.501 12.333 C 15.545 12.304 15.582 12.266 15.612 12.222 C 15.734 12.038 15.685 11.790 15.501 11.667 L 10.622 8.415 Z"),
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
        return _movieAiFill!!
    }

private var _movieAiFill: ImageVector? = null
