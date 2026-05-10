package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BluetoothFill: ImageVector
    get() {
        if (_bluetoothFill != null) return _bluetoothFill!!
        _bluetoothFill = remixIcon(
            name = "BluetoothFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.312 12l4.343 4.343L12.998 22h-2v-6.686L6.634 19.678 5.22 18.264l5.778-5.778v-.971L5.22 5.737 6.634 4.322l4.364 4.364v-6.686h2l5.657 5.657L14.312 12ZM12.998 13.515v5.657l2.828-2.829L12.998 13.515ZM12.998 10.485 15.826 7.657 12.998 4.828v5.657Z"),
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
        return _bluetoothFill!!
    }

private var _bluetoothFill: ImageVector? = null
