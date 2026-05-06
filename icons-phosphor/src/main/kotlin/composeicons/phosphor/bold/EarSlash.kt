package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EarSlash: ImageVector
    get() {
        if (_earSlash != null) return _earSlash!!
        _earSlash = phosphorBoldIcon(
            name = "EarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.88 207.93c2.945 3.163 3.961 7.665 2.661 11.786-1.3 4.121-4.716 7.225-8.942 8.126-4.227 .901-8.611-.54-11.479-3.773L165.77 187.39c-1.897 .4-3.831 .604-5.77 .61-15.464 0-28-12.536-28-28-.002-2.961 .283-5.914 .85-8.82L97.08 111.83c-3.276 3.791-8.562 5.148-13.258 3.403C79.125 113.489 76.007 109.01 76 104c-.005-4.534 .584-9.049 1.75-13.43L65.52 77.11C61.863 85.602 59.984 94.754 60 104c0 25 7.58 32.3 16.35 40.76C85.12 153.22 96 163.71 96 188c0 17.673 14.327 32 32 32 9 0 16.19-3.7 22.75-11.64 4.264-4.94 11.694-5.567 16.726-1.411 5.032 4.156 5.82 11.571 1.774 16.691C158.09 237.15 144.21 244 128 244 97.086 243.967 72.033 218.914 72 188 72 173.91 67.37 169.44 59.69 162 49.13 151.86 36 139.19 36 104 35.965 87.894 40.191 72.065 48.25 58.12l-9.13-10C34.649 43.216 35.001 35.616 39.905 31.145c4.904-4.471 12.504-4.119 16.975 .785ZM99.34 42.31C108.314 38.127 118.099 35.972 128 36c37.539 .039 67.961 30.461 68 68 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C220.006 72.576 203.973 43.323 177.481 26.422 150.989 9.521 117.704 7.311 89.21 20.56c-5.841 2.89-8.308 9.914-5.556 15.822 2.752 5.908 9.715 8.54 15.686 5.928ZM164.43 123.31c.891 .214 1.804 .322 2.72 .32 5.58-.005 10.42-3.854 11.68-9.29 .786-3.39 1.178-6.86 1.17-10.34C179.967 75.295 156.705 52.033 128 52c-1.7 0-3.42 .08-5.11 .25-6.597 .643-11.423 6.513-10.78 13.11 .643 6.597 6.513 11.423 13.11 10.78 .92-.09 1.86-.14 2.78-.14 15.464 0 28 12.536 28 28 .006 1.642-.176 3.279-.54 4.88-1.497 6.453 2.518 12.899 8.97 14.4Z"),
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
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
