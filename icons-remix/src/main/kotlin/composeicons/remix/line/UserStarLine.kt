package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserStarLine: ImageVector
    get() {
        if (_userStarLine != null) return _userStarLine!!
        _userStarLine = remixIcon(
            name = "UserStarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 14v2C8.686 16 6 18.686 6 22h-2c0-4.418 3.582-8 8-8ZM12 13C8.685 13 6 10.315 6 7 6 3.685 8.685 1 12 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM12 11c2.21 0 4-1.79 4-4C16 4.79 14.21 3 12 3 9.79 3 8 4.79 8 7c0 2.21 1.79 4 4 4ZM18 21.5l-2.939 1.545 .561-3.273L13.245 17.455l3.286-.477L18 14l1.469 2.978 3.286 .477-2.378 2.318 .561 3.273L18 21.5Z"),
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
        return _userStarLine!!
    }

private var _userStarLine: ImageVector? = null
