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
                pathData = parseSvgPathData("M17.841 15.659l.176 .177 .177-.177c.879-.879 2.303-.879 3.182 0 .879 .879 .879 2.303 0 3.182l-3.359 3.359L14.659 18.841c-.879-.879-.879-2.303 0-3.182 .879-.879 2.303-.879 3.182 0ZM12 14v2C8.686 16 6 18.686 6 22h-2c0-4.335 3.448-7.865 7.751-7.996L12 14ZM12 1c3.315 0 6 2.685 6 6 0 3.24-2.564 5.878-5.775 5.996L12 13C8.685 13 6 10.315 6 7 6 3.76 8.564 1.122 11.775 1.004L12 1ZM12 3C9.79 3 8 4.79 8 7c0 2.21 1.79 4 4 4 2.21 0 4-1.79 4-4C16 4.79 14.21 3 12 3Z"),
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
