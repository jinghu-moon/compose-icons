package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorRegularIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 56c0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8ZM230.56 110.68c7.499 44.578-14.679 88.891-54.858 109.606C135.523 241.001 86.562 233.367 54.597 201.403 22.633 169.438 14.999 120.477 35.714 80.298 56.429 40.119 100.742 17.941 145.32 25.44c4.322 .764 7.221 4.869 6.497 9.198-.724 4.329-4.801 7.266-9.137 6.582C117.139 36.924 91.002 44.087 71.221 60.805 51.44 77.523 40.021 102.101 40 128c-.019 21.542 7.898 42.336 22.24 58.41 8.922-12.929 21.468-22.932 36.06-28.75C82.233 145.005 75.949 123.56 82.646 104.235 89.342 84.911 107.548 71.952 128 71.952c20.452 0 38.658 12.959 45.354 32.284 6.696 19.325 .413 40.77-15.654 53.425 14.592 5.818 27.138 15.821 36.06 28.75C208.102 170.336 216.019 149.542 216 128c0-4.919-.408-9.829-1.22-14.68-.501-2.832 .557-5.715 2.77-7.551 2.213-1.836 5.242-2.343 7.933-1.327 2.691 1.016 4.629 3.397 5.077 6.238ZM128 152c17.673 0 32-14.327 32-32C160 102.327 145.673 88 128 88c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM128 216c19.534 .02 38.513-6.492 53.92-18.5C170.159 179.106 149.833 167.977 128 167.977c-21.833 0-42.159 11.13-53.92 29.523C89.487 209.508 108.466 216.02 128 216Z"),
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
