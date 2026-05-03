package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SearchAiFill: ImageVector
    get() {
        if (_searchAiFill != null) return _searchAiFill!!
        _searchAiFill = remixIcon(
            name = "SearchAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.000 C 11.264 2.000 11.525 2.014 11.783 2.036 C 11.285 2.910 11.000 3.922 11.000 5.000 C 11.000 8.314 13.686 11.000 17.000 11.000 C 18.078 11.000 19.088 10.713 19.963 10.216 C 19.985 10.474 20.000 10.736 20.000 11.000 C 20.000 13.124 19.263 15.077 18.031 16.617 L 22.313 20.899 L 20.899 22.313 L 16.617 18.031 C 15.077 19.263 13.124 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 ZM 16.529 1.319 C 16.706 0.893 17.294 0.893 17.471 1.319 L 17.724 1.930 C 18.156 2.973 18.962 3.806 19.975 4.257 L 20.692 4.576 C 21.103 4.759 21.103 5.356 20.692 5.539 L 19.933 5.877 C 18.945 6.316 18.153 7.119 17.714 8.128 L 17.467 8.693 C 17.286 9.107 16.714 9.107 16.533 8.693 L 16.287 8.128 C 15.848 7.119 15.055 6.316 14.067 5.877 L 13.308 5.539 C 12.897 5.356 12.898 4.759 13.308 4.576 L 14.025 4.257 C 15.038 3.806 15.844 2.973 16.276 1.930 L 16.529 1.319 Z"),
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
        return _searchAiFill!!
    }

private var _searchAiFill: ImageVector? = null
