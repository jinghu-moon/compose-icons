package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorLightIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M39.91 128c4.104 2.792 7.382 6.636 9.49 11.13C54 148.62 54 160.51 54 172c0 24.27 1.21 38 26 38 3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6C63.12 222 52.19 216.4 46.6 204.87 42 195.38 42 183.49 42 172 42 147.73 40.79 134 16 134c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 24.79 0 26-13.73 26-38C42 72.51 42 60.62 46.6 51.13 52.19 39.6 63.12 34 80 34c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6C55.21 46 54 59.73 54 84c0 11.49 0 23.38-4.6 32.87-2.108 4.494-5.386 8.338-9.49 11.13ZM240 122c-24.79 0-26-13.73-26-38 0-11.49 0-23.38-4.6-32.87C203.81 39.6 192.88 34 176 34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 24.79 0 26 13.73 26 38 0 11.49 0 23.38 4.6 32.87 2.108 4.494 5.386 8.338 9.49 11.13-4.104 2.792-7.382 6.636-9.49 11.13C202 148.62 202 160.51 202 172c0 24.27-1.21 38-26 38-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 16.88 0 27.81-5.6 33.4-17.13C214 195.38 214 183.49 214 172c0-24.27 1.21-38 26-38 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
