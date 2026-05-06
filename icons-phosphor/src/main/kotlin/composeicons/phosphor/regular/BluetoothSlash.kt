package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorRegularIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.92 210.62 61.92 34.62C58.935 31.413 53.926 31.204 50.684 34.151c-3.242 2.946-3.511 7.952-.604 11.229l70.84 77.93L59.2 169.6c-3.535 2.651-4.251 7.665-1.6 11.2 2.651 3.535 7.665 4.251 11.2 1.6L120 144v80c0 3.03 1.712 5.8 4.422 7.155 2.71 1.355 5.954 1.063 8.378-.755l50.83-38.12 26.45 29.1c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM136 208v-64l11.73 8.8 25.08 27.59ZM120 71.63v-39.63c0-3.03 1.712-5.8 4.422-7.155 2.71-1.355 5.954-1.063 8.378 .755l64 48C198.814 75.111 200 77.482 200 80c0 2.518-1.186 4.889-3.2 6.4l-33.53 25.15c-3.535 2.651-8.549 1.935-11.2-1.6-2.651-3.535-1.935-8.549 1.6-11.2L178.67 80 136 48v23.63c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
