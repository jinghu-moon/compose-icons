package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorDuotoneIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 160.000 32.000 L 160.000 224.000 L 88.000 168.000 L 40.000 168.000 C 35.582 168.000 32.000 164.418 32.000 160.000 L 32.000 96.000 C 32.000 91.582 35.582 88.000 40.000 88.000 L 88.000 88.000 Z"),
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
        pathData = parseSvgPathData("M 163.510 24.810 C 160.765 23.473 157.499 23.814 155.090 25.690 L 85.250 80.000 L 40.000 80.000 C 31.163 80.000 24.000 87.163 24.000 96.000 L 24.000 160.000 C 24.000 168.837 31.163 176.000 40.000 176.000 L 85.250 176.000 L 155.090 230.310 C 157.501 232.184 160.769 232.523 163.513 231.181 C 166.257 229.840 167.998 227.054 168.000 224.000 L 168.000 32.000 C 168.000 28.942 166.258 26.152 163.510 24.810 ZM 152.000 207.640 L 92.910 161.690 C 91.509 160.592 89.780 159.997 88.000 160.000 L 40.000 160.000 L 40.000 96.000 L 88.000 96.000 C 89.780 96.003 91.509 95.408 92.910 94.310 L 152.000 48.360 ZM 208.000 104.000 L 208.000 152.000 C 208.000 156.418 204.418 160.000 200.000 160.000 C 195.582 160.000 192.000 156.418 192.000 152.000 L 192.000 104.000 C 192.000 99.582 195.582 96.000 200.000 96.000 C 204.418 96.000 208.000 99.582 208.000 104.000 ZM 240.000 88.000 L 240.000 168.000 C 240.000 172.418 236.418 176.000 232.000 176.000 C 227.582 176.000 224.000 172.418 224.000 168.000 L 224.000 88.000 C 224.000 83.582 227.582 80.000 232.000 80.000 C 236.418 80.000 240.000 83.582 240.000 88.000 Z"),
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
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
