package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorFillIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 128.000 L 80.000 64.000 C 80.000 37.490 101.490 16.000 128.000 16.000 C 154.510 16.000 176.000 37.490 176.000 64.000 L 176.000 128.000 C 176.000 154.510 154.510 176.000 128.000 176.000 C 101.490 176.000 80.000 154.510 80.000 128.000 ZM 208.000 128.000 C 208.000 123.582 204.418 120.000 200.000 120.000 C 195.582 120.000 192.000 123.582 192.000 128.000 C 192.000 163.346 163.346 192.000 128.000 192.000 C 92.654 192.000 64.000 163.346 64.000 128.000 C 64.000 123.582 60.418 120.000 56.000 120.000 C 51.582 120.000 48.000 123.582 48.000 128.000 C 48.050 169.066 79.145 203.443 120.000 207.600 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 207.600 C 176.855 203.443 207.950 169.066 208.000 128.000 Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
