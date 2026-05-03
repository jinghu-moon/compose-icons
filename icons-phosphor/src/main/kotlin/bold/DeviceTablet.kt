package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = phosphorBoldIcon(
            name = "DeviceTablet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 20.000 L 64.000 20.000 C 48.536 20.000 36.000 32.536 36.000 48.000 L 36.000 208.000 C 36.000 223.464 48.536 236.000 64.000 236.000 L 192.000 236.000 C 207.464 236.000 220.000 223.464 220.000 208.000 L 220.000 48.000 C 220.000 32.536 207.464 20.000 192.000 20.000 ZM 60.000 84.000 L 196.000 84.000 L 196.000 172.000 L 60.000 172.000 ZM 64.000 44.000 L 192.000 44.000 C 194.209 44.000 196.000 45.791 196.000 48.000 L 196.000 60.000 L 60.000 60.000 L 60.000 48.000 C 60.000 45.791 61.791 44.000 64.000 44.000 ZM 192.000 212.000 L 64.000 212.000 C 61.791 212.000 60.000 210.209 60.000 208.000 L 60.000 196.000 L 196.000 196.000 L 196.000 208.000 C 196.000 210.209 194.209 212.000 192.000 212.000 Z"),
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
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
