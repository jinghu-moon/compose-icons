package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeakAiFill: ImageVector
    get() {
        if (_speakAiFill != null) return _speakAiFill!!
        _speakAiFill = remixIcon(
            name = "SpeakAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.713 7.128 L 20.467 7.694 C 20.286 8.108 19.714 8.108 19.533 7.694 L 19.287 7.128 C 18.847 6.119 18.056 5.316 17.068 4.877 L 16.308 4.539 C 15.897 4.357 15.897 3.759 16.308 3.576 L 17.025 3.257 C 18.038 2.807 18.844 1.974 19.276 0.931 L 19.529 0.320 C 19.706 -0.107 20.294 -0.107 20.471 0.320 L 20.724 0.931 C 21.156 1.974 21.962 2.807 22.975 3.257 L 23.692 3.576 C 24.103 3.759 24.103 4.357 23.692 4.539 L 22.932 4.877 C 21.944 5.316 21.153 6.119 20.713 7.128 ZM 9.000 2.000 C 13.068 2.000 16.426 5.036 16.934 8.965 L 19.184 12.504 C 19.332 12.737 19.302 13.085 18.959 13.232 L 17.000 14.071 L 17.000 17.000 C 17.000 18.105 16.105 19.000 15.000 19.000 L 13.001 19.000 L 13.000 22.000 L 4.000 22.000 L 4.000 18.306 C 4.000 17.125 3.564 16.009 2.756 15.001 C 1.657 13.631 1.000 11.892 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 ZM 21.153 18.102 L 19.489 16.993 C 20.444 15.564 21.000 13.847 21.000 12.000 C 21.000 11.489 20.957 10.988 20.876 10.500 L 22.819 10.000 C 22.938 10.649 23.000 11.317 23.000 12.000 C 23.000 14.258 22.320 16.356 21.153 18.102 Z"),
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
        return _speakAiFill!!
    }

private var _speakAiFill: ImageVector? = null
