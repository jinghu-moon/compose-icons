package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = phosphorLightIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 18.000 L 80.000 18.000 C 67.850 18.000 58.000 27.850 58.000 40.000 L 58.000 216.000 C 58.000 228.150 67.850 238.000 80.000 238.000 L 176.000 238.000 C 188.150 238.000 198.000 228.150 198.000 216.000 L 198.000 40.000 C 198.000 27.850 188.150 18.000 176.000 18.000 ZM 70.000 62.000 L 186.000 62.000 L 186.000 194.000 L 70.000 194.000 ZM 80.000 30.000 L 176.000 30.000 C 181.523 30.000 186.000 34.477 186.000 40.000 L 186.000 50.000 L 70.000 50.000 L 70.000 40.000 C 70.000 34.477 74.477 30.000 80.000 30.000 ZM 176.000 226.000 L 80.000 226.000 C 74.477 226.000 70.000 221.523 70.000 216.000 L 70.000 206.000 L 186.000 206.000 L 186.000 216.000 C 186.000 221.523 181.523 226.000 176.000 226.000 Z"),
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
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
