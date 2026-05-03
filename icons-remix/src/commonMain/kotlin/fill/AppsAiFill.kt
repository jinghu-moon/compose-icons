package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AppsAiFill: ImageVector
    get() {
        if (_appsAiFill != null) return _appsAiFill!!
        _appsAiFill = remixIcon(
            name = "AppsAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.750 2.500 C 9.097 2.500 11.000 4.403 11.000 6.750 L 11.000 11.000 L 6.750 11.000 C 4.403 11.000 2.500 9.097 2.500 6.750 C 2.500 4.403 4.403 2.500 6.750 2.500 ZM 6.750 13.000 L 11.000 13.000 L 11.000 17.250 C 11.000 19.597 9.097 21.500 6.750 21.500 C 4.403 21.500 2.500 19.597 2.500 17.250 C 2.500 14.903 4.403 13.000 6.750 13.000 ZM 13.000 13.000 L 17.250 13.000 C 19.597 13.000 21.500 14.903 21.500 17.250 C 21.500 19.597 19.597 21.500 17.250 21.500 C 14.903 21.500 13.000 19.597 13.000 17.250 L 13.000 13.000 ZM 18.008 10.069 L 17.746 10.670 C 17.554 11.110 16.946 11.110 16.754 10.670 L 16.492 10.069 C 16.025 8.998 15.184 8.146 14.134 7.679 L 13.327 7.320 C 12.891 7.126 12.891 6.492 13.327 6.298 L 14.089 5.959 C 15.166 5.480 16.022 4.596 16.481 3.488 L 16.750 2.839 C 16.937 2.387 17.563 2.387 17.750 2.839 L 18.019 3.488 C 18.478 4.596 19.334 5.480 20.411 5.959 L 21.173 6.298 C 21.609 6.492 21.609 7.126 21.173 7.320 L 20.366 7.679 C 19.316 8.146 18.475 8.998 18.008 10.069 Z"),
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
        return _appsAiFill!!
    }

private var _appsAiFill: ImageVector? = null
