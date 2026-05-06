package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = phosphorBoldIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.14 115.54l-14-35C238.119 72.943 230.756 67.968 222.58 68h-26.58v-4c0-6.627-5.373-12-12-12h-152C20.954 52 12 60.954 12 72v112c0 11.046 8.954 20 20 20h14.06c5.086 14.382 18.685 23.997 33.94 23.997 15.255 0 28.854-9.615 33.94-23.997h44.12c5.086 14.382 18.685 23.997 33.94 23.997 15.255 0 28.854-9.615 33.94-23.997h10.06c11.046 0 20-8.954 20-20v-64c-.13-1.513-.418-3.008-.86-4.46ZM196 92h23.88l6.4 16h-30.28ZM80 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM172 162.08c-6.442 4.33-11.328 10.611-13.94 17.92h-44.12C108.854 165.618 95.255 156.003 80 156.003c-15.255 0-28.854 9.615-33.94 23.997h-10.06v-40h136ZM172 116h-136v-40h136ZM192 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM232 180h-6.06C221.321 167.008 209.701 157.783 196 156.23v-24.23h36Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
