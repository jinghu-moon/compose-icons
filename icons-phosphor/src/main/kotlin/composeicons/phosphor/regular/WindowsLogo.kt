package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorRegularIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 136h-80c-4.418 0-8 3.582-8 8v57.45c-.004 3.87 2.762 7.188 6.57 7.88l80 14.54c.471 .088 .95 .132 1.43 .13 4.418 0 8-3.582 8-8v-72c0-4.418-3.582-8-8-8ZM200 206.41 136 194.78v-42.78h64ZM96 136h-64c-4.418 0-8 3.582-8 8v40c.001 3.866 2.766 7.179 6.57 7.87l64 11.64c.472 .083 .951 .127 1.43 .13 4.418 0 8-3.582 8-8v-51.64c0-4.418-3.582-8-8-8ZM88 186.05 40 177.32v-25.32h48ZM213.13 33.86c-1.822-1.521-4.225-2.155-6.56-1.73L126.57 46.68c-3.804 .691-6.569 4.004-6.57 7.87v57.45c0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8v-72c0-2.371-1.051-4.62-2.87-6.14ZM200 104h-64v-42.78L200 49.59ZM101.13 54.22C99.308 52.699 96.905 52.065 94.57 52.49l-64 11.64C26.766 64.821 24.001 68.134 24 72v40c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8v-51.64c0-2.371-1.051-4.62-2.87-6.14ZM88 104h-48v-25.32L88 70Z"),
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
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
