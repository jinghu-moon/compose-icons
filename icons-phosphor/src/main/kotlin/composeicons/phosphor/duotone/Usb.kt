package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorDuotoneIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 64c0 13.255-10.745 24-24 24C122.745 88 112 77.255 112 64c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM200 96v64l48-32ZM152 168h-32c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M252.44 121.34l-48-32c-2.455-1.638-5.614-1.791-8.216-.398C193.622 90.335 191.998 93.048 192 96v24h-120v-48h33c4.029 15.602 19.03 25.775 35.016 23.745C156.002 93.715 167.984 80.114 167.984 64c0-16.114-11.982-29.715-27.968-31.745C124.03 30.225 109.029 40.398 105 56h-33C63.163 56 56 63.163 56 72v48h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48v48c0 8.837 7.163 16 16 16h32v8c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v8h-32v-48h120v24c-.002 2.952 1.622 5.665 4.224 7.058 2.602 1.393 5.76 1.24 8.216-.398l48-32c2.229-1.483 3.568-3.983 3.568-6.66 0-2.677-1.339-5.177-3.568-6.66ZM136 48c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM120 176h32v32h-32ZM208 145.05v-34.05l25.58 17Z"),
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
        return _usb!!
    }

private var _usb: ImageVector? = null
