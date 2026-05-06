package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorFillIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.38 221.92c-3.27 2.971-8.329 2.729-11.3-.54L183.63 192.28l-50.83 38.12c-2.594 1.943-6.105 2.129-8.89 .47-2.475-1.54-3.96-4.266-3.91-7.18v-79.69L68.8 182.4c-3.515 2.635-8.496 1.943-11.16-1.55-2.612-3.667-1.807-8.75 1.81-11.43l61.47-46.11L50.08 45.38c-2.907-3.277-2.638-8.283 .604-11.229 3.242-2.946 8.251-2.737 11.236 .469l160 176c2.971 3.27 2.729 8.329-.54 11.3ZM155 113.22c1.388 1.527 3.709 1.748 5.36 .51L196.8 86.4C198.814 84.889 200 82.518 200 80c0-2.518-1.186-4.889-3.2-6.4l-64-48c-2.99-2.257-7.146-2.136-10 .29-1.822 1.602-2.846 3.925-2.8 6.35v40.94c-.011 .989 .345 1.948 1 2.69Z"),
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
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
