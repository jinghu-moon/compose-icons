package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = phosphorBoldIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 120c0-6.627 5.373-12 12-12h8v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v8h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8h-8c-6.627 0-12-5.373-12-12ZM256 120v64c0 11.046-8.954 20-20 20h-10.06c-5.086 14.382-18.685 23.997-33.94 23.997-15.255 0-28.854-9.615-33.94-23.997h-44.12C108.854 218.382 95.255 227.997 80 227.997 64.745 227.997 51.146 218.382 46.06 204h-14.06C20.954 204 12 195.046 12 184v-112C12 60.954 20.954 52 32 52h152c6.627 0 12 5.373 12 12v4h26.58c8.186-.028 15.555 4.959 18.57 12.57l14 35c.561 1.41 .849 2.913 .85 4.43ZM196 92v16h30.28L219.88 92ZM36 180h10.06C51.146 165.618 64.745 156.003 80 156.003c15.255 0 28.854 9.615 33.94 23.997h44.12c2.612-7.309 7.498-13.59 13.94-17.92v-86.08h-136ZM92 192c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM204 192c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM232 180v-48h-36v24.23c13.701 1.553 25.321 10.778 29.94 23.77Z"),
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
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
