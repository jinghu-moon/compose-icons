package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BlueskyFill: ImageVector
    get() {
        if (_blueskyFill != null) return _blueskyFill!!
        _blueskyFill = remixIcon(
            name = "BlueskyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 11.388 C 11.094 9.627 8.628 6.344 6.335 4.726 C 4.138 3.175 3.301 3.443 2.752 3.693 C 2.116 3.978 2.000 4.955 2.000 5.528 C 2.000 6.103 2.315 10.237 2.520 10.928 C 3.199 13.208 5.614 13.978 7.839 13.731 C 4.579 14.214 1.683 15.402 5.481 19.629 C 9.658 23.954 11.206 18.702 12.000 16.039 C 12.794 18.702 13.708 23.765 18.444 19.629 C 22.000 16.039 19.421 14.214 16.161 13.731 C 18.386 13.978 20.801 13.208 21.480 10.928 C 21.685 10.238 22.000 6.103 22.000 5.529 C 22.000 4.954 21.884 3.978 21.248 3.691 C 20.699 3.443 19.862 3.174 17.665 4.724 C 15.372 6.345 12.906 9.628 12.000 11.388 Z"),
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
        return _blueskyFill!!
    }

private var _blueskyFill: ImageVector? = null
