package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorBoldIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M183.2 166.4 132 128l11.61-8.71c5.302-3.976 6.376-11.498 2.4-16.8-3.976-5.302-11.498-6.376-16.8-2.4L124 104v-48l5.21 3.91c5.302 3.976 12.824 2.902 16.8-2.4 3.976-5.302 2.902-12.824-2.4-16.8L119.2 22.4c-3.636-2.727-8.501-3.166-12.567-1.133C102.568 23.3 100 27.455 100 32v72L55.2 70.4C49.898 66.424 42.376 67.498 38.4 72.8c-3.976 5.302-2.902 12.824 2.4 16.8L92 128 40.8 166.4c-5.302 3.976-6.376 11.498-2.4 16.8 3.976 5.302 11.498 6.376 16.8 2.4L100 152v72c0 4.545 2.568 8.7 6.633 10.733 4.065 2.033 8.93 1.594 12.567-1.133l64-48C186.222 183.334 188 179.777 188 176c0-3.777-1.778-7.334-4.8-9.6ZM124 200v-48l32 24ZM240.49 95.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L208 97l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L191 80 175.52 64.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L208 63 223.51 47.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L225 80Z"),
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
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
