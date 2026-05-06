package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiscoBall: ImageVector
    get() {
        if (_discoBall != null) return _discoBall!!
        _discoBall = phosphorBoldIcon(
            name = "DiscoBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 60.78v-44.78C124 9.373 118.627 4 112 4c-6.627 0-12 5.373-12 12v44.78C51.938 67.103 17.028 109.635 20.197 158.007c3.168 48.372 43.327 85.987 91.803 85.987 48.476 0 88.635-37.615 91.803-85.987C206.972 109.635 172.062 67.103 124 60.78ZM178.92 140h-23.4c-1.64-20.74-7.36-37-13.81-49.15 19.519 9.527 33.337 27.778 37.21 49.15ZM112 215C105 206.38 95 189.91 92.55 164h38.9C129 189.9 119 206.37 112 215ZM92.55 140C95 114.1 105 97.63 112 89c7 8.62 17 25.09 19.45 51ZM82.29 90.85C75.84 103 70.12 119.26 68.48 140h-23.4C48.953 118.628 62.771 100.377 82.29 90.85ZM45.08 164h23.4c1.64 20.74 7.36 37 13.81 49.15C62.771 203.623 48.953 185.372 45.08 164ZM141.71 213.15C148.16 201 153.88 184.74 155.52 164h23.4c-3.873 21.372-17.691 39.623-37.21 49.15ZM256 88c0 6.627-5.373 12-12 12h-4v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-4c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h4c6.627 0 12 5.373 12 12ZM148 36c0-6.627 5.373-12 12-12h8v-8C168 9.373 173.373 4 180 4c6.627 0 12 5.373 12 12v8h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8h-8c-6.627 0-12-5.373-12-12Z"),
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
        return _discoBall!!
    }

private var _discoBall: ImageVector? = null
