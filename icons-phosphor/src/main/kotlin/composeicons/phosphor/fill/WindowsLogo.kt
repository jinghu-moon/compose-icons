package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorFillIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 144v51.64c0 4.418-3.582 8-8 8-.479-.003-.958-.047-1.43-.13l-64-11.64C26.766 191.179 24.001 187.866 24 184v-40c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM101.13 54.22C99.308 52.699 96.905 52.065 94.57 52.49l-64 11.64C26.766 64.821 24.001 68.134 24 72v40c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8v-51.64c0-2.371-1.051-4.62-2.87-6.14ZM208 136h-80c-4.418 0-8 3.582-8 8v57.45c-.004 3.87 2.762 7.188 6.57 7.88l80 14.54c.471 .088 .95 .132 1.43 .13 4.418 0 8-3.582 8-8v-72c0-4.418-3.582-8-8-8ZM213.13 33.86c-1.822-1.521-4.225-2.155-6.56-1.73L126.57 46.68c-3.804 .691-6.569 4.004-6.57 7.87v57.45c0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8v-72c0-2.371-1.051-4.62-2.87-6.14Z"),
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
