package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeakAiLine: ImageVector
    get() {
        if (_speakAiLine != null) return _speakAiLine!!
        _speakAiLine = remixIcon(
            name = "SpeakAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.713 7.128 L 20.467 7.694 C 20.286 8.108 19.714 8.108 19.533 7.694 L 19.287 7.128 C 18.847 6.119 18.056 5.316 17.068 4.877 L 16.308 4.539 C 15.897 4.357 15.897 3.759 16.308 3.576 L 17.025 3.257 C 18.038 2.807 18.844 1.974 19.276 0.931 L 19.529 0.320 C 19.706 -0.107 20.294 -0.107 20.471 0.320 L 20.724 0.931 C 21.156 1.974 21.962 2.807 22.975 3.257 L 23.692 3.576 C 24.103 3.759 24.103 4.357 23.692 4.539 L 22.932 4.877 C 21.944 5.316 21.153 6.119 20.713 7.128 ZM 9.000 2.000 C 13.068 2.000 16.426 5.036 16.934 8.965 L 19.184 12.504 C 19.332 12.737 19.302 13.085 18.959 13.232 L 17.000 14.071 L 17.000 17.000 C 17.000 18.105 16.105 19.000 15.000 19.000 L 13.001 19.000 L 13.000 22.000 L 4.000 22.000 L 4.000 18.306 C 4.000 17.125 3.564 16.009 2.756 15.001 C 1.657 13.631 1.000 11.892 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 ZM 9.000 4.000 C 5.686 4.000 3.000 6.686 3.000 10.000 C 3.000 11.385 3.468 12.693 4.316 13.750 C 5.410 15.114 6.000 16.667 6.000 18.306 L 6.000 20.000 L 11.001 20.000 L 11.002 17.000 L 15.000 17.000 L 15.000 12.752 L 16.550 12.088 L 15.007 9.663 L 14.950 9.221 C 14.566 6.251 12.024 4.000 9.000 4.000 ZM 19.489 16.993 L 21.153 18.102 C 22.320 16.356 23.000 14.258 23.000 12.000 C 23.000 11.317 22.938 10.649 22.819 10.000 L 20.876 10.500 C 20.957 10.988 21.000 11.489 21.000 12.000 C 21.000 13.847 20.444 15.564 19.489 16.993 Z"),
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
        return _speakAiLine!!
    }

private var _speakAiLine: ImageVector? = null
