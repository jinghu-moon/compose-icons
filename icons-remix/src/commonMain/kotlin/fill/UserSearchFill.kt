package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserSearchFill: ImageVector
    get() {
        if (_userSearchFill != null) return _userSearchFill!!
        _userSearchFill = remixIcon(
            name = "UserSearchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 14.000 L 12.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 21.446 20.032 L 22.950 21.535 L 21.535 22.950 L 20.032 21.446 C 19.437 21.798 18.742 22.000 18.000 22.000 C 15.791 22.000 14.000 20.209 14.000 18.000 C 14.000 15.791 15.791 14.000 18.000 14.000 C 20.209 14.000 22.000 15.791 22.000 18.000 C 22.000 18.742 21.798 19.437 21.446 20.032 ZM 18.000 20.000 C 19.105 20.000 20.000 19.105 20.000 18.000 C 20.000 16.895 19.105 16.000 18.000 16.000 C 16.895 16.000 16.000 16.895 16.000 18.000 C 16.000 19.105 16.895 20.000 18.000 20.000 Z"),
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
        return _userSearchFill!!
    }

private var _userSearchFill: ImageVector? = null
