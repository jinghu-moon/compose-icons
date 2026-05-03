package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FunctionAiLine: ImageVector
    get() {
        if (_functionAiLine != null) return _functionAiLine!!
        _functionAiLine = remixIcon(
            name = "FunctionAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 13.000 C 10.552 13.000 11.000 13.448 11.000 14.000 L 11.000 20.000 C 11.000 20.552 10.552 21.000 10.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 14.000 C 3.000 13.448 3.448 13.000 4.000 13.000 L 10.000 13.000 ZM 20.000 13.000 C 20.552 13.000 21.000 13.448 21.000 14.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 14.000 21.000 C 13.448 21.000 13.000 20.552 13.000 20.000 L 13.000 14.000 C 13.000 13.448 13.448 13.000 14.000 13.000 L 20.000 13.000 ZM 5.000 19.000 L 9.000 19.000 L 9.000 15.000 L 5.000 15.000 L 5.000 19.000 ZM 15.000 19.000 L 19.000 19.000 L 19.000 15.000 L 15.000 15.000 L 15.000 19.000 ZM 16.529 3.319 C 16.706 2.893 17.294 2.893 17.471 3.319 L 17.724 3.931 C 18.156 4.973 18.962 5.806 19.975 6.257 L 20.693 6.576 C 21.103 6.759 21.103 7.356 20.693 7.539 L 19.933 7.877 C 18.945 8.316 18.153 9.119 17.714 10.128 L 17.467 10.693 C 17.287 11.108 16.714 11.108 16.533 10.693 L 16.287 10.128 C 15.848 9.119 15.055 8.316 14.068 7.877 L 13.308 7.539 C 12.898 7.356 12.898 6.759 13.308 6.576 L 14.026 6.257 C 15.039 5.806 15.845 4.973 16.277 3.931 L 16.529 3.319 ZM 10.000 3.000 C 10.552 3.000 11.000 3.448 11.000 4.000 L 11.000 10.000 C 11.000 10.552 10.552 11.000 10.000 11.000 L 4.000 11.000 C 3.448 11.000 3.000 10.552 3.000 10.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 10.000 3.000 ZM 5.000 9.000 L 9.000 9.000 L 9.000 5.000 L 5.000 5.000 L 5.000 9.000 Z"),
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
        return _functionAiLine!!
    }

private var _functionAiLine: ImageVector? = null
