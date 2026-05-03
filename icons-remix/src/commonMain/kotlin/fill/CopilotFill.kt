package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CopilotFill: ImageVector
    get() {
        if (_copilotFill != null) return _copilotFill!!
        _copilotFill = remixIcon(
            name = "CopilotFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.662 14.484 C 8.662 13.931 9.110 13.483 9.663 13.483 C 10.216 13.483 10.665 13.931 10.665 14.484 L 10.665 16.481 C 10.665 17.034 10.217 17.482 9.663 17.482 C 9.110 17.482 8.662 17.034 8.662 16.481 L 8.662 14.484 ZM 15.337 14.484 C 15.337 13.931 14.889 13.483 14.335 13.483 C 13.782 13.483 13.334 13.931 13.334 14.484 L 13.334 16.481 C 13.334 17.034 13.783 17.482 14.335 17.482 C 14.889 17.482 15.337 17.034 15.337 16.481 L 15.337 14.484 ZM 12.000 4.028 C 11.154 2.809 9.401 2.719 8.054 2.840 C 6.511 2.994 5.211 3.525 4.480 4.304 C 3.213 5.690 3.154 8.595 3.765 10.195 C 3.704 10.468 3.645 10.745 3.603 11.038 C 2.473 11.336 1.320 12.937 1.320 14.082 L 1.320 16.244 C 1.320 16.845 1.601 17.392 2.095 17.766 C 4.919 19.864 8.439 21.490 12.000 21.490 C 15.560 21.490 19.080 19.864 21.904 17.766 C 22.398 17.392 22.679 16.845 22.679 16.244 L 22.679 14.082 C 22.679 12.937 21.526 11.336 20.396 11.038 C 20.354 10.745 20.295 10.468 20.234 10.195 C 20.845 8.595 20.786 5.690 19.519 4.304 C 18.788 3.525 17.488 2.994 15.945 2.840 C 14.598 2.719 12.845 2.809 12.000 4.028 ZM 18.674 17.487 C 17.139 18.341 14.589 19.488 12.000 19.488 C 9.410 19.488 6.860 18.341 5.325 17.487 L 5.325 11.689 C 7.802 12.648 10.652 12.154 11.998 9.931 L 12.001 9.931 C 13.347 12.154 16.197 12.648 18.674 11.689 L 18.674 17.487 ZM 10.665 6.829 C 10.665 8.414 10.185 10.140 7.995 10.140 C 5.805 10.140 5.388 9.616 5.388 8.143 C 5.388 5.807 5.744 4.807 8.704 4.807 C 10.414 4.807 10.665 5.356 10.665 6.829 ZM 13.334 6.829 C 13.334 5.356 13.585 4.807 15.295 4.807 C 18.255 4.807 18.611 5.807 18.611 8.143 C 18.611 9.616 18.194 10.140 16.004 10.140 C 13.814 10.140 13.334 8.414 13.334 6.829 Z"),
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
        return _copilotFill!!
    }

private var _copilotFill: ImageVector? = null
