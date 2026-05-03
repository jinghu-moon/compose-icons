package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserHeartLine: ImageVector
    get() {
        if (_userHeartLine != null) return _userHeartLine!!
        _userHeartLine = remixIcon(
            name = "UserHeartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.841 15.659 L 18.017 15.836 L 18.194 15.659 C 19.073 14.780 20.498 14.780 21.376 15.659 C 22.255 16.538 22.255 17.962 21.376 18.841 L 18.018 22.200 L 14.659 18.841 C 13.780 17.962 13.780 16.538 14.659 15.659 C 15.538 14.780 16.962 14.780 17.841 15.659 ZM 12.000 14.000 L 12.000 16.000 C 8.686 16.000 6.000 18.686 6.000 22.000 L 4.000 22.000 C 4.000 17.665 7.448 14.135 11.751 14.004 L 12.000 14.000 ZM 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.240 15.436 12.878 12.225 12.996 L 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.760 8.564 1.122 11.775 1.004 L 12.000 1.000 ZM 12.000 3.000 C 9.790 3.000 8.000 4.790 8.000 7.000 C 8.000 9.210 9.790 11.000 12.000 11.000 C 14.210 11.000 16.000 9.210 16.000 7.000 C 16.000 4.790 14.210 3.000 12.000 3.000 Z"),
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
        return _userHeartLine!!
    }

private var _userHeartLine: ImageVector? = null
