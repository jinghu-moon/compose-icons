package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SearchAi4Line: ImageVector
    get() {
        if (_searchAi4Line != null) return _searchAi4Line!!
        _searchAi4Line = remixIcon(
            name = "SearchAi4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.313 20.899 L 20.899 22.313 L 18.071 19.485 L 19.485 18.071 L 22.313 20.899 ZM 11.000 2.000 C 15.968 2.000 20.000 6.032 20.000 11.000 C 20.000 15.968 15.968 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 ZM 11.000 4.000 C 7.133 4.000 4.000 7.132 4.000 11.000 C 4.000 14.867 7.133 18.000 11.000 18.000 C 14.868 18.000 18.000 14.867 18.000 11.000 C 18.000 7.132 14.867 4.000 11.000 4.000 ZM 10.529 7.319 C 10.706 6.893 11.294 6.893 11.471 7.319 L 11.724 7.930 C 12.156 8.973 12.962 9.806 13.975 10.257 L 14.692 10.575 C 15.103 10.758 15.103 11.356 14.692 11.539 L 13.933 11.877 C 12.945 12.316 12.153 13.119 11.714 14.128 L 11.467 14.693 C 11.286 15.107 10.714 15.107 10.533 14.693 L 10.287 14.128 C 9.848 13.119 9.055 12.316 8.067 11.877 L 7.308 11.539 C 6.897 11.356 6.897 10.758 7.308 10.575 L 8.025 10.257 C 9.038 9.806 9.844 8.973 10.276 7.930 L 10.529 7.319 Z"),
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
        return _searchAi4Line!!
    }

private var _searchAi4Line: ImageVector? = null
