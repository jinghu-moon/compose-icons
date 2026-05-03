package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ImageCircleAiFill: ImageVector
    get() {
        if (_imageCircleAiFill != null) return _imageCircleAiFill!!
        _imageCircleAiFill = remixIcon(
            name = "ImageCircleAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.467 8.694 L 20.713 8.128 C 21.153 7.119 21.944 6.316 22.932 5.877 L 23.692 5.539 C 24.103 5.357 24.103 4.759 23.692 4.576 L 22.975 4.257 C 21.962 3.807 21.156 2.974 20.724 1.931 L 20.471 1.320 C 20.294 0.893 19.706 0.893 19.529 1.320 L 19.276 1.931 C 18.844 2.974 18.038 3.807 17.025 4.257 L 16.308 4.576 C 15.897 4.759 15.897 5.357 16.308 5.539 L 17.068 5.877 C 18.056 6.316 18.847 7.119 19.287 8.128 L 19.533 8.694 C 19.714 9.108 20.286 9.108 20.467 8.694 ZM 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 11.597 21.976 11.200 21.930 10.809 L 19.944 11.045 C 19.981 11.358 20.000 11.677 20.000 12.000 C 20.000 12.901 19.851 13.768 19.576 14.576 L 15.707 10.707 C 15.317 10.316 14.684 10.316 14.293 10.707 L 6.865 18.135 C 5.114 16.667 4.000 14.464 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 12.692 4.000 13.362 4.088 14.000 4.252 L 14.498 2.315 C 13.699 2.109 12.861 2.000 12.000 2.000 ZM 9.000 12.000 C 10.105 12.000 11.000 11.105 11.000 10.000 C 11.000 8.895 10.105 8.000 9.000 8.000 C 7.895 8.000 7.000 8.895 7.000 10.000 C 7.000 11.105 7.895 12.000 9.000 12.000 Z"),
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
        return _imageCircleAiFill!!
    }

private var _imageCircleAiFill: ImageVector? = null
