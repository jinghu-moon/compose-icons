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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.841 15.659l.176 .177 .177-.177c.879-.879 2.303-.879 3.182 0 .879 .879 .879 2.303 0 3.182l-3.359 3.359L14.659 18.841c-.879-.879-.879-2.303 0-3.182 .879-.879 2.303-.879 3.182 0ZM12 14v8h-8c0-4.335 3.448-7.865 7.751-7.996L12 14ZM12 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6C8.685 13 6 10.315 6 7 6 3.685 8.685 1 12 1Z"),
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
        return _userHeartFill!!
    }

private var _userHeartFill: ImageVector? = null
