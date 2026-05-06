package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorLightIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 110h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM104 98h-10v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM239.84 199.5C233.48 208.584 223.089 213.996 212 214c-8.999-.021-17.626-3.597-24-9.95l-.26-.28L147.38 158h-38.76L68.31 203.76 68 204c-6.359 6.381-14.991 9.978-24 10C33.953 213.993 24.423 209.543 17.968 201.844 11.513 194.145 8.794 183.984 10.54 174.09c0 0 0-.06 0-.1L26.9 89.88C31.759 62.204 55.791 42.014 83.89 42h88.11c28.017 .036 52.013 20.07 57.05 47.63 0 .07 0 .12 0 .19L245.46 174c0 0 0 .07 0 .11 1.593 8.874-.43 18.017-5.62 25.39ZM172 146c25.405 0 46-20.595 46-46C218 74.595 197.405 54 172 54h-88.11C61.601 54.017 42.546 70.044 38.71 92c-.005 .033-.005 .067 0 .1L22.33 176.23c-1.64 9.42 2.992 18.821 11.461 23.26 8.469 4.439 18.836 2.899 25.649-3.81l42-47.65c1.145-1.28 2.783-2.008 4.5-2ZM233.67 176.23l-9.79-50.35C214.06 145.543 193.979 157.976 172 158h-8.63l33.19 37.68c6.813 6.709 17.18 8.249 25.649 3.81 8.469-4.439 13.101-13.84 11.461-23.26Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
