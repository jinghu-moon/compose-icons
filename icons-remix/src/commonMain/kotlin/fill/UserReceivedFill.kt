package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserReceivedFill: ImageVector
    get() {
        if (_userReceivedFill != null) return _userReceivedFill!!
        _userReceivedFill = remixIcon(
            name = "UserReceivedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 14.252 L 14.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 C 12.691 14.000 13.361 14.087 14.000 14.252 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 19.418 17.000 L 23.004 17.000 L 23.004 19.000 L 19.418 19.000 L 21.247 20.828 L 19.833 22.243 L 15.590 18.000 L 19.833 13.757 L 21.247 15.172 L 19.418 17.000 Z"),
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
        return _userReceivedFill!!
    }

private var _userReceivedFill: ImageVector? = null
