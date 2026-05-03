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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 13.000 C 15.314 13.000 18.000 10.314 18.000 7.000 C 18.000 3.686 15.314 1.000 12.000 1.000 C 8.686 1.000 6.000 3.686 6.000 7.000 C 6.000 10.314 8.686 13.000 12.000 13.000 ZM 15.000 18.000 C 15.000 16.343 16.343 15.000 18.000 15.000 C 18.463 15.000 18.902 15.105 19.293 15.292 L 15.292 19.293 C 15.105 18.902 15.000 18.463 15.000 18.000 ZM 16.707 20.708 L 20.708 16.707 C 20.895 17.098 21.000 17.537 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 C 17.537 21.000 17.098 20.895 16.707 20.708 ZM 18.000 13.000 C 15.239 13.000 13.000 15.239 13.000 18.000 C 13.000 20.761 15.239 23.000 18.000 23.000 C 20.761 23.000 23.000 20.761 23.000 18.000 C 23.000 15.239 20.761 13.000 18.000 13.000 ZM 12.000 14.000 C 12.084 14.000 12.168 14.001 12.252 14.004 C 11.463 15.137 11.000 16.514 11.000 18.000 C 11.000 19.487 11.464 20.866 12.255 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 Z"),
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
        return _userForbidFill!!
    }

private var _userForbidFill: ImageVector? = null
