package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorRegularIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.15 97.72C253.197 91.902 248.088 87.714 242 86.94c-18.255-2.453-35.825-8.576-51.65-18L200.66 58.64c9.024-9.869 8.683-25.092-.773-34.547-9.456-9.456-24.678-9.796-34.547-.773L152.14 36.53c-2.33-2.8-3.81-4.84-4.41-5.69-2.711-3.873-6.995-6.348-11.704-6.763-4.709-.415-9.36 1.274-12.706 4.613L84.68 67.36c-3.337 3.344-5.025 7.992-4.612 12.698 .413 4.706 2.884 8.989 6.752 11.702 .86 .6 2.9 2.08 5.7 4.41L7.31 181.37c-9.024 9.869-8.683 25.092 .773 34.547 9.456 9.456 24.678 9.796 34.547 .773l82.3-82.31c9.42 15.827 15.543 33.396 18 51.65 .783 6.074 4.965 11.168 10.77 13.12 1.659 .56 3.399 .847 5.15 .85 4.228-.002 8.281-1.69 11.26-4.69l81.18-81.19c4.324-4.275 5.823-10.645 3.86-16.4ZM176.69 34.63c2.188-2.605 5.658-3.754 8.969-2.969 3.31 .785 5.895 3.37 6.68 6.68 .785 3.31-.364 6.781-2.969 8.969L176.82 59.86c-4.799-3.61-9.38-7.5-13.72-11.65ZM31.31 205.37c-2.188 2.605-5.658 3.754-8.969 2.969-3.31-.785-5.895-3.37-6.68-6.68-.785-3.31 .364-6.781 2.969-8.969l85.58-85.58c4.153 4.334 8.043 8.912 11.65 13.71ZM158.8 183.92C150 118.29 101.52 82.52 96 78.67L134.66 40c3.86 5.5 39.63 54 105.25 62.78Z"),
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
