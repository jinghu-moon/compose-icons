package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorBoldIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.11 104.18 207.54 51.09C203.744 46.586 198.151 43.99 192.26 44h-160.26C20.954 44 12 52.954 12 64v112c0 11.046 8.954 20 20 20h14.06c5.086 14.382 18.685 23.997 33.94 23.997 15.255 0 28.854-9.615 33.94-23.997h40.12c5.086 14.382 18.685 23.997 33.94 23.997 15.255 0 28.854-9.615 33.94-23.997h14.06c11.046 0 20-8.954 20-20v-64c-.002-2.868-1.027-5.64-2.89-7.82ZM217.89 100h-41.89v-32h14.42ZM104 100v-32h48v32ZM80 68v32h-44v-32ZM80 196c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM188 196c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM221.94 172C216.854 157.618 203.255 148.003 188 148.003c-15.255 0-28.854 9.615-33.94 23.997h-40.12C108.854 157.618 95.255 148.003 80 148.003c-15.255 0-28.854 9.615-33.94 23.997h-10.06v-48h196v48Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
