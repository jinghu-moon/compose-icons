package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorDuotoneIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 176l-64 48v-96ZM167.47 73.6 112 32v96L167.47 86.4c2.014-1.511 3.2-3.882 3.2-6.4 0-2.518-1.186-4.889-3.2-6.4Z"),
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
                pathData = parseSvgPathData("M180.8 169.6 125.33 128l23.47-17.6c3.535-2.651 4.251-7.665 1.6-11.2-2.651-3.535-7.665-4.251-11.2-1.6L120 112v-64l19.2 14.4c3.535 2.651 8.549 1.935 11.2-1.6 2.651-3.535 1.935-8.549-1.6-11.2l-32-24c-2.424-1.818-5.667-2.111-8.378-.755C105.712 26.2 104 28.97 104 32v80L52.8 73.6C49.265 70.949 44.251 71.665 41.6 75.2c-2.651 3.535-1.935 8.549 1.6 11.2L98.67 128 43.2 169.6c-3.535 2.651-4.251 7.665-1.6 11.2 2.651 3.535 7.665 4.251 11.2 1.6L104 144v80c0 3.03 1.712 5.8 4.422 7.155 2.71 1.355 5.954 1.063 8.378-.755l64-48C182.814 180.889 184 178.518 184 176c0-2.518-1.186-4.889-3.2-6.4ZM120 208v-64l42.67 32ZM237.66 98.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L208 91.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L196.69 80 178.34 61.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L208 68.69 226.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L219.31 80Z"),
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
