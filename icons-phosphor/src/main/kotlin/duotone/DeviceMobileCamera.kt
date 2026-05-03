package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DeviceMobileCamera: ImageVector
    get() {
        if (_deviceMobileCamera != null) return _deviceMobileCamera!!
        _deviceMobileCamera = phosphorDuotoneIcon(
            name = "DeviceMobileCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 40.000 L 192.000 216.000 C 192.000 224.837 184.837 232.000 176.000 232.000 L 80.000 232.000 C 71.163 232.000 64.000 224.837 64.000 216.000 L 64.000 40.000 C 64.000 31.163 71.163 24.000 80.000 24.000 L 176.000 24.000 C 184.837 24.000 192.000 31.163 192.000 40.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 176.000 16.000 L 80.000 16.000 C 66.745 16.000 56.000 26.745 56.000 40.000 L 56.000 216.000 C 56.000 229.255 66.745 240.000 80.000 240.000 L 176.000 240.000 C 189.255 240.000 200.000 229.255 200.000 216.000 L 200.000 40.000 C 200.000 26.745 189.255 16.000 176.000 16.000 ZM 184.000 216.000 C 184.000 220.418 180.418 224.000 176.000 224.000 L 80.000 224.000 C 75.582 224.000 72.000 220.418 72.000 216.000 L 72.000 40.000 C 72.000 35.582 75.582 32.000 80.000 32.000 L 176.000 32.000 C 180.418 32.000 184.000 35.582 184.000 40.000 ZM 140.000 60.000 C 140.000 66.627 134.627 72.000 128.000 72.000 C 121.373 72.000 116.000 66.627 116.000 60.000 C 116.000 53.373 121.373 48.000 128.000 48.000 C 134.627 48.000 140.000 53.373 140.000 60.000 Z"),
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
        return _deviceMobileCamera!!
    }

private var _deviceMobileCamera: ImageVector? = null
