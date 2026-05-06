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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.234 7.73C6.653 5.486 9.153 4 12 4c2.847 0 5.347 1.486 6.767 3.73L20.457 6.661C18.687 3.862 15.561 2 12 2 8.439 2 5.314 3.862 3.544 6.661L5.234 7.73ZM12 20C9.153 20 6.653 18.514 5.234 16.27L3.544 17.339C5.314 20.138 8.439 22 12 22c3.561 0 6.686-1.862 8.457-4.661L18.767 16.27C17.347 18.514 14.847 20 12 20ZM12 12c1.657 0 3-1.343 3-3C15 7.343 13.657 6 12 6 10.343 6 9 7.343 9 9c0 1.657 1.343 3 3 3ZM12 13c2.209 0 4 1.791 4 4h-8c0-2.209 1.791-4 4-4ZM6 12c0 1.657-1.343 3-3 3C1.343 15 0 13.657 0 12 0 10.343 1.343 9 3 9c1.657 0 3 1.343 3 3ZM21 15c1.657 0 3-1.343 3-3C24 10.343 22.657 9 21 9c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3Z"),
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
        return _userCommunityFill!!
    }

private var _userCommunityFill: ImageVector? = null
