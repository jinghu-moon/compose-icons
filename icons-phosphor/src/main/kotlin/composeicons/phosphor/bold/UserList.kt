package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorBoldIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 80c0-6.627 5.373-12 12-12h80c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-80c-6.627 0-12-5.373-12-12ZM244 116h-80c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM244 164h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM155.62 189c1.657 6.418-2.202 12.963-8.62 14.62-6.418 1.657-12.963-2.202-14.62-8.62C126.66 172.77 104.14 156 80 156c-24.14 0-46.66 16.76-52.38 39-1.657 6.418-8.202 10.277-14.62 8.62C6.582 201.963 2.723 195.418 4.38 189 9.76 168.1 24.47 150.84 43.49 141 28.461 126.189 23.872 103.763 31.876 84.239 39.88 64.715 58.889 51.963 79.99 51.963c21.101 0 40.11 12.752 48.114 32.276 8.004 19.524 3.415 41.95-11.614 56.761 19.04 9.85 33.75 27.11 39.13 48ZM80 132c15.464 0 28-12.536 28-28C108 88.536 95.464 76 80 76 64.536 76 52 88.536 52 104c0 15.464 12.536 28 28 28Z"),
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
