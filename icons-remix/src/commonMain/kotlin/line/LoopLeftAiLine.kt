package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoopLeftAiLine: ImageVector
    get() {
        if (_loopLeftAiLine != null) return _loopLeftAiLine!!
        _loopLeftAiLine = remixIcon(
            name = "LoopLeftAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 14.748 20.000 17.175 18.614 18.615 16.500 L 16.000 16.500 L 16.000 14.500 L 22.000 14.500 L 22.000 20.500 L 20.000 20.500 L 20.000 18.001 C 18.176 20.429 15.272 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 4.000 12.000 ZM 11.529 8.319 C 11.706 7.893 12.294 7.893 12.471 8.319 L 12.724 8.931 C 13.156 9.973 13.962 10.806 14.975 11.257 L 15.692 11.576 C 16.103 11.759 16.103 12.356 15.692 12.539 L 14.933 12.877 C 13.945 13.316 13.153 14.119 12.714 15.128 L 12.467 15.693 C 12.286 16.108 11.714 16.108 11.533 15.693 L 11.287 15.128 C 10.848 14.119 10.055 13.316 9.067 12.877 L 8.308 12.539 C 7.897 12.356 7.897 11.759 8.308 11.576 L 9.025 11.257 C 10.038 10.806 10.844 9.973 11.276 8.931 L 11.529 8.319 ZM 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 L 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 9.252 4.000 6.825 5.386 5.385 7.500 L 8.000 7.500 L 8.000 9.500 L 2.000 9.500 L 2.000 3.500 L 4.000 3.500 L 4.000 5.999 C 5.824 3.571 8.728 2.000 12.000 2.000 Z"),
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
        return _loopLeftAiLine!!
    }

private var _loopLeftAiLine: ImageVector? = null
