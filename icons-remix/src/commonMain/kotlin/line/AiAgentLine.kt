package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AiAgentLine: ImageVector
    get() {
        if (_aiAgentLine != null) return _aiAgentLine!!
        _aiAgentLine = remixIcon(
            name = "AiAgentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 14.710 20.920 17.170 19.171 18.970 C 17.355 20.838 14.812 22.000 12.000 22.000 C 9.188 22.000 6.645 20.838 4.829 18.970 C 3.079 17.170 2.000 14.710 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 16.000 C 10.002 16.000 8.201 16.837 6.925 18.182 C 8.306 19.317 10.072 20.000 12.000 20.000 C 13.927 20.000 15.693 19.317 17.074 18.182 C 15.798 16.838 13.998 16.000 12.000 16.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 13.770 4.575 15.404 5.548 16.729 C 7.182 15.048 9.468 14.000 12.000 14.000 C 14.532 14.000 16.817 15.049 18.451 16.729 C 19.425 15.404 20.000 13.770 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 11.529 5.319 C 11.706 4.893 12.294 4.893 12.471 5.319 L 12.724 5.931 C 13.156 6.973 13.962 7.806 14.975 8.257 L 15.692 8.575 C 16.103 8.758 16.103 9.356 15.692 9.539 L 14.933 9.877 C 13.945 10.316 13.153 11.119 12.714 12.128 L 12.467 12.693 C 12.286 13.107 11.714 13.107 11.533 12.693 L 11.287 12.128 C 10.848 11.119 10.055 10.316 9.067 9.877 L 8.308 9.539 C 7.897 9.356 7.897 8.758 8.308 8.575 L 9.025 8.257 C 10.038 7.806 10.844 6.973 11.276 5.931 L 11.529 5.319 Z"),
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
        return _aiAgentLine!!
    }

private var _aiAgentLine: ImageVector? = null
