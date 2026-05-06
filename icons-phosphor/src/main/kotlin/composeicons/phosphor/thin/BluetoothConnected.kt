package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorThinIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M194.4 172.8 134.67 128 194.4 83.2C195.407 82.445 196 81.259 196 80c0-1.259-.593-2.445-1.6-3.2l-64-48c-1.212-.909-2.834-1.055-4.189-.378C124.856 29.1 124 30.485 124 32v88L66.4 76.8c-1.767-1.325-4.275-.967-5.6 .8-1.325 1.767-.967 4.275 .8 5.6L121.33 128 61.6 172.8c-1.767 1.325-2.125 3.833-.8 5.6 1.325 1.767 3.833 2.125 5.6 .8L124 136v88c0 1.515 .856 2.9 2.211 3.578 1.355 .678 2.977 .531 4.189-.378l64-48c1.007-.755 1.6-1.941 1.6-3.2 0-1.259-.593-2.445-1.6-3.2ZM132 40l53.33 40L132 120ZM132 216v-80l53.33 40ZM60 136c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM212 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
