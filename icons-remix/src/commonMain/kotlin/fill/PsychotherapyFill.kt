package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PsychotherapyFill: ImageVector
    get() {
        if (_psychotherapyFill != null) return _psychotherapyFill!!
        _psychotherapyFill = remixIcon(
            name = "PsychotherapyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.000 C 15.068 2.000 18.426 5.036 18.934 8.965 L 21.184 12.504 C 21.332 12.737 21.302 13.085 20.959 13.232 L 19.000 14.071 L 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 L 15.001 19.000 L 15.000 22.000 L 6.000 22.000 L 6.000 18.306 C 6.000 17.125 5.564 16.009 4.755 15.001 C 3.657 13.631 3.000 11.892 3.000 10.000 C 3.000 5.582 6.582 2.000 11.000 2.000 ZM 11.000 7.000 C 10.448 7.000 10.000 7.448 10.000 8.000 L 10.000 8.999 L 9.000 9.000 C 8.448 9.000 8.000 9.448 8.000 10.000 C 8.000 10.552 8.448 11.000 9.000 11.000 L 10.000 10.999 L 10.000 12.000 C 10.000 12.552 10.448 13.000 11.000 13.000 C 11.552 13.000 12.000 12.552 12.000 12.000 L 12.000 11.000 L 13.000 11.000 C 13.552 11.000 14.000 10.552 14.000 10.000 C 14.000 9.448 13.552 9.000 13.000 9.000 L 12.000 9.000 L 12.000 8.000 C 12.000 7.448 11.552 7.000 11.000 7.000 Z"),
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
        return _psychotherapyFill!!
    }

private var _psychotherapyFill: ImageVector? = null
