package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorBoldIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 204.5v27.5c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-27.5c.077-22.75-12.788-43.565-33.17-53.67L98.43 126.63C69.898 112.484 51.891 83.346 52 51.5v-27.5C52 17.373 57.373 12 64 12c6.627 0 12 5.373 12 12v27.5c-.077 22.75 12.788 43.565 33.17 53.67l48.4 24.2c28.532 14.146 46.539 43.284 46.43 75.13ZM152 204h-76c.051-5.415 .839-10.797 2.34-16h56.2c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-42.78c1-1.1 2-2.18 3.13-3.21 4.827-4.543 5.058-12.138 .515-16.965-4.543-4.827-12.138-5.058-16.965-.515C61.602 159.214 52.042 181.339 52 204.5v27.5c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h76c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM192 12c-6.627 0-12 5.373-12 12v4h-76C97.373 28 92 33.373 92 40c0 6.627 5.373 12 12 12h76c-.051 5.415-.839 10.797-2.34 16h-56.22c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h42.8c-1 1.1-2 2.18-3.13 3.21-4.827 4.543-5.058 12.138-.515 16.965 4.543 4.827 12.138 5.058 16.965 .515C194.398 96.786 203.958 74.661 204 51.5v-27.5c0-6.627-5.373-12-12-12Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
