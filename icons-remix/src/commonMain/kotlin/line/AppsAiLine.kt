package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AppsAiLine: ImageVector
    get() {
        if (_appsAiLine != null) return _appsAiLine!!
        _appsAiLine = remixIcon(
            name = "AppsAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 17.250 C 11.000 19.597 9.097 21.500 6.750 21.500 C 4.403 21.500 2.500 19.597 2.500 17.250 C 2.500 14.903 4.403 13.000 6.750 13.000 L 11.000 13.000 L 11.000 17.250 ZM 17.250 13.000 C 19.597 13.000 21.500 14.903 21.500 17.250 C 21.500 19.597 19.597 21.500 17.250 21.500 C 14.903 21.500 13.000 19.597 13.000 17.250 L 13.000 13.000 L 17.250 13.000 ZM 6.750 15.000 C 5.507 15.000 4.500 16.007 4.500 17.250 C 4.500 18.493 5.507 19.500 6.750 19.500 C 7.993 19.500 9.000 18.493 9.000 17.250 L 9.000 15.000 L 6.750 15.000 ZM 15.000 17.250 C 15.000 18.493 16.007 19.500 17.250 19.500 C 18.493 19.500 19.500 18.493 19.500 17.250 C 19.500 16.007 18.493 15.000 17.250 15.000 L 15.000 15.000 L 15.000 17.250 ZM 6.750 2.500 C 9.097 2.500 11.000 4.403 11.000 6.750 L 11.000 11.000 L 6.750 11.000 C 4.403 11.000 2.500 9.097 2.500 6.750 C 2.500 4.403 4.403 2.500 6.750 2.500 ZM 16.750 2.840 C 16.938 2.387 17.563 2.387 17.750 2.840 L 18.020 3.488 C 18.479 4.596 19.335 5.480 20.411 5.959 L 21.173 6.298 C 21.609 6.492 21.609 7.126 21.173 7.320 L 20.365 7.679 C 19.316 8.145 18.475 8.998 18.008 10.069 L 17.746 10.670 C 17.554 11.109 16.946 11.109 16.754 10.670 L 16.492 10.069 C 16.025 8.998 15.184 8.145 14.135 7.679 L 13.327 7.320 C 12.891 7.126 12.891 6.492 13.327 6.298 L 14.089 5.959 C 15.165 5.480 16.022 4.596 16.480 3.488 L 16.750 2.840 ZM 6.750 4.500 C 5.507 4.500 4.500 5.507 4.500 6.750 C 4.500 7.992 5.507 9.000 6.750 9.000 L 9.000 9.000 L 9.000 6.750 C 9.000 5.507 7.993 4.500 6.750 4.500 Z"),
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
        return _appsAiLine!!
    }

private var _appsAiLine: ImageVector? = null
