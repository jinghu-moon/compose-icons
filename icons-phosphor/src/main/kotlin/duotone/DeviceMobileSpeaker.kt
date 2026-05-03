package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DeviceMobileSpeaker: ImageVector
    get() {
        if (_deviceMobileSpeaker != null) return _deviceMobileSpeaker!!
        _deviceMobileSpeaker = phosphorDuotoneIcon(
            name = "DeviceMobileSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 192.000 40.000 L 192.000 216.000 C 192.000 224.837 184.837 232.000 176.000 232.000 L 80.000 232.000 C 71.163 232.000 64.000 224.837 64.000 216.000 L 64.000 40.000 C 64.000 31.163 71.163 24.000 80.000 24.000 L 176.000 24.000 C 184.837 24.000 192.000 31.163 192.000 40.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 176.000 16.000 L 80.000 16.000 C 66.745 16.000 56.000 26.745 56.000 40.000 L 56.000 216.000 C 56.000 229.255 66.745 240.000 80.000 240.000 L 176.000 240.000 C 189.255 240.000 200.000 229.255 200.000 216.000 L 200.000 40.000 C 200.000 26.745 189.255 16.000 176.000 16.000 ZM 184.000 216.000 C 184.000 220.418 180.418 224.000 176.000 224.000 L 80.000 224.000 C 75.582 224.000 72.000 220.418 72.000 216.000 L 72.000 40.000 C 72.000 35.582 75.582 32.000 80.000 32.000 L 176.000 32.000 C 180.418 32.000 184.000 35.582 184.000 40.000 ZM 168.000 56.000 C 168.000 60.418 164.418 64.000 160.000 64.000 L 96.000 64.000 C 91.582 64.000 88.000 60.418 88.000 56.000 C 88.000 51.582 91.582 48.000 96.000 48.000 L 160.000 48.000 C 164.418 48.000 168.000 51.582 168.000 56.000 Z"),
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
        return _deviceMobileSpeaker!!
    }

private var _deviceMobileSpeaker: ImageVector? = null
