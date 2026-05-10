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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.311 12l4.343 4.343L12.998 22h-2v-6.686L6.634 19.678 5.219 18.264l5.778-5.778v-.971L5.219 5.737 6.634 4.322l4.364 4.364v-6.686h2l5.657 5.657L14.311 12ZM12.998 13.515v5.657l2.828-2.829L12.998 13.515ZM12.998 10.485 15.826 7.657 12.998 4.828v5.657ZM19.5 13.5C18.672 13.5 18 12.828 18 12c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5ZM6.5 13.5C5.672 13.5 5 12.828 5 12c0-.828 .672-1.5 1.5-1.5C7.328 10.5 8 11.172 8 12c0 .828-.672 1.5-1.5 1.5Z"),
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
        return _bluetoothConnectFill!!
    }

private var _bluetoothConnectFill: ImageVector? = null
