package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorLightIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 74.000 L 206.000 74.000 L 206.000 64.000 C 206.000 51.850 196.150 42.000 184.000 42.000 L 40.000 42.000 C 27.850 42.000 18.000 51.850 18.000 64.000 L 18.000 160.000 C 18.000 172.150 27.850 182.000 40.000 182.000 L 154.000 182.000 L 154.000 192.000 C 154.000 204.150 163.850 214.000 176.000 214.000 L 224.000 214.000 C 236.150 214.000 246.000 204.150 246.000 192.000 L 246.000 96.000 C 246.000 83.850 236.150 74.000 224.000 74.000 ZM 40.000 170.000 C 34.477 170.000 30.000 165.523 30.000 160.000 L 30.000 64.000 C 30.000 58.477 34.477 54.000 40.000 54.000 L 184.000 54.000 C 189.523 54.000 194.000 58.477 194.000 64.000 L 194.000 74.000 L 176.000 74.000 C 163.850 74.000 154.000 83.850 154.000 96.000 L 154.000 170.000 ZM 234.000 192.000 C 234.000 197.523 229.523 202.000 224.000 202.000 L 176.000 202.000 C 170.477 202.000 166.000 197.523 166.000 192.000 L 166.000 96.000 C 166.000 90.477 170.477 86.000 176.000 86.000 L 224.000 86.000 C 229.523 86.000 234.000 90.477 234.000 96.000 ZM 134.000 208.000 C 134.000 211.314 131.314 214.000 128.000 214.000 L 88.000 214.000 C 84.686 214.000 82.000 211.314 82.000 208.000 C 82.000 204.686 84.686 202.000 88.000 202.000 L 128.000 202.000 C 131.314 202.000 134.000 204.686 134.000 208.000 ZM 214.000 112.000 C 214.000 115.314 211.314 118.000 208.000 118.000 L 192.000 118.000 C 188.686 118.000 186.000 115.314 186.000 112.000 C 186.000 108.686 188.686 106.000 192.000 106.000 L 208.000 106.000 C 211.314 106.000 214.000 108.686 214.000 112.000 Z"),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
