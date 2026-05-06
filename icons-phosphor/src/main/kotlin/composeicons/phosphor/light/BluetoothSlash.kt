package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorLightIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.44 212 60.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06l72.32 79.55L60.4 171.2c-2.651 1.988-3.188 5.749-1.2 8.4 1.988 2.651 5.749 3.188 8.4 1.2L122 140v84c0 2.273 1.284 4.35 3.317 5.367 2.033 1.016 4.465 .797 6.283-.567l52.28-39.21L211.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM134 212v-72l15.09 11.31 26.68 29.36ZM122 71.63v-39.63c0-2.273 1.284-4.35 3.317-5.367 2.033-1.016 4.465-.797 6.283 .567l64 48C197.111 76.333 198 78.111 198 80c0 1.889-.889 3.667-2.4 4.8L162.07 110c-2.651 1.988-6.412 1.451-8.4-1.2-1.988-2.651-1.451-6.412 1.2-8.4L182 80 134 44v27.63c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6Z"),
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
