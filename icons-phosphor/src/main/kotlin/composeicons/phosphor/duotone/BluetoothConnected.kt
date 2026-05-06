package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorDuotoneIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 80l-64 48v-96ZM128 224l64-48L128 128Z"),
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
                pathData = parseSvgPathData("M196.8 169.6 141.33 128 196.8 86.4C198.814 84.889 200 82.518 200 80c0-2.518-1.186-4.889-3.2-6.4l-64-48c-2.424-1.818-5.667-2.111-8.378-.755C121.712 26.2 120 28.97 120 32v80L68.8 73.6C65.265 70.949 60.251 71.665 57.6 75.2c-2.651 3.535-1.935 8.549 1.6 11.2L114.67 128 59.2 169.6c-3.535 2.651-4.251 7.665-1.6 11.2 2.651 3.535 7.665 4.251 11.2 1.6L120 144v80c0 3.03 1.712 5.8 4.422 7.155 2.71 1.355 5.954 1.063 8.378-.755l64-48C198.814 180.889 200 178.518 200 176c0-2.518-1.186-4.889-3.2-6.4ZM136 48l42.67 32L136 112ZM136 208v-64l42.67 32ZM60 140c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM216 128c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
