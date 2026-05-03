package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = phosphorFillIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 16.000 L 80.000 16.000 C 66.745 16.000 56.000 26.745 56.000 40.000 L 56.000 216.000 C 56.000 229.255 66.745 240.000 80.000 240.000 L 176.000 240.000 C 189.255 240.000 200.000 229.255 200.000 216.000 L 200.000 40.000 C 200.000 26.745 189.255 16.000 176.000 16.000 ZM 80.000 32.000 L 176.000 32.000 C 180.418 32.000 184.000 35.582 184.000 40.000 L 184.000 48.000 L 72.000 48.000 L 72.000 40.000 C 72.000 35.582 75.582 32.000 80.000 32.000 ZM 176.000 224.000 L 80.000 224.000 C 75.582 224.000 72.000 220.418 72.000 216.000 L 72.000 208.000 L 184.000 208.000 L 184.000 216.000 C 184.000 220.418 180.418 224.000 176.000 224.000 Z"),
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
