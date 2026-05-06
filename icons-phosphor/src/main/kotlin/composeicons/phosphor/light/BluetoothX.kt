package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorLightIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.6 171.2 122 128l25.6-19.2c2.651-1.988 3.188-5.749 1.2-8.4-1.988-2.651-5.749-3.188-8.4-1.2L118 116v-72l22.4 16.8c2.651 1.988 6.412 1.451 8.4-1.2 1.988-2.651 1.451-6.412-1.2-8.4l-32-24c-1.818-1.364-4.251-1.583-6.283-.567C107.284 27.65 106 29.727 106 32v84L51.6 75.2c-2.651-1.988-6.412-1.451-8.4 1.2-1.988 2.651-1.451 6.412 1.2 8.4L102 128 44.4 171.2c-2.651 1.988-3.188 5.749-1.2 8.4 1.988 2.651 5.749 3.188 8.4 1.2L106 140v84c0 2.273 1.284 4.35 3.317 5.367 2.033 1.016 4.465 .797 6.283-.567l64-48C181.111 179.667 182 177.889 182 176c0-1.889-.889-3.667-2.4-4.8ZM118 212v-72l48 36ZM236.24 99.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L208 88.49l-19.76 19.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L199.51 80 179.76 60.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L208 71.51 227.76 51.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L216.49 80Z"),
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
