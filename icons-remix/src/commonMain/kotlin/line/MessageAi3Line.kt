package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MessageAi3Line: ImageVector
    get() {
        if (_messageAi3Line != null) return _messageAi3Line!!
        _messageAi3Line = remixIcon(
            name = "MessageAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.999 3.000 C 19.313 3.000 22.000 5.695 22.000 8.994 L 22.000 21.000 L 8.001 21.000 C 4.687 21.000 2.000 18.305 2.000 15.006 L 2.000 11.000 L 4.000 11.000 L 4.000 15.006 C 4.000 17.204 5.795 19.000 8.001 19.000 L 20.000 19.000 L 20.000 8.994 C 20.000 6.796 18.205 5.000 15.999 5.000 L 10.000 5.000 L 10.000 3.000 L 15.999 3.000 ZM 10.000 13.000 L 8.000 13.000 L 8.000 11.000 L 10.000 11.000 L 10.000 13.000 ZM 16.000 13.000 L 14.000 13.000 L 14.000 11.000 L 16.000 11.000 L 16.000 13.000 ZM 3.529 1.319 C 3.706 0.893 4.294 0.893 4.471 1.319 L 4.724 1.931 C 5.156 2.973 5.962 3.806 6.975 4.257 L 7.692 4.576 C 8.103 4.759 8.103 5.356 7.692 5.539 L 6.933 5.877 C 5.945 6.316 5.153 7.119 4.714 8.128 L 4.467 8.693 C 4.286 9.107 3.714 9.107 3.533 8.693 L 3.286 8.128 C 2.847 7.119 2.055 6.316 1.067 5.877 L 0.308 5.539 C -0.103 5.356 -0.103 4.759 0.308 4.576 L 1.025 4.257 C 2.038 3.806 2.844 2.973 3.276 1.931 L 3.529 1.319 Z"),
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
        return _messageAi3Line!!
    }

private var _messageAi3Line: ImageVector? = null
