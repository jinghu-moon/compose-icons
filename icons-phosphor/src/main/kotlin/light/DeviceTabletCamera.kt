package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceTabletCamera: ImageVector
    get() {
        if (_deviceTabletCamera != null) return _deviceTabletCamera!!
        _deviceTabletCamera = phosphorLightIcon(
            name = "DeviceTabletCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 26.000 L 64.000 26.000 C 51.850 26.000 42.000 35.850 42.000 48.000 L 42.000 208.000 C 42.000 220.150 51.850 230.000 64.000 230.000 L 192.000 230.000 C 204.150 230.000 214.000 220.150 214.000 208.000 L 214.000 48.000 C 214.000 35.850 204.150 26.000 192.000 26.000 ZM 202.000 208.000 C 202.000 213.523 197.523 218.000 192.000 218.000 L 64.000 218.000 C 58.477 218.000 54.000 213.523 54.000 208.000 L 54.000 48.000 C 54.000 42.477 58.477 38.000 64.000 38.000 L 192.000 38.000 C 197.523 38.000 202.000 42.477 202.000 48.000 ZM 138.000 68.000 C 138.000 73.523 133.523 78.000 128.000 78.000 C 122.477 78.000 118.000 73.523 118.000 68.000 C 118.000 62.477 122.477 58.000 128.000 58.000 C 133.523 58.000 138.000 62.477 138.000 68.000 Z"),
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
        return _deviceTabletCamera!!
    }

private var _deviceTabletCamera: ImageVector? = null
