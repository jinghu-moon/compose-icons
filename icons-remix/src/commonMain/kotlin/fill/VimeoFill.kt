package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VimeoFill: ImageVector
    get() {
        if (_vimeoFill != null) return _vimeoFill!!
        _vimeoFill = remixIcon(
            name = "VimeoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.174 8.301 C 0.893 7.888 0.922 7.888 1.502 7.379 C 2.734 6.297 3.896 5.113 5.238 4.167 C 6.453 3.315 8.064 2.765 9.165 4.120 C 10.179 5.369 10.203 7.262 10.460 8.770 C 10.717 10.334 10.963 11.934 11.511 13.431 C 11.663 13.851 11.953 14.647 12.479 14.714 C 13.157 14.807 13.847 13.618 14.162 13.174 C 14.979 11.995 16.087 10.405 15.947 8.888 C 15.809 7.276 14.068 7.579 12.981 7.964 C 13.156 6.155 14.839 4.121 16.461 3.433 C 18.180 2.720 20.737 2.732 21.601 4.671 C 22.524 6.773 21.694 9.214 20.689 11.119 C 19.593 13.187 18.180 15.101 16.671 16.889 C 15.340 18.477 13.765 20.219 11.780 20.978 C 9.514 21.842 8.171 20.158 7.399 18.208 C 6.556 16.085 6.137 13.702 5.529 11.491 C 5.273 10.557 4.969 9.494 4.362 8.723 C 3.570 7.728 2.670 8.663 1.888 9.200 C 1.619 8.933 1.397 8.593 1.174 8.301 Z"),
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
        return _vimeoFill!!
    }

private var _vimeoFill: ImageVector? = null
