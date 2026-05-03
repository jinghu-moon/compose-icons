package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiamondFill: ImageVector
    get() {
        if (_diamondFill != null) return _diamondFill!!
        _diamondFill = remixIcon(
            name = "DiamondFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.467 8.694 L 19.713 8.128 C 20.153 7.119 20.944 6.316 21.932 5.877 L 22.692 5.539 C 23.103 5.357 23.103 4.759 22.692 4.576 L 21.975 4.257 C 20.962 3.807 20.156 2.974 19.724 1.931 L 19.471 1.320 C 19.294 0.893 18.706 0.893 18.529 1.320 L 18.276 1.931 C 17.844 2.974 17.038 3.807 16.025 4.257 L 15.308 4.576 C 14.897 4.759 14.897 5.357 15.308 5.539 L 16.068 5.877 C 17.056 6.316 17.847 7.119 18.287 8.128 L 18.533 8.694 C 18.714 9.108 19.286 9.108 19.467 8.694 ZM 13.387 6.339 C 13.661 6.773 14.036 7.093 14.511 7.300 L 15.076 7.547 C 15.647 7.795 16.054 8.195 16.299 8.745 L 16.636 9.505 C 17.364 11.142 19.528 11.399 20.709 10.279 L 20.800 10.400 C 21.087 10.782 21.063 11.314 20.743 11.669 L 11.743 21.669 C 11.554 21.880 11.283 22.000 11.000 22.000 C 10.717 22.000 10.446 21.880 10.257 21.669 L 1.257 11.669 C 0.937 11.314 0.913 10.782 1.200 10.400 L 4.200 6.400 C 4.389 6.148 4.685 6.000 5.000 6.000 L 13.206 6.000 C 13.257 6.116 13.317 6.229 13.387 6.339 Z"),
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
        return _diamondFill!!
    }

private var _diamondFill: ImageVector? = null
