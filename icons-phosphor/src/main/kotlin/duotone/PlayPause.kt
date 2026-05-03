package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorDuotoneIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 132.370 134.590 L 44.180 190.740 C 41.756 192.295 38.678 192.409 36.146 191.039 C 33.613 189.668 32.025 187.030 32.000 184.150 L 32.000 71.850 C 32.025 68.970 33.613 66.332 36.146 64.961 C 38.678 63.591 41.756 63.705 44.180 65.260 L 132.370 121.410 C 134.628 122.840 135.997 125.327 135.997 128.000 C 135.997 130.673 134.628 133.160 132.370 134.590 Z"),
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
                pathData = parseSvgPathData("M 184.000 64.000 L 184.000 192.000 C 184.000 196.418 180.418 200.000 176.000 200.000 C 171.582 200.000 168.000 196.418 168.000 192.000 L 168.000 64.000 C 168.000 59.582 171.582 56.000 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 ZM 224.000 56.000 C 219.582 56.000 216.000 59.582 216.000 64.000 L 216.000 192.000 C 216.000 196.418 219.582 200.000 224.000 200.000 C 228.418 200.000 232.000 196.418 232.000 192.000 L 232.000 64.000 C 232.000 59.582 228.418 56.000 224.000 56.000 ZM 144.000 128.000 C 144.008 133.410 141.241 138.446 136.670 141.340 L 48.480 197.490 C 43.592 200.615 37.391 200.832 32.297 198.056 C 27.203 195.280 24.024 189.951 24.000 184.150 L 24.000 71.850 C 24.024 66.049 27.203 60.720 32.297 57.944 C 37.391 55.168 43.592 55.385 48.480 58.510 L 136.670 114.660 C 141.241 117.554 144.008 122.590 144.000 128.000 ZM 127.820 128.000 L 40.000 72.080 L 40.000 183.930 Z"),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
