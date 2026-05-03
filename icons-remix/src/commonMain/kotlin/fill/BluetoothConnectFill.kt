package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BluetoothConnectFill: ImageVector
    get() {
        if (_bluetoothConnectFill != null) return _bluetoothConnectFill!!
        _bluetoothConnectFill = remixIcon(
            name = "BluetoothConnectFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.311 12.000 L 18.654 16.343 L 12.998 22.000 L 10.998 22.000 L 10.998 15.314 L 6.634 19.678 L 5.219 18.264 L 10.998 12.485 L 10.998 11.515 L 5.219 5.737 L 6.634 4.322 L 10.998 8.686 L 10.998 2.000 L 12.998 2.000 L 18.654 7.657 L 14.311 12.000 ZM 12.998 13.515 L 12.998 19.172 L 15.826 16.343 L 12.998 13.515 ZM 12.998 10.485 L 15.826 7.657 L 12.998 4.828 L 12.998 10.485 ZM 19.500 13.500 C 18.672 13.500 18.000 12.828 18.000 12.000 C 18.000 11.172 18.672 10.500 19.500 10.500 C 20.328 10.500 21.000 11.172 21.000 12.000 C 21.000 12.828 20.328 13.500 19.500 13.500 ZM 6.500 13.500 C 5.672 13.500 5.000 12.828 5.000 12.000 C 5.000 11.172 5.672 10.500 6.500 10.500 C 7.328 10.500 8.000 11.172 8.000 12.000 C 8.000 12.828 7.328 13.500 6.500 13.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bluetoothConnectFill!!
    }

private var _bluetoothConnectFill: ImageVector? = null
