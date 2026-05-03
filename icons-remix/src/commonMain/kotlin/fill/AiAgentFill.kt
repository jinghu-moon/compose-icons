package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AiAgentFill: ImageVector
    get() {
        if (_aiAgentFill != null) return _aiAgentFill!!
        _aiAgentFill = remixIcon(
            name = "AiAgentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 15.000 C 9.713 15.000 7.650 15.961 6.192 17.500 C 7.650 19.039 9.713 20.000 12.000 20.000 C 14.287 20.000 16.349 19.039 17.807 17.500 C 16.349 15.961 14.287 15.000 12.000 15.000 ZM 12.471 5.319 C 12.294 4.893 11.706 4.893 11.529 5.319 L 11.276 5.931 C 10.844 6.973 10.038 7.806 9.025 8.257 L 8.308 8.576 C 7.898 8.759 7.897 9.356 8.308 9.539 L 9.067 9.877 C 10.055 10.316 10.848 11.119 11.287 12.128 L 11.533 12.693 C 11.714 13.107 12.286 13.107 12.467 12.693 L 12.714 12.128 C 13.153 11.119 13.945 10.316 14.933 9.877 L 15.692 9.539 C 16.103 9.356 16.103 8.759 15.692 8.576 L 14.975 8.257 C 13.962 7.806 13.156 6.973 12.724 5.931 L 12.471 5.319 Z"),
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
        return _aiAgentFill!!
    }

private var _aiAgentFill: ImageVector? = null
