package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorLightIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154 80c0-3.314 2.686-6 6-6h88c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-88c-3.314 0-6-2.686-6-6ZM248 122h-88c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h88c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM248 170h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM149.81 190.5c.828 3.209-1.101 6.482-4.31 7.31-3.209 .828-6.482-1.101-7.31-4.31C131.7 168.29 107.23 150 80 150c-27.23 0-51.7 18.29-58.19 43.49-.828 3.209-4.101 5.138-7.31 4.31-3.209-.828-5.138-4.101-4.31-7.31 5.74-22.28 23-40.07 44.67-48C37.815 131.366 30.106 110.363 35.909 90.853 41.712 71.344 59.646 57.968 80 57.968c20.354 0 38.288 13.376 44.091 32.886 5.803 19.509-1.906 40.513-18.951 51.637 21.65 7.94 38.94 25.73 44.67 48.01ZM80 138c18.778 0 34-15.222 34-34C114 85.222 98.778 70 80 70 61.222 70 46 85.222 46 104c0 18.778 15.222 34 34 34Z"),
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
