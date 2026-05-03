package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SearchAi2Fill: ImageVector
    get() {
        if (_searchAi2Fill != null) return _searchAi2Fill!!
        _searchAi2Fill = remixIcon(
            name = "SearchAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.313 20.899 L 20.899 22.313 L 18.071 19.485 L 19.485 18.071 L 22.313 20.899 ZM 11.000 2.000 C 11.264 2.000 11.525 2.014 11.783 2.036 C 11.285 2.911 11.000 3.922 11.000 5.000 C 11.000 8.314 13.686 11.000 17.000 11.000 C 18.078 11.000 19.088 10.714 19.963 10.216 C 19.985 10.474 20.000 10.736 20.000 11.000 C 20.000 15.968 15.968 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 ZM 16.529 1.318 C 16.706 0.893 17.294 0.893 17.471 1.318 L 17.724 1.930 C 18.156 2.972 18.962 3.805 19.975 4.256 L 20.692 4.575 C 21.103 4.758 21.103 5.355 20.692 5.538 L 19.933 5.876 C 18.945 6.315 18.153 7.119 17.714 8.127 L 17.467 8.692 C 17.286 9.107 16.714 9.107 16.533 8.692 L 16.287 8.127 C 15.848 7.118 15.055 6.315 14.067 5.876 L 13.308 5.538 C 12.897 5.355 12.897 4.758 13.308 4.575 L 14.025 4.256 C 15.038 3.805 15.844 2.973 16.276 1.930 L 16.529 1.318 Z"),
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
        return _searchAi2Fill!!
    }

private var _searchAi2Fill: ImageVector? = null
