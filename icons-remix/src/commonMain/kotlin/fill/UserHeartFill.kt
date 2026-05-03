package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserHeartFill: ImageVector
    get() {
        if (_userHeartFill != null) return _userHeartFill!!
        _userHeartFill = remixIcon(
            name = "UserHeartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.841 15.659 L 18.017 15.836 L 18.194 15.659 C 19.073 14.780 20.498 14.780 21.376 15.659 C 22.255 16.538 22.255 17.962 21.376 18.841 L 18.018 22.200 L 14.659 18.841 C 13.780 17.962 13.780 16.538 14.659 15.659 C 15.538 14.780 16.962 14.780 17.841 15.659 ZM 12.000 14.000 L 12.000 22.000 L 4.000 22.000 C 4.000 17.665 7.448 14.135 11.751 14.004 L 12.000 14.000 ZM 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 Z"),
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
        return _userHeartFill!!
    }

private var _userHeartFill: ImageVector? = null
