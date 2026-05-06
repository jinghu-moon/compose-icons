package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorBoldIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M254.93 96.43C252.485 89.195 246.133 83.984 238.56 83 224.656 81.169 211.172 76.953 198.7 70.54l3.92-3.92c12.498-12.498 12.498-32.762 0-45.26C190.122 8.862 169.858 8.862 157.36 21.36l-6.69 6.69c-3.468-4.65-8.785-7.566-14.57-7.99-5.786-.424-11.47 1.685-15.58 5.78L81.84 64.52c-4.098 4.109-6.21 9.797-5.786 15.585 .424 5.788 3.342 11.107 7.996 14.575L9.36 169.38c-12.498 12.495-12.5 32.757-.005 45.255 12.495 12.498 32.757 12.5 45.255 .005l71.92-71.93c6.417 12.471 10.635 25.955 12.47 39.86 .97 7.571 6.165 13.929 13.39 16.39 7.225 2.461 15.221 .595 20.61-4.81L250.13 117c5.416-5.367 7.281-13.36 4.8-20.57ZM174.33 38.33c3.126-3.126 8.194-3.126 11.32-0 3.126 3.126 3.126 8.194 0 11.32l-7.58 7.57c-4.187-3.322-8.174-6.888-11.94-10.68ZM37.64 197.67c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315l76.21-76.21c3.792 3.766 7.358 7.753 10.68 11.94ZM161.52 171.67c-9-48.5-39.27-78.44-59.38-93.47l32-32c15 20.11 45 50.34 93.45 59.38Z"),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
