package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorLightIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 170.000 L 205.000 170.000 L 183.150 46.000 L 192.000 46.000 C 195.314 46.000 198.000 43.314 198.000 40.000 C 198.000 36.686 195.314 34.000 192.000 34.000 L 64.000 34.000 C 60.686 34.000 58.000 36.686 58.000 40.000 C 58.000 43.314 60.686 46.000 64.000 46.000 L 72.850 46.000 L 51.000 170.000 L 40.000 170.000 C 36.686 170.000 34.000 172.686 34.000 176.000 C 34.000 179.314 36.686 182.000 40.000 182.000 L 122.000 182.000 L 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 L 134.000 182.000 L 216.000 182.000 C 219.314 182.000 222.000 179.314 222.000 176.000 C 222.000 172.686 219.314 170.000 216.000 170.000 ZM 85.000 46.000 L 171.000 46.000 L 192.880 170.000 L 63.150 170.000 Z"),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
