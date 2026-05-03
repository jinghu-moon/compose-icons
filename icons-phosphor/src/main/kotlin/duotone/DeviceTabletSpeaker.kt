package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DeviceTabletSpeaker: ImageVector
    get() {
        if (_deviceTabletSpeaker != null) return _deviceTabletSpeaker!!
        _deviceTabletSpeaker = phosphorDuotoneIcon(
            name = "DeviceTabletSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 48.000 L 208.000 208.000 C 208.000 216.837 200.837 224.000 192.000 224.000 L 64.000 224.000 C 55.163 224.000 48.000 216.837 48.000 208.000 L 48.000 48.000 C 48.000 39.163 55.163 32.000 64.000 32.000 L 192.000 32.000 C 200.837 32.000 208.000 39.163 208.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 192.000 24.000 L 64.000 24.000 C 50.745 24.000 40.000 34.745 40.000 48.000 L 40.000 208.000 C 40.000 221.255 50.745 232.000 64.000 232.000 L 192.000 232.000 C 205.255 232.000 216.000 221.255 216.000 208.000 L 216.000 48.000 C 216.000 34.745 205.255 24.000 192.000 24.000 ZM 200.000 208.000 C 200.000 212.418 196.418 216.000 192.000 216.000 L 64.000 216.000 C 59.582 216.000 56.000 212.418 56.000 208.000 L 56.000 48.000 C 56.000 43.582 59.582 40.000 64.000 40.000 L 192.000 40.000 C 196.418 40.000 200.000 43.582 200.000 48.000 ZM 168.000 64.000 C 168.000 68.418 164.418 72.000 160.000 72.000 L 96.000 72.000 C 91.582 72.000 88.000 68.418 88.000 64.000 C 88.000 59.582 91.582 56.000 96.000 56.000 L 160.000 56.000 C 164.418 56.000 168.000 59.582 168.000 64.000 Z"),
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
        return _deviceTabletSpeaker!!
    }

private var _deviceTabletSpeaker: ImageVector? = null
