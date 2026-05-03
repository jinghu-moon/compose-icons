package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorRegularIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 160.000 L 200.000 160.000 L 200.000 101.340 C 207.690 110.827 217.671 118.199 229.000 122.760 C 233.074 124.330 237.655 122.343 239.292 118.295 C 240.930 114.248 239.020 109.635 235.000 107.930 C 213.800 99.420 199.932 78.844 200.000 56.000 C 200.000 51.582 196.418 48.000 192.000 48.000 C 187.582 48.000 184.000 51.582 184.000 56.000 C 184.000 86.928 158.928 112.000 128.000 112.000 C 97.072 112.000 72.000 86.928 72.000 56.000 C 72.000 51.582 68.418 48.000 64.000 48.000 C 59.582 48.000 56.000 51.582 56.000 56.000 C 56.068 78.844 42.200 99.420 21.000 107.930 C 16.980 109.635 15.070 114.248 16.708 118.295 C 18.345 122.343 22.926 124.330 27.000 122.760 C 38.329 118.199 48.310 110.827 56.000 101.340 L 56.000 160.000 L 24.000 160.000 C 19.582 160.000 16.000 163.582 16.000 168.000 C 16.000 172.418 19.582 176.000 24.000 176.000 L 56.000 176.000 L 56.000 200.000 C 56.000 204.418 59.582 208.000 64.000 208.000 C 68.418 208.000 72.000 204.418 72.000 200.000 L 72.000 176.000 L 184.000 176.000 L 184.000 200.000 C 184.000 204.418 187.582 208.000 192.000 208.000 C 196.418 208.000 200.000 204.418 200.000 200.000 L 200.000 176.000 L 232.000 176.000 C 236.418 176.000 240.000 172.418 240.000 168.000 C 240.000 163.582 236.418 160.000 232.000 160.000 ZM 144.000 126.200 L 144.000 160.000 L 112.000 160.000 L 112.000 126.200 C 122.532 128.600 133.468 128.600 144.000 126.200 ZM 72.000 101.200 C 78.528 109.268 86.713 115.839 96.000 120.470 L 96.000 160.000 L 72.000 160.000 ZM 160.000 160.000 L 160.000 120.480 C 169.287 115.849 177.472 109.278 184.000 101.210 L 184.000 160.000 Z"),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
