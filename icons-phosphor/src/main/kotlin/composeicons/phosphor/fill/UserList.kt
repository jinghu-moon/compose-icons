package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorFillIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 80c0-4.418 3.582-8 8-8h88c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-88c-4.418 0-8-3.582-8-8ZM248 120h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM248 168h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM109.29 142c16.279-12.538 22.771-34.047 16.149-53.498C118.816 69.051 100.547 55.972 80 55.972c-20.547 0-38.816 13.078-45.439 32.529-6.623 19.451-.13 40.96 16.149 53.498C30.09 150.73 13.84 168.3 8.25 190c-.619 2.396-.093 4.944 1.423 6.901 1.516 1.956 3.852 3.101 6.327 3.099h128c2.475 .001 4.811-1.143 6.327-3.099 1.516-1.956 2.041-4.504 1.423-6.901-5.59-21.71-21.84-39.28-42.46-48Z"),
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
        return _userList!!
    }

private var _userList: ImageVector? = null
