package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeakLine: ImageVector
    get() {
        if (_speakLine != null) return _speakLine!!
        _speakLine = remixIcon(
            name = "SpeakLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.934 8.965 C 16.426 5.036 13.068 2.000 9.000 2.000 C 4.582 2.000 1.000 5.582 1.000 10.000 C 1.000 11.892 1.657 13.631 2.756 15.001 C 3.564 16.009 4.000 17.125 4.000 18.306 L 4.000 22.000 L 13.000 22.000 L 13.001 19.000 L 15.000 19.000 C 16.105 19.000 17.000 18.105 17.000 17.000 L 17.000 14.071 L 18.959 13.232 C 19.302 13.085 19.332 12.737 19.184 12.504 L 16.934 8.965 ZM 3.000 10.000 C 3.000 6.686 5.686 4.000 9.000 4.000 C 12.024 4.000 14.566 6.251 14.950 9.221 L 15.007 9.663 L 16.550 12.088 L 15.000 12.752 L 15.000 17.000 L 11.002 17.000 L 11.001 20.000 L 6.000 20.000 L 6.000 18.306 C 6.000 16.667 5.410 15.114 4.316 13.750 C 3.468 12.693 3.000 11.385 3.000 10.000 ZM 21.153 18.102 L 19.489 16.993 C 20.444 15.564 21.000 13.847 21.000 12.000 C 21.000 10.153 20.444 8.436 19.489 7.007 L 21.153 5.898 C 22.320 7.644 23.000 9.743 23.000 12.000 C 23.000 14.258 22.320 16.356 21.153 18.102 Z"),
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
        return _speakLine!!
    }

private var _speakLine: ImageVector? = null
