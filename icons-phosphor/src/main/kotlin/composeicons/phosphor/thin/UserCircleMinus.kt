package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorThinIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 56c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4ZM222.31 94.67c14.517 41.066 .784 86.805-33.953 113.082-34.737 26.277-82.487 27.047-118.054 1.905C34.736 184.514 19.535 139.241 32.72 97.729 45.905 56.216 84.444 28.012 128 28c5.582-.003 11.155 .459 16.66 1.38 2.161 .382 3.611 2.434 3.249 4.599-.362 2.165-2.401 3.633-4.569 3.291C138.27 36.425 133.14 36.001 128 36 90.849 36.027 57.36 58.396 43.107 92.704c-14.253 34.308-6.473 73.822 19.723 100.166 9.937-16.613 25.868-28.783 44.51-34C89.505 149.385 80.42 128.975 85.307 109.376 90.195 89.776 107.8 76.022 128 76.022c20.2 0 37.805 13.754 42.693 33.354 4.888 19.6-4.198 40.01-22.033 49.494 18.642 5.217 34.573 17.387 44.51 34 24.964-25.048 33.361-62.189 21.6-95.54-.532-1.361-.28-2.904 .658-4.024 .938-1.121 2.412-1.641 3.845-1.357 1.433 .284 2.598 1.327 3.037 2.721ZM128 156c19.882 0 36-16.118 36-36C164 100.118 147.882 84 128 84c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM128 220c21.644 .019 42.595-7.626 59.14-21.58C175.059 177.14 152.476 163.992 128.005 163.992c-24.471 0-47.054 13.148-59.135 34.428C85.41 212.375 106.359 220.021 128 220Z"),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
