package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserForbidLine: ImageVector
    get() {
        if (_userForbidLine != null) return _userForbidLine!!
        _userForbidLine = remixIcon(
            name = "UserForbidLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 7C8 4.791 9.791 3 12 3c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.791 11 8 9.209 8 7ZM12 1C8.686 1 6 3.686 6 7c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 3.686 15.314 1 12 1ZM15 18c0-1.657 1.343-3 3-3 .463 0 .902 .105 1.293 .292l-4.001 4.001C15.105 18.902 15 18.463 15 18ZM16.707 20.708l4.001-4.001c.187 .392 .292 .83 .292 1.293 0 1.657-1.343 3-3 3-.463 0-.902-.105-1.293-.292ZM18 13c-2.761 0-5 2.239-5 5 0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0-2.761-2.239-5-5-5ZM12 14c.084 0 .168 .001 .252 .004-.428 .615-.761 1.302-.975 2.039C8.304 16.4 6 18.931 6 22h-2c0-4.418 3.582-8 8-8Z"),
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
        return _userForbidLine!!
    }

private var _userForbidLine: ImageVector? = null
