package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorBoldIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.88 207.93 64.88 31.93C60.402 27.12 52.889 26.806 48.026 31.226c-4.863 4.42-5.267 11.928-.906 16.844L115 122.75 56.8 166.4c-5.302 3.976-6.376 11.498-2.4 16.8 3.976 5.302 11.498 6.376 16.8 2.4L116 152v72c0 4.545 2.568 8.7 6.633 10.733 4.065 2.033 8.93 1.594 12.567-1.133l47.91-35.94 24 26.41c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM140 200v-48l5 3.77 21.87 24.06ZM116 59.74v-27.74c0-4.545 2.568-8.7 6.633-10.733 4.065-2.033 8.93-1.594 12.567 1.133l64 48C202.222 72.666 204 76.223 204 80c0 3.777-1.778 7.334-4.8 9.6l-27.1 20.33c-5.302 3.976-12.824 2.902-16.8-2.4-3.976-5.302-2.902-12.824 2.4-16.8L172 80 140 56v3.74c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
