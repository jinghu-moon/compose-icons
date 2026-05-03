package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SearchAi3Fill: ImageVector
    get() {
        if (_searchAi3Fill != null) return _searchAi3Fill!!
        _searchAi3Fill = remixIcon(
            name = "SearchAi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.000 C 15.968 2.000 20.000 6.032 20.000 11.000 C 20.000 13.124 19.263 15.077 18.031 16.617 L 22.313 20.899 L 20.899 22.313 L 16.617 18.031 C 15.077 19.263 13.124 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 ZM 11.471 7.318 C 11.294 6.893 10.706 6.893 10.529 7.318 L 10.276 7.930 C 9.844 8.972 9.038 9.805 8.025 10.256 L 7.308 10.575 C 6.897 10.758 6.897 11.355 7.308 11.538 L 8.067 11.876 C 9.055 12.315 9.848 13.118 10.287 14.127 L 10.533 14.692 C 10.714 15.106 11.286 15.106 11.467 14.692 L 11.714 14.127 C 12.153 13.118 12.945 12.315 13.933 11.876 L 14.692 11.538 C 15.103 11.355 15.103 10.758 14.692 10.575 L 13.975 10.256 C 12.962 9.805 12.156 8.972 11.724 7.930 L 11.471 7.318 Z"),
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
        return _searchAi3Fill!!
    }

private var _searchAi3Fill: ImageVector? = null
