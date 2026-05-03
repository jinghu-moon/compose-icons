package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SearchAi3Line: ImageVector
    get() {
        if (_searchAi3Line != null) return _searchAi3Line!!
        _searchAi3Line = remixIcon(
            name = "SearchAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.000 C 15.968 2.000 20.000 6.032 20.000 11.000 C 20.000 13.124 19.263 15.077 18.031 16.617 L 22.313 20.899 L 20.899 22.314 L 16.617 18.031 C 15.077 19.263 13.124 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 ZM 11.000 4.000 C 7.133 4.000 4.000 7.132 4.000 11.000 C 4.000 14.867 7.133 18.000 11.000 18.000 C 12.896 18.000 14.615 17.248 15.875 16.025 L 16.024 15.875 C 17.247 14.615 18.000 12.895 18.000 11.000 C 18.000 7.132 14.867 4.000 11.000 4.000 ZM 10.529 7.319 C 10.706 6.893 11.294 6.893 11.471 7.319 L 11.724 7.930 C 12.156 8.973 12.962 9.806 13.975 10.257 L 14.692 10.576 C 15.103 10.759 15.103 11.356 14.692 11.539 L 13.933 11.877 C 12.945 12.316 12.153 13.119 11.714 14.128 L 11.467 14.693 C 11.286 15.107 10.714 15.107 10.533 14.693 L 10.287 14.128 C 9.848 13.119 9.055 12.316 8.067 11.877 L 7.308 11.539 C 6.897 11.356 6.897 10.759 7.308 10.576 L 8.025 10.257 C 9.038 9.806 9.844 8.973 10.276 7.930 L 10.529 7.319 Z"),
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
        return _searchAi3Line!!
    }

private var _searchAi3Line: ImageVector? = null
