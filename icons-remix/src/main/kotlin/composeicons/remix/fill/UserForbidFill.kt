package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserForbidFill: ImageVector
    get() {
        if (_userForbidFill != null) return _userForbidFill!!
        _userForbidFill = remixIcon(
            name = "UserForbidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 13c3.314 0 6-2.686 6-6C18 3.686 15.314 1 12 1 8.686 1 6 3.686 6 7c0 3.314 2.686 6 6 6ZM15 18c0-1.657 1.343-3 3-3 .463 0 .902 .105 1.293 .292l-4.001 4.001C15.105 18.902 15 18.463 15 18ZM16.707 20.708l4.001-4.001c.187 .392 .292 .83 .292 1.293 0 1.657-1.343 3-3 3-.463 0-.902-.105-1.293-.292ZM18 13c-2.761 0-5 2.239-5 5 0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0-2.761-2.239-5-5-5ZM12 14c.084 0 .168 .001 .252 .004C11.463 15.137 11 16.514 11 18c0 1.487 .464 2.866 1.255 4h-8.255c0-4.418 3.582-8 8-8Z"),
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
        return _userForbidFill!!
    }

private var _userForbidFill: ImageVector? = null
