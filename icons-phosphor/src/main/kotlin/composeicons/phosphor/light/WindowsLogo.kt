package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorLightIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 138h-80c-3.314 0-6 2.686-6 6v57.45c-.003 2.903 2.073 5.392 4.93 5.91l80 14.54c.353 .068 .711 .102 1.07 .1 3.314 0 6-2.686 6-6v-72c0-3.314-2.686-6-6-6ZM202 208.81 134 196.45v-46.45h68ZM96 138h-64c-3.314 0-6 2.686-6 6v40c.002 2.9 2.077 5.383 4.93 5.9l64 11.64c.353 .063 .711 .097 1.07 .1 3.314 0 6-2.686 6-6v-51.64c0-3.314-2.686-6-6-6ZM90 188.45 38 179v-29h52ZM211.84 35.39c-1.365-1.135-3.163-1.608-4.91-1.29L126.93 48.64c-2.857 .518-4.933 3.007-4.93 5.91v57.45c0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6v-72c-0-1.781-.791-3.47-2.16-4.61ZM202 106h-68v-46.45L202 47.19ZM99.84 55.76C98.477 54.621 96.678 54.145 94.93 54.46l-64 11.64C28.077 66.617 26.002 69.1 26 72v40c0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6v-51.64c-.003-1.778-.794-3.462-2.16-4.6ZM90 106h-52v-29L90 67.54Z"),
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
