package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorDuotoneIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 104c0 22.091-17.909 40-40 40C57.909 144 40 126.091 40 104 40 81.909 57.909 64 80 64c22.091 0 40 17.909 40 40Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M152 80c0-4.418 3.582-8 8-8h88c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-88c-4.418 0-8-3.582-8-8ZM248 120h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM248 168h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM151.75 190c.528 2.055 .218 4.237-.862 6.063-1.08 1.827-2.842 3.149-4.898 3.677-.652 .176-1.325 .263-2 .26-3.649 .002-6.838-2.466-7.75-6C130.08 170.06 105.9 152 79.99 152c-25.91 0-50.09 18.05-56.25 42-1.105 4.28-5.47 6.855-9.75 5.75C9.71 198.645 7.135 194.28 8.24 190c5.59-21.71 21.84-39.29 42.46-48C34.421 129.462 27.929 107.953 34.551 88.502 41.174 69.051 59.443 55.972 79.99 55.972c20.547 0 38.816 13.078 45.439 32.529 6.623 19.451 .13 40.96-16.149 53.498 20.63 8.71 36.88 26.29 42.47 48ZM80 136c17.673 0 32-14.327 32-32C112 86.327 97.673 72 80 72 62.327 72 48 86.327 48 104c0 17.673 14.327 32 32 32Z"),
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
