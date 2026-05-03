package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EaseInControlPoint: ImageVector
    get() {
        if (_easeInControlPoint != null) return _easeInControlPoint!!
        _easeInControlPoint = tablerFilledIcon(
            name = "EaseInControlPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 16.000 C 20.526 16.000 21.808 17.145 21.980 18.661 C 22.152 20.177 21.160 21.581 19.673 21.923 C 18.187 22.266 16.680 21.438 16.171 20.000 L 15.000 20.000 C 14.448 20.000 14.000 19.552 14.000 19.000 C 14.000 18.448 14.448 18.000 15.000 18.000 L 16.170 18.000 C 16.594 16.801 17.728 15.999 19.000 16.000M 21.530 2.152 C 21.755 2.293 21.915 2.517 21.974 2.775 C 22.034 3.034 21.989 3.305 21.848 3.530 L 21.562 3.975 L 21.389 4.239 C 20.978 4.858 20.558 5.471 20.129 6.078 C 18.766 8.011 17.305 9.873 15.753 11.658 C 12.958 14.853 10.209 17.296 7.582 18.698 C 5.989 19.546 4.459 20.000 3.000 20.000 C 2.448 20.000 2.000 19.552 2.000 19.000 C 2.000 18.448 2.448 18.000 3.000 18.000 C 4.097 18.000 5.317 17.639 6.640 16.932 C 9.013 15.667 11.598 13.370 14.247 10.342 C 15.754 8.608 17.173 6.799 18.497 4.922 C 18.838 4.441 19.172 3.956 19.500 3.466 L 19.955 2.776 Q 20.088 2.572 20.151 2.470 C 20.292 2.245 20.516 2.085 20.774 2.026 C 21.033 1.966 21.304 2.011 21.529 2.152M 12.000 18.000 C 12.552 18.000 13.000 18.448 13.000 19.000 C 13.000 19.552 12.552 20.000 12.000 20.000 L 10.000 20.000 C 9.448 20.000 9.000 19.552 9.000 19.000 C 9.000 18.448 9.448 18.000 10.000 18.000 Z"),
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
        return _easeInControlPoint!!
    }

private var _easeInControlPoint: ImageVector? = null
