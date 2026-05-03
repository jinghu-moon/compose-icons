package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SearchAi2Line: ImageVector
    get() {
        if (_searchAi2Line != null) return _searchAi2Line!!
        _searchAi2Line = remixIcon(
            name = "SearchAi2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.313 20.899 L 20.899 22.313 L 18.071 19.485 L 19.485 18.071 L 22.313 20.899 ZM 11.000 2.000 C 11.264 2.000 11.525 2.014 11.783 2.036 C 11.442 2.635 11.202 3.297 11.084 4.002 C 11.056 4.002 11.028 4.000 11.000 4.000 C 7.133 4.000 4.000 7.133 4.000 11.000 C 4.000 14.868 7.133 18.000 11.000 18.000 C 14.868 18.000 18.000 14.868 18.000 11.000 C 18.000 10.972 17.997 10.943 17.997 10.915 C 18.702 10.797 19.364 10.557 19.963 10.216 C 19.985 10.474 20.000 10.736 20.000 11.000 C 20.000 15.968 15.968 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 ZM 16.529 1.319 C 16.706 0.893 17.294 0.893 17.471 1.319 L 17.724 1.931 C 18.156 2.973 18.962 3.806 19.975 4.257 L 20.692 4.576 C 21.103 4.759 21.103 5.356 20.692 5.539 L 19.933 5.877 C 18.945 6.316 18.153 7.119 17.714 8.128 L 17.467 8.693 C 17.286 9.107 16.714 9.107 16.533 8.693 L 16.287 8.128 C 15.848 7.119 15.055 6.316 14.067 5.877 L 13.308 5.539 C 12.897 5.356 12.898 4.759 13.308 4.576 L 14.025 4.257 C 15.038 3.806 15.844 2.973 16.276 1.931 L 16.529 1.319 Z"),
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
        return _searchAi2Line!!
    }

private var _searchAi2Line: ImageVector? = null
