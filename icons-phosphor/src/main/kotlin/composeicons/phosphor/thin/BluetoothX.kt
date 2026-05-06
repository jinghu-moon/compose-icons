package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorThinIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178.4 172.8 118.67 128l27.73-20.8c1.767-1.325 2.125-3.833 .8-5.6-1.325-1.767-3.833-2.125-5.6-.8L116 120v-80l25.6 19.2c1.767 1.325 4.275 .967 5.6-.8 1.325-1.767 .967-4.275-.8-5.6l-32-24c-1.212-.909-2.834-1.055-4.189-.378C108.856 29.1 108 30.485 108 32v88L50.4 76.8c-1.767-1.325-4.275-.967-5.6 .8-1.325 1.767-.967 4.275 .8 5.6L105.33 128 45.6 172.8c-1.767 1.325-2.125 3.833-.8 5.6 1.325 1.767 3.833 2.125 5.6 .8L108 136v88c-.001 1.516 .855 2.902 2.21 3.58 .557 .275 1.169 .419 1.79 .42 .865 0 1.708-.281 2.4-.8l64-48c1.007-.755 1.6-1.941 1.6-3.2 0-1.259-.593-2.445-1.6-3.2ZM116 216v-80l53.33 40ZM234.83 101.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L208 85.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L202.34 80 181.17 58.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L208 74.34 229.17 53.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L213.66 80Z"),
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
