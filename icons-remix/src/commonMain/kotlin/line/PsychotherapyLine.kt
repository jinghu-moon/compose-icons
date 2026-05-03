package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PsychotherapyLine: ImageVector
    get() {
        if (_psychotherapyLine != null) return _psychotherapyLine!!
        _psychotherapyLine = remixIcon(
            name = "PsychotherapyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.000 C 15.068 2.000 18.426 5.036 18.934 8.965 L 21.184 12.504 C 21.332 12.737 21.302 13.085 20.959 13.232 L 19.000 14.071 L 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 L 15.001 19.000 L 15.000 22.000 L 6.000 22.000 L 6.000 18.306 C 6.000 17.125 5.564 16.009 4.755 15.001 C 3.657 13.631 3.000 11.892 3.000 10.000 C 3.000 5.582 6.582 2.000 11.000 2.000 ZM 11.000 4.000 C 7.686 4.000 5.000 6.686 5.000 10.000 C 5.000 11.385 5.468 12.693 6.316 13.750 C 7.410 15.114 8.000 16.667 8.000 18.306 L 8.000 20.000 L 13.001 20.000 L 13.002 17.000 L 17.000 17.000 L 17.000 12.752 L 18.550 12.088 L 17.007 9.663 L 16.950 9.221 C 16.566 6.251 14.024 4.000 11.000 4.000 ZM 11.000 7.000 C 11.552 7.000 12.000 7.448 12.000 8.000 L 12.000 9.000 L 13.000 9.000 C 13.552 9.000 14.000 9.448 14.000 10.000 C 14.000 10.552 13.552 11.000 13.000 11.000 L 12.000 11.000 L 12.000 12.000 C 12.000 12.552 11.552 13.000 11.000 13.000 C 10.448 13.000 10.000 12.552 10.000 12.000 L 10.000 10.999 L 9.000 11.000 C 8.448 11.000 8.000 10.552 8.000 10.000 C 8.000 9.448 8.448 9.000 9.000 9.000 L 10.000 8.999 L 10.000 8.000 C 10.000 7.448 10.448 7.000 11.000 7.000 Z"),
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
        return _psychotherapyLine!!
    }

private var _psychotherapyLine: ImageVector? = null
