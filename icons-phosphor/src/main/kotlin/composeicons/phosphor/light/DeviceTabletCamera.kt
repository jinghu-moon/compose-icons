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
                pathData = parseSvgPathData("M192 26h-128C51.85 26 42 35.85 42 48v160c0 12.15 9.85 22 22 22h128c12.15 0 22-9.85 22-22v-160C214 35.85 204.15 26 192 26ZM202 208c0 5.523-4.477 10-10 10h-128c-5.523 0-10-4.477-10-10v-160C54 42.477 58.477 38 64 38h128c5.523 0 10 4.477 10 10ZM138 68c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
