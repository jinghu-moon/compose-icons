package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorFillIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 64.000 L 184.000 192.000 C 184.000 196.418 180.418 200.000 176.000 200.000 C 171.582 200.000 168.000 196.418 168.000 192.000 L 168.000 64.000 C 168.000 59.582 171.582 56.000 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 ZM 224.000 56.000 C 219.582 56.000 216.000 59.582 216.000 64.000 L 216.000 192.000 C 216.000 196.418 219.582 200.000 224.000 200.000 C 228.418 200.000 232.000 196.418 232.000 192.000 L 232.000 64.000 C 232.000 59.582 228.418 56.000 224.000 56.000 ZM 136.670 114.660 L 48.480 58.510 C 43.592 55.385 37.391 55.168 32.297 57.944 C 27.203 60.720 24.024 66.049 24.000 71.850 L 24.000 184.150 C 24.013 189.922 27.167 195.229 32.230 198.000 C 37.337 200.805 43.567 200.601 48.480 197.470 L 136.670 141.320 C 141.237 138.422 144.003 133.389 144.003 127.980 C 144.003 122.571 141.237 117.538 136.670 114.640 Z"),
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
