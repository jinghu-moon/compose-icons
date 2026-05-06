package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorThinIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 56c0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4ZM226.62 111.34c7.182 42.843-14.148 85.416-52.765 105.313C135.238 236.549 88.189 229.206 57.472 198.488 26.754 167.771 19.411 120.722 39.307 82.105 59.204 43.488 101.777 22.158 144.62 29.34c2.161 .382 3.611 2.434 3.249 4.599-.362 2.165-2.401 3.633-4.569 3.291C138.242 36.401 133.125 35.99 128 36 90.849 36.027 57.36 58.396 43.107 92.704c-14.253 34.308-6.473 73.822 19.723 100.166 9.937-16.613 25.868-28.783 44.51-34C89.505 149.385 80.42 128.975 85.307 109.376 90.195 89.776 107.8 76.022 128 76.022c20.2 0 37.805 13.754 42.693 33.354 4.888 19.6-4.198 40.01-22.033 49.494 18.642 5.217 34.573 17.387 44.51 34C210.365 175.662 220.016 152.326 220 128c-.001-5.14-.426-10.27-1.27-15.34-.342-2.168 1.127-4.206 3.291-4.569 2.165-.362 4.217 1.087 4.599 3.249ZM128 156c19.882 0 36-16.118 36-36C164 100.118 147.882 84 128 84c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM128 220c21.644 .019 42.595-7.626 59.14-21.58C175.059 177.14 152.476 163.992 128.005 163.992c-24.471 0-47.054 13.148-59.135 34.428C85.41 212.375 106.359 220.021 128 220Z"),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
