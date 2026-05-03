package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LoopRightAiFill: ImageVector
    get() {
        if (_loopRightAiFill != null) return _loopRightAiFill!!
        _loopRightAiFill = remixIcon(
            name = "LoopRightAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 8.856 22.000 6.051 20.548 4.219 18.281 L 2.000 20.500 L 2.000 14.500 L 8.000 14.500 L 5.643 16.857 C 7.106 18.770 9.410 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 L 22.000 12.000 ZM 11.529 8.319 C 11.706 7.893 12.294 7.893 12.471 8.319 L 12.724 8.931 C 13.156 9.973 13.962 10.806 14.975 11.257 L 15.692 11.576 C 16.103 11.759 16.103 12.356 15.692 12.539 L 14.933 12.877 C 13.945 13.316 13.153 14.119 12.714 15.128 L 12.467 15.693 C 12.286 16.108 11.714 16.108 11.533 15.693 L 11.287 15.128 C 10.848 14.119 10.055 13.316 9.067 12.877 L 8.308 12.539 C 7.897 12.356 7.897 11.759 8.308 11.576 L 9.025 11.257 C 10.038 10.806 10.844 9.973 11.276 8.931 L 11.529 8.319 ZM 12.000 2.000 C 15.144 2.000 17.949 3.452 19.781 5.719 L 22.000 3.500 L 22.000 9.500 L 16.000 9.500 L 18.357 7.143 C 16.894 5.230 14.590 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 Z"),
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
        return _loopRightAiFill!!
    }

private var _loopRightAiFill: ImageVector? = null
