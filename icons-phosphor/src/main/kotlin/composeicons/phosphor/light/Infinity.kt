package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorLightIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 128c-.003 21.839-13.16 41.526-33.336 49.882-20.176 8.357-43.4 3.738-58.844-11.702-.088-.082-.172-.169-.25-.26L93.57 98.18C77.133 81.877 50.602 81.949 34.254 98.342c-16.348 16.393-16.348 42.923 0 59.316 16.348 16.393 42.878 16.465 59.316 .162l8.57-9.67c2.209-2.485 6.015-2.709 8.5-.5 2.485 2.209 2.709 6.015 .5 8.5l-8.69 9.81c-.078 .091-.162 .178-.25 .26C86.757 181.666 63.53 186.288 43.35 177.931 23.17 169.573 10.012 149.882 10.012 128.04c0-21.842 13.158-41.533 33.338-49.891 20.18-8.358 43.407-3.736 58.85 11.711 .088 .082 .172 .169 .25 .26l60 67.74c16.437 16.303 42.968 16.231 59.316-.162 16.348-16.393 16.348-42.923 0-59.316C205.418 81.989 178.887 81.917 162.45 98.22l-8.57 9.67c-2.209 2.485-6.015 2.709-8.5 .5-2.485-2.209-2.709-6.015-.5-8.5l8.69-9.81c.078-.091 .162-.178 .25-.26C169.264 74.379 192.487 69.761 212.664 78.118 232.84 86.474 245.997 106.161 246 128Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
