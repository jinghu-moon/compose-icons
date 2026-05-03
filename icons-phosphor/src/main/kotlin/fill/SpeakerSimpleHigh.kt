package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorFillIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 32.000 L 168.000 224.000 C 167.998 227.054 166.257 229.840 163.513 231.181 C 160.769 232.523 157.501 232.184 155.090 230.310 L 85.250 176.000 L 40.000 176.000 C 31.163 176.000 24.000 168.837 24.000 160.000 L 24.000 96.000 C 24.000 87.163 31.163 80.000 40.000 80.000 L 85.250 80.000 L 155.090 25.690 C 157.501 23.816 160.769 23.477 163.513 24.819 C 166.257 26.160 167.998 28.946 168.000 32.000 ZM 200.000 96.000 C 195.582 96.000 192.000 99.582 192.000 104.000 L 192.000 152.000 C 192.000 156.418 195.582 160.000 200.000 160.000 C 204.418 160.000 208.000 156.418 208.000 152.000 L 208.000 104.000 C 208.000 99.582 204.418 96.000 200.000 96.000 ZM 232.000 80.000 C 227.582 80.000 224.000 83.582 224.000 88.000 L 224.000 168.000 C 224.000 172.418 227.582 176.000 232.000 176.000 C 236.418 176.000 240.000 172.418 240.000 168.000 L 240.000 88.000 C 240.000 83.582 236.418 80.000 232.000 80.000 Z"),
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
