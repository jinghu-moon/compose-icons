package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FireTruck: ImageVector
    get() {
        if (_fireTruck != null) return _fireTruck!!
        _fireTruck = phosphorBoldIcon(
            name = "FireTruck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.14 115.54l-14-35C238.116 72.944 230.755 67.971 222.58 68h-18.58v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v94.06c-10.233 3.653-18.287 11.707-21.94 21.94h-44.12C108.854 165.618 95.255 156.003 80 156.003c-15.255 0-28.854 9.615-33.94 23.997h-10.06v-36c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v40c0 11.046 8.954 20 20 20h14.06c5.086 14.382 18.685 23.997 33.94 23.997 15.255 0 28.854-9.615 33.94-23.997h44.12c5.086 14.382 18.685 23.997 33.94 23.997 15.255 0 28.854-9.615 33.94-23.997h10.06c11.046 0 20-8.954 20-20v-64c-0-1.528-.292-3.042-.86-4.46ZM219.88 92l6.4 16h-22.28v-16ZM80 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM192 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM225.94 180C222.287 169.767 214.233 161.713 204 158.06v-26.06h28v48ZM24 92c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-16h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-128C17.373 52 12 57.373 12 64c0 6.627 5.373 12 12 12h12v16ZM116 92h-16v-16h16ZM60 76h16v16h-16Z"),
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
        return _fireTruck!!
    }

private var _fireTruck: ImageVector? = null
