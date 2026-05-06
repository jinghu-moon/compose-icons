package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorBoldIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 120c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM156 64h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM256 112v32c.002 15.286-12.256 27.749-27.54 28l-15.26 42.73c-2.845 7.96-10.387 13.273-18.84 13.27h-12.72c-8.453 .003-15.995-5.31-18.84-13.27l-1-2.73h-51.63l-1 2.73C106.329 222.68 98.802 227.99 90.36 228h-12.72c-8.453 .003-15.995-5.31-18.84-13.27L46.5 180.28C35.987 168.179 28.832 153.531 25.75 137.8 24.608 139.667 24.003 141.812 24 144c0 6.627-5.373 12-12 12C5.373 156 0 150.627 0 144 .023 128.535 9.903 114.805 24.56 109.87 29.779 63.294 69.133 28.059 116 28h104c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-10c9.636 8.773 17.299 19.493 22.48 31.45l.42 1C246.247 86.843 255.971 98.44 256 112ZM232 112c0-2.209-1.791-4-4-4h-3.66c-5.244-0-9.881-3.406-11.45-8.41C203.975 71.257 177.702 51.989 148 52h-32C89.035 51.998 64.616 67.93 53.755 92.611c-10.861 24.681-6.112 53.448 12.105 73.329 1.082 1.174 1.915 2.555 2.45 4.06l12.15 34h7.08l2.87-8c1.693-4.79 6.22-7.994 11.3-8h68.58c5.08 .006 9.607 3.21 11.3 8l2.87 8h7.08l17.16-48c1.693-4.79 6.22-7.994 11.3-8h8c2.209 0 4-1.791 4-4Z"),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
