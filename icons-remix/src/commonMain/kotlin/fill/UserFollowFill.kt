package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserFollowFill: ImageVector
    get() {
        if (_userFollowFill != null) return _userFollowFill!!
        _userFollowFill = remixIcon(
            name = "UserFollowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 14.062 L 13.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 C 12.339 14.000 12.672 14.021 13.000 14.062 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 17.793 19.914 L 21.328 16.379 L 22.743 17.793 L 17.793 22.743 L 14.257 19.207 L 15.672 17.793 L 17.793 19.914 Z"),
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
        return _userFollowFill!!
    }

private var _userFollowFill: ImageVector? = null
