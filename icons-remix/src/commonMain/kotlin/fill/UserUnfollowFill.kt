package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserUnfollowFill: ImageVector
    get() {
        if (_userUnfollowFill != null) return _userUnfollowFill!!
        _userUnfollowFill = remixIcon(
            name = "UserUnfollowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 14.252 L 14.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 C 12.691 14.000 13.361 14.087 14.000 14.252 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 19.000 16.586 L 21.121 14.465 L 22.535 15.879 L 20.414 18.000 L 22.535 20.121 L 21.121 21.535 L 19.000 19.414 L 16.879 21.535 L 15.465 20.121 L 17.586 18.000 L 15.465 15.879 L 16.879 14.465 L 19.000 16.586 Z"),
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
        return _userUnfollowFill!!
    }

private var _userUnfollowFill: ImageVector? = null
