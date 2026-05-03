package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorRegularIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 64.000 L 184.000 192.000 C 184.000 196.418 180.418 200.000 176.000 200.000 C 171.582 200.000 168.000 196.418 168.000 192.000 L 168.000 64.000 C 168.000 59.582 171.582 56.000 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 ZM 224.000 56.000 C 219.582 56.000 216.000 59.582 216.000 64.000 L 216.000 192.000 C 216.000 196.418 219.582 200.000 224.000 200.000 C 228.418 200.000 232.000 196.418 232.000 192.000 L 232.000 64.000 C 232.000 59.582 228.418 56.000 224.000 56.000 ZM 144.000 128.000 C 144.008 133.410 141.241 138.446 136.670 141.340 L 48.480 197.490 C 43.592 200.615 37.391 200.832 32.297 198.056 C 27.203 195.280 24.024 189.951 24.000 184.150 L 24.000 71.850 C 24.024 66.049 27.203 60.720 32.297 57.944 C 37.391 55.168 43.592 55.385 48.480 58.510 L 136.670 114.660 C 141.241 117.554 144.008 122.590 144.000 128.000 ZM 127.820 128.000 L 40.000 72.080 L 40.000 183.930 Z"),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
