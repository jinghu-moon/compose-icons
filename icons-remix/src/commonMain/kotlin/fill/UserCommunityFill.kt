package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserCommunityFill: ImageVector
    get() {
        if (_userCommunityFill != null) return _userCommunityFill!!
        _userCommunityFill = remixIcon(
            name = "UserCommunityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.234 7.730 C 6.653 5.486 9.153 4.000 12.000 4.000 C 14.847 4.000 17.347 5.486 18.767 7.730 L 20.457 6.661 C 18.687 3.862 15.561 2.000 12.000 2.000 C 8.439 2.000 5.314 3.862 3.544 6.661 L 5.234 7.730 ZM 12.000 20.000 C 9.153 20.000 6.653 18.514 5.234 16.270 L 3.544 17.339 C 5.314 20.138 8.439 22.000 12.000 22.000 C 15.561 22.000 18.687 20.138 20.457 17.339 L 18.767 16.270 C 17.347 18.514 14.847 20.000 12.000 20.000 ZM 12.000 12.000 C 13.657 12.000 15.000 10.657 15.000 9.000 C 15.000 7.343 13.657 6.000 12.000 6.000 C 10.343 6.000 9.000 7.343 9.000 9.000 C 9.000 10.657 10.343 12.000 12.000 12.000 ZM 12.000 13.000 C 14.209 13.000 16.000 14.791 16.000 17.000 L 8.000 17.000 C 8.000 14.791 9.791 13.000 12.000 13.000 ZM 6.000 12.000 C 6.000 13.657 4.657 15.000 3.000 15.000 C 1.343 15.000 0.000 13.657 0.000 12.000 C 0.000 10.343 1.343 9.000 3.000 9.000 C 4.657 9.000 6.000 10.343 6.000 12.000 ZM 21.000 15.000 C 22.657 15.000 24.000 13.657 24.000 12.000 C 24.000 10.343 22.657 9.000 21.000 9.000 C 19.343 9.000 18.000 10.343 18.000 12.000 C 18.000 13.657 19.343 15.000 21.000 15.000 Z"),
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
        return _userCommunityFill!!
    }

private var _userCommunityFill: ImageVector? = null
