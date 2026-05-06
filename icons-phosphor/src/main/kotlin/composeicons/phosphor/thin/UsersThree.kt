package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UsersThree: ImageVector
    get() {
        if (_usersThree != null) return _usersThree!!
        _usersThree = phosphorThinIcon(
            name = "UsersThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237 147.44c-1.9 1.126-4.353 .5-5.48-1.4-8.33-14-20.93-22-34.56-22-.408-.005-.813-.073-1.2-.2-1.262 .132-2.531 .199-3.8 .2-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 14.55-.005 26.671-11.152 27.892-25.65C221.073 75.891 210.986 62.874 196.642 60.436c-14.344-2.438-28.165 6.517-31.802 20.604-.552 2.14-2.735 3.427-4.875 2.875-2.14-.552-3.427-2.735-2.875-4.875 4.038-15.659 18.022-26.703 34.19-27.004 16.168-.301 30.553 10.216 35.171 25.714 4.618 15.498-1.665 32.172-15.36 40.77 10.81 3.85 20.51 12 27.31 23.48 1.099 1.891 .476 4.314-1.4 5.44ZM187.46 214c1.102 1.911 .449 4.354-1.46 5.46-.606 .356-1.297 .542-2 .54-1.428-.001-2.746-.764-3.46-2C169.571 199.405 149.59 187.993 128 187.993c-21.59 0-41.571 11.412-52.54 30.007-1.15 1.809-3.522 2.39-5.377 1.317C68.227 218.244 67.546 215.899 68.54 214c8.683-14.909 22.682-25.983 39.19-31C89.728 173.656 80.446 153.218 85.255 133.515 90.064 113.811 107.718 99.947 128 99.947c20.282 0 37.936 13.864 42.745 33.568 4.809 19.704-4.474 40.142-22.475 49.485 16.508 5.017 30.507 16.091 39.19 31ZM128 180c19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM64 116C49.45 115.995 37.329 104.848 36.108 90.35 34.887 75.851 44.974 62.834 59.318 60.396 73.662 57.958 87.483 66.912 91.12 81c.552 2.14 2.735 3.427 4.875 2.875 2.14-.552 3.427-2.735 2.875-4.875C94.814 63.282 80.741 52.223 64.51 51.999 48.279 51.774 33.905 62.439 29.416 78.039c-4.489 15.599 2.016 32.274 15.884 40.711-12.997 3.948-24.387 11.956-32.5 22.85-1.325 1.767-.967 4.275 .8 5.6 1.767 1.325 4.275 .967 5.6-.8C29.729 132.243 46.357 123.928 64 124c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
