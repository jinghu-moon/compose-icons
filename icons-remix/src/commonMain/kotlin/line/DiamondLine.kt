package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiamondLine: ImageVector
    get() {
        if (_diamondLine != null) return _diamondLine!!
        _diamondLine = remixIcon(
            name = "DiamondLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.467 8.694 L 19.713 8.128 C 20.153 7.119 20.944 6.316 21.932 5.877 L 22.692 5.539 C 23.103 5.357 23.103 4.759 22.692 4.576 L 21.975 4.257 C 20.962 3.807 20.156 2.974 19.724 1.931 L 19.471 1.320 C 19.294 0.893 18.706 0.893 18.529 1.320 L 18.276 1.931 C 17.844 2.974 17.038 3.807 16.025 4.257 L 15.308 4.576 C 14.897 4.759 14.897 5.357 15.308 5.539 L 16.068 5.877 C 17.056 6.316 17.847 7.119 18.287 8.128 L 18.533 8.694 C 18.714 9.108 19.286 9.108 19.467 8.694 ZM 5.000 6.000 C 4.685 6.000 4.389 6.148 4.200 6.400 L 1.200 10.400 C 0.913 10.782 0.937 11.314 1.257 11.669 L 10.257 21.669 C 10.446 21.880 10.717 22.000 11.000 22.000 C 11.283 22.000 11.554 21.880 11.743 21.669 L 20.743 11.669 L 19.257 10.331 L 11.000 19.505 L 3.293 10.942 L 5.500 8.000 L 14.000 8.000 L 14.000 6.000 L 5.000 6.000 Z"),
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
        return _diamondLine!!
    }

private var _diamondLine: ImageVector? = null
