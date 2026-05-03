package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorFillIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 200.000 C 227.995 213.899 217.796 225.691 204.043 227.697 C 190.289 229.704 177.146 221.318 173.170 208.000 L 72.000 208.000 C 45.490 208.000 24.000 186.510 24.000 160.000 C 24.000 133.490 45.490 112.000 72.000 112.000 L 168.000 112.000 C 181.255 112.000 192.000 101.255 192.000 88.000 C 192.000 74.745 181.255 64.000 168.000 64.000 L 72.000 64.000 C 67.582 64.000 64.000 60.418 64.000 56.000 C 64.000 51.582 67.582 48.000 72.000 48.000 L 168.000 48.000 C 190.091 48.000 208.000 65.909 208.000 88.000 C 208.000 110.091 190.091 128.000 168.000 128.000 L 72.000 128.000 C 54.327 128.000 40.000 142.327 40.000 160.000 C 40.000 177.673 54.327 192.000 72.000 192.000 L 173.170 192.000 C 177.146 178.682 190.289 170.296 204.043 172.303 C 217.796 174.309 227.995 186.101 228.000 200.000 Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
