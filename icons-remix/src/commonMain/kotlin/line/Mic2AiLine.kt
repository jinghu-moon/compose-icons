package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Mic2AiLine: ImageVector
    get() {
        if (_mic2AiLine != null) return _mic2AiLine!!
        _mic2AiLine = remixIcon(
            name = "Mic2AiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.713 7.128 L 20.467 7.694 C 20.286 8.108 19.714 8.108 19.533 7.694 L 19.287 7.128 C 18.847 6.119 18.056 5.316 17.068 4.877 L 16.308 4.539 C 15.897 4.357 15.897 3.759 16.308 3.576 L 17.025 3.257 C 18.038 2.807 18.844 1.974 19.276 0.931 L 19.529 0.320 C 19.706 -0.107 20.294 -0.107 20.471 0.320 L 20.724 0.931 C 21.156 1.974 21.962 2.807 22.975 3.257 L 23.692 3.576 C 24.103 3.759 24.103 4.357 23.692 4.539 L 22.932 4.877 C 21.944 5.316 21.153 6.119 20.713 7.128 ZM 7.000 6.000 C 7.000 3.239 9.239 1.000 12.000 1.000 C 12.991 1.000 13.918 1.290 14.697 1.789 L 13.617 3.472 C 13.151 3.173 12.597 3.000 12.000 3.000 C 10.343 3.000 9.000 4.343 9.000 6.000 L 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 L 15.000 7.000 L 17.000 7.000 L 17.000 12.000 C 17.000 14.761 14.761 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 L 7.000 6.000 ZM 2.192 13.962 L 4.154 13.569 C 4.883 17.236 8.119 20.000 12.000 20.000 C 15.881 20.000 19.117 17.236 19.846 13.569 L 21.808 13.962 C 20.896 18.545 16.852 22.000 12.000 22.000 C 7.149 22.000 3.104 18.545 2.192 13.962 Z"),
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
        return _mic2AiLine!!
    }

private var _mic2AiLine: ImageVector? = null
