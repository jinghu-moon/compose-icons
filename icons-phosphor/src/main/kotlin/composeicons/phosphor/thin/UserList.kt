package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorThinIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 80c0-2.209 1.791-4 4-4h88c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-88c-2.209 0-4-1.791-4-4ZM248 124h-88c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h88c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM248 172h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM147.87 191c.551 2.137-.734 4.316-2.87 4.87-.326 .087-.662 .13-1 .13-1.823-.001-3.414-1.235-3.87-3C133.42 166.92 108.13 148 80 148c-28.13 0-53.41 18.92-60.13 45-.312 1.432-1.383 2.578-2.79 2.988-1.407 .41-2.925 .017-3.957-1.023-1.032-1.04-1.413-2.561-.993-3.965 5.92-23 24.57-41.14 47.52-48C41.682 133.627 32.44 113.195 37.265 93.512 42.09 73.83 59.735 59.989 80 59.989c20.265 0 37.91 13.841 42.735 33.524 4.825 19.682-4.417 40.115-22.385 49.488 22.95 6.86 41.65 25 47.52 48ZM80 140c19.882 0 36-16.118 36-36C116 84.118 99.882 68 80 68 60.118 68 44 84.118 44 104c0 19.882 16.118 36 36 36Z"),
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
