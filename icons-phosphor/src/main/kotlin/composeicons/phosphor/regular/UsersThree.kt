package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UsersThree: ImageVector
    get() {
        if (_usersThree != null) return _usersThree!!
        _usersThree = phosphorRegularIcon(
            name = "UsersThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.8 150.4c-3.535 2.651-8.549 1.935-11.2-1.6C223.821 135.656 208.382 127.936 192 128c-3.216-0-6.12-1.927-7.37-4.89-.839-1.988-.839-4.232 0-6.22 1.25-2.963 4.154-4.89 7.37-4.89 12.472-.001 22.864-9.555 23.913-21.982C216.961 77.59 208.316 66.43 196.021 64.34 183.726 62.249 171.878 69.924 168.76 82c-1.105 4.28-5.47 6.855-9.75 5.75C154.73 86.645 152.155 82.28 153.26 78c4.272-16.532 18.568-28.529 35.59-29.868 17.022-1.339 33.018 8.274 39.823 23.934 6.805 15.66 2.92 33.913-9.673 45.444 10.878 4.71 20.335 12.184 27.43 21.68 1.273 1.702 1.817 3.84 1.511 5.943-.306 2.103-1.436 3.998-3.141 5.267ZM190.92 212c1.576 2.48 1.666 5.624 .234 8.191-1.432 2.566-4.156 4.14-7.094 4.101-2.938-.04-5.618-1.687-6.98-4.291C166.827 202.638 148.163 191.985 128 191.985c-20.163 0-38.827 10.653-49.08 28.015-1.362 2.604-4.042 4.251-6.98 4.291-2.938 .04-5.662-1.535-7.094-4.101-1.432-2.566-1.342-5.711 .234-8.191 7.756-13.326 19.582-23.813 33.74-29.92C82.485 169.573 75.937 148.048 82.539 128.563 89.142 109.078 107.427 95.968 128 95.968c20.573 0 38.858 13.11 45.461 32.595 6.603 19.485 .054 41.01-16.281 53.517 14.158 6.107 25.984 16.594 33.74 29.92ZM128 176c17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM72 120c0-4.418-3.582-8-8-8C51.528 111.999 41.136 102.445 40.087 90.018 39.039 77.59 47.684 66.43 59.979 64.34 72.274 62.249 84.122 69.924 87.24 82c1.105 4.28 5.47 6.855 9.75 5.75 4.28-1.105 6.855-5.47 5.75-9.75C98.468 61.468 84.172 49.471 67.15 48.132 50.128 46.792 34.132 56.406 27.327 72.066 20.521 87.726 24.407 105.979 37 117.51 26.133 122.224 16.687 129.698 9.6 139.19c-2.654 3.535-1.94 8.551 1.595 11.205 3.535 2.654 8.551 1.94 11.205-1.595C32.179 135.656 47.618 127.936 64 128c4.418 0 8-3.582 8-8Z"),
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
        return _usersThree!!
    }

private var _usersThree: ImageVector? = null
