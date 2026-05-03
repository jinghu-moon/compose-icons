package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorDuotoneIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 168.000 64.000 L 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 L 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 L 88.000 64.000 C 88.000 41.909 105.909 24.000 128.000 24.000 L 128.000 24.000 C 150.091 24.000 168.000 41.909 168.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 128.000 176.000 C 154.498 175.972 175.972 154.498 176.000 128.000 L 176.000 64.000 C 176.000 37.490 154.510 16.000 128.000 16.000 C 101.490 16.000 80.000 37.490 80.000 64.000 L 80.000 128.000 C 80.028 154.498 101.502 175.972 128.000 176.000 ZM 96.000 64.000 C 96.000 46.327 110.327 32.000 128.000 32.000 C 145.673 32.000 160.000 46.327 160.000 64.000 L 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 ZM 136.000 207.600 L 136.000 240.000 C 136.000 244.418 132.418 248.000 128.000 248.000 C 123.582 248.000 120.000 244.418 120.000 240.000 L 120.000 207.600 C 79.145 203.443 48.050 169.066 48.000 128.000 C 48.000 123.582 51.582 120.000 56.000 120.000 C 60.418 120.000 64.000 123.582 64.000 128.000 C 64.000 163.346 92.654 192.000 128.000 192.000 C 163.346 192.000 192.000 163.346 192.000 128.000 C 192.000 123.582 195.582 120.000 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 C 207.950 169.066 176.855 203.443 136.000 207.600 Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
