package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BluetoothLine: ImageVector
    get() {
        if (_bluetoothLine != null) return _bluetoothLine!!
        _bluetoothLine = remixIcon(
            name = "BluetoothLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.312 12.000 L 18.655 16.343 L 12.998 22.000 L 10.998 22.000 L 10.998 15.314 L 6.634 19.678 L 5.220 18.264 L 10.998 12.485 L 10.998 11.515 L 5.220 5.737 L 6.634 4.322 L 10.998 8.686 L 10.998 2.000 L 12.998 2.000 L 18.655 7.657 L 14.312 12.000 ZM 12.998 13.515 L 12.998 19.172 L 15.826 16.343 L 12.998 13.515 ZM 12.998 10.485 L 15.826 7.657 L 12.998 4.828 L 12.998 10.485 Z"),
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
        return _bluetoothLine!!
    }

private var _bluetoothLine: ImageVector? = null
