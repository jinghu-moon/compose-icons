package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserUnfollowLine: ImageVector
    get() {
        if (_userUnfollowLine != null) return _userUnfollowLine!!
        _userUnfollowLine = remixIcon(
            name = "UserUnfollowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 14.252v2.089C13.374 16.12 12.701 16 12 16 8.686 16 6 18.686 6 22h-2c0-4.418 3.582-8 8-8 .691 0 1.361 .087 2 .252ZM12 13C8.685 13 6 10.315 6 7 6 3.685 8.685 1 12 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM12 11c2.21 0 4-1.79 4-4C16 4.79 14.21 3 12 3 9.79 3 8 4.79 8 7c0 2.21 1.79 4 4 4ZM19 17.586l2.121-2.121 1.414 1.414L20.414 19l2.121 2.121-1.414 1.414L19 20.414l-2.121 2.121L15.465 21.121 17.586 19 15.465 16.879l1.414-1.414L19 17.586Z"),
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
        return _userUnfollowLine!!
    }

private var _userUnfollowLine: ImageVector? = null
